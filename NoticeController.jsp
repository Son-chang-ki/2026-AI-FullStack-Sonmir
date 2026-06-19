package com.sb.erp.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import com.breeze.erp.dto.NoticeDto; // 본인 프로젝트 패키지 경로에 맞게 변경

@Controller
@RequestMapping("/notice") // [필수 가이드] JSP의 'contextPath + /notice' 통합 루트 매핑
public class NoticeController {

    // @Autowired
    // private NoticeService noticeService; // 비즈니스 서비스 레이어 주입 예시

    /**
     * [기능 1] 새 공지사항 글 작성 처리
     * JSP의 openNewModal()에서 지정한 'form.action = contextPath + "/notice/insert"'를 수신합니다.
     */
    @PostMapping("/insert")
    public String insertNotice(@ModelAttribute NoticeDto notice,
                               @RequestParam(value="uploadFile", required=false) MultipartFile uploadFile,
                               HttpServletRequest request) {
        
        System.out.println("====== [백엔드] 새 공지 글 작성 진입 ======");
        System.out.println("카테고리: " + notice.getCategory() + " | 제목: " + notice.getBtitle());
        System.out.println("상단고정 유무(isPinned): " + notice.getIsPinned()); // 체크 시 1, 미체크 시 0

        // [첨부파일 처리] 파일이 전송되었을 경우
        if (uploadFile != null && !uploadFile.isEmpty()) {
            // 저장 경로 설정 (JSP의 다운로드 경로인 /upload/ 주소에 동기화)
            String savePath = request.getServletContext().getRealPath("/upload/");
            File folder = new File(savePath);
            if (!folder.exists()) folder.mkdirs(); // 디렉토리가 없으면 생성

            // 파일 이름 중복 유실 방지를 위한 UUID 변환 알고리즘 적용
            String originalName = uploadFile.getOriginalFilename();
            String ext = originalName.substring(originalName.lastIndexOf("."));
            String changeName = UUID.randomUUID().toString() + "_" + originalName;

            try {
                // 지정 경로에 물리 파일 저장
                uploadFile.transferTo(new File(savePath + File.separator + changeName));
                // DB에 파일명 기록을 위해 DTO에 변형 파일 이름 주입
                notice.setBfile(changeName); 
            } catch (IOException e) {
                System.out.println("파일 업로드 중 예외 발생: " + e.getMessage());
            }
        }

        // DB에 새 글을 저장하는 서비스 메서드 호출 (예시)
        // noticeService.insertNotice(notice);

        // 작성 완료 후 공지사항 리스트(목록) 페이지로 리다이렉트 처리합니다.
        return "redirect:/notice/list";
    }

    /**
     * [기능 2] 공지사항 글 수정 처리
     * JSP의 openEditModal(data)에서 지정한 'form.action = contextPath + "/notice/update"'를 수신합니다.
     * 수정 시에는 hidden 필드인 'bno'가 함께 전송됩니다.
     */
    @PostMapping("/update")
    public String updateNotice(@ModelAttribute NoticeDto notice,
                               @RequestParam(value="uploadFile", required=false) MultipartFile uploadFile,
                               HttpServletRequest request) {
        
        System.out.println("====== [백엔드] 공지 글 수정 진입 ======");
        System.out.println("수정할 대상 글번호(bno): " + notice.getBno());
        System.out.println("수정된 제목: " + notice.getBtitle());

        // [수정 시 새로운 첨부파일 처리]
        if (uploadFile != null && !uploadFile.isEmpty()) {
            String savePath = request.getServletContext().getRealPath("/upload/");
            String originalName = uploadFile.getOriginalFilename();
            String changeName = UUID.randomUUID().toString() + "_" + originalName;

            try {
                // (선택 사항) 기존에 업로드 되어있던 이전 파일을 디렉토리에서 찾아 삭제하는 로직 필요
                uploadFile.transferTo(new File(savePath + File.separator + changeName));
                notice.setBfile(changeName); // 새 파일명으로 갱신
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // DB 내용을 수정(Update)하는 서비스 메서드 호출 (예시)
        // noticeService.updateNotice(notice);

        // 수정 완료 후 목록으로 리다이렉트 처리
        return "redirect:/notice/list";
    }

    /**
     * [기능 3] 공지사항 상세 조회 비동기 API
     * JSP의 viewNotice(bno) 함수 내 fetch API 주소와 매핑됩니다.
     * @ResponseBody를 명시하여 데이터를 웹페이지가 아닌 JSON 문자열 본문으로 리턴합니다.
     */
    @ResponseBody
    @GetMapping(value="/detail", produces="application/json; charset=UTF-8")
    public NoticeDto detailNotice(@RequestParam("bno") int bno) {
        
        System.out.println("====== [백엔드] 비동기 상세조회 API 진입 ====== 글번호: " + bno);
        
        // 1. 상세 페이지 조회 시 조회수(bhit)를 1 올리는 서비스 로직 (예시)
        // noticeService.increaseHitCount(bno);
        
        // 2. DB에서 해당 글의 상세 정보 DTO를 가져옵니다. (예시)
        // NoticeDto detail = noticeService.getNoticeDetail(bno);
        
        /* * [테스트용 가상 더미 데이터 구성] 
         * DB 연동 완료 전 JavaScript 단에 뿌려지는 포맷을 검증하기 위한 더미입니다.
         * 실제 DB 연결 시 아래 블록을 지우고 위의 실제 Service 리턴 객체를 return 하시면 됩니다.
         */
        NoticeDto dummy = new NoticeDto();
        dummy.setBno(bno);
        dummy.setBtitle("서버에서 조회한 실시간 공지사항 제목입니다.");
        dummy.setBcontent("공지사항 세부 본문 영역 내용입니다.\nJSP 화면에 pre-wrap 속성이 있어 줄바꿈도 정상 출력됩니다.");
        dummy.set_author("최고관리자");
        dummy.setCreated_at("2026-06-19 12:00:00");
        dummy.setBhit(104);
        dummy.set_cat("보안");
        dummy.set_cat_color("red"); // JSP의 sb-badge--${n._cat_color} 템플릿에 red 주입
        dummy.setBfile("db930f7b-caef-4f11_보안지침서_v1.pdf"); // 파일 다운로드용 가상 파일 데이터
        
        // 객체를 반환하면 Jackson 프레임워크가 자동으로 { "bno": bno, "btitle": "..." } 형태의 JSON 문자열로 인코딩해 전송합니다.
        return dummy; 
    }
}