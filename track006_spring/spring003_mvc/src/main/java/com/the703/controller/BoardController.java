package com.the703.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

//<mvc : annotation-driven />    @Controller   ,   @RequestMapping("/basic.do")
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.the703.dto.BoardDto;
import com.the703.service.BoardService;
import com.the703.util.PagingUtil;

@Controller
public class BoardController {
//	<property name="prefix"  value="/view/"  />//  <property name="suffix"  value=".jsp"  />
	@Autowired BoardService service;
	
	// ※1. 전체리스트
//	@RequestMapping("/board/list.do")
//	public String list(Model model) { 
//	model.addAttribute("list", service.selectAll());
//		return "board/list"; 
//	}
		//  /view(folder)/   +  board(폴더)/list(파일명)    +   .jsp (확장자)
	    // 테스트 : http://localhost:8282/spring003_mvc/board/list.do
	
	@RequestMapping("/board/list.do")
	public String list(Model model, @RequestParam(value="pstartno" , defaultValue = "1") int pstartno) {
		
	model.addAttribute("paging" , new PagingUtil(service.selectCnt(), pstartno))	;
	model.addAttribute("list", service.select10(pstartno));
		return "board/list"; 
	}
	
	
	// ※2. 글쓰기 폼경로
	@RequestMapping( value="/board/write.do", method=RequestMethod.GET)
	public String write(Model model) { return "board/write"; }
	// 테스트 : http://localhost:8282/spring003_mvc/board/write.do
	
	// ※2. 글쓰기 기능
	@RequestMapping( value="/board/write.do", method=RequestMethod.POST)
	public String write_post(BoardDto dto, 
			@RequestParam("file") MultipartFile file,
			RedirectAttributes rttr) { String result = "글쓰기 실패";
	
	if(service.insert(dto, file) > 0) { result = "글쓰기 성공" ;}
	rttr.addFlashAttribute("result", result); // flash - 1번만 동작
	return  "redirect:/board/list.do"; }

	// ※3. 글 상세보기
	@RequestMapping("/board/detail.do")
	public String detail(int bno, Model model) { 
		model.addAttribute("dto", service.detail(bno));
		return "board/detail"; }
		//  /view(folder)/   +  board(폴더)/list(파일명)    +   .jsp (확장자)
	    // 테스트 : http://localhost:8282/spring003_mvc/board/detail.do

	// ※4. 글수정 폼 경로
	@RequestMapping(value= "/board/edit.do", method=RequestMethod.GET)
	public String edit(int bno, Model model) { //넘겨받는 bno, edit.jsp
		model.addAttribute("dto", service.detail(bno));
		return "board/edit"; }
		//  /view(folder)/   +  board(폴더)/list(파일명)    +   .jsp (확장자)
	    // 테스트 : http://localhost:8282/spring003_mvc/board/edit.do

	// ※4. 글수정 기능
	@RequestMapping(value= "/board/edit.do", method = RequestMethod.POST)
	public String edit_post(BoardDto dto,  
			@RequestParam("file") MultipartFile file, 
			RedirectAttributes rttr) { 
		// 알림창
		String result = " 비밀번호 확인!!";
		if(service.edit(dto, file) > 0 ) {result = "수정 성공!!" ;}
		rttr.addFlashAttribute("result", result);
		
		return "redirect:/board/detail.do?bno=" + dto.getBno();}

	// ※5. 글삭제 폼경로
	@RequestMapping(value= "/board/delete.do" , method = RequestMethod.GET )
	public String delete(int bno) { return "board/delete"; }
		//  /view(folder)/   +  board(폴더)/list(파일명)    +   .jsp (확장자)
	    // 테스트 : http://localhost:8282/spring003_mvc/board/delete.do
	
	// ※6. 글삭제 기능
	@RequestMapping(value= "/board/delete.do" , method = RequestMethod.POST )
	public String delete_post(BoardDto dto, RedirectAttributes rttr) { 
		//BoardDto dto = new BoardDto();  dto.setBno(bno);
		String result = "비밀번호 확인~!";
		if(service.delete(dto) > 0) { result = "삭제 성공~~!";}
		rttr.addFlashAttribute("result", result);
		
		return "redirect:/board/list.do"; }

}
/*
/board/list.do            /view/board/list.jsp 
/board/write.do           /view/board/write.jsp    (글쓰기폼)
/board/detail.do          /view/board/detailjsp    (상세보기)
/board/edit.do            /view/board/edit.jsp     (수정하기폼)
/board/delete.do          /view/board/delete.jsp   (삭제하기폼)
*/