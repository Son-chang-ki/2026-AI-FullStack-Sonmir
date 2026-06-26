<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!doctype html>
<html lang="ko">
<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>공지 관리 · SBerp</title>
  
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/pretendard@1.3.9/dist/web/static/pretendard.min.css" />
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" />
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.css" />
  
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/app.css" />
  
  <style>
    /* 공지사항 테이블 행 디자인 */
    .ntc-row { display:flex; align-items:center; gap:14px; padding:15px 18px; border-bottom:1px solid var(--sb-border); cursor:pointer; transition:background .1s; }
    .ntc-row:hover { background:#f8fafc; }
    .ntc-row:last-child { border-bottom:none; }
    .ntc-pin { color:var(--sb-amber); font-size:14px; }
    
    /* 카테고리 필터용 상단 칩 버튼 디자인 */
    .cat-chip { display:inline-flex; align-items:center; gap:6px; padding:7px 13px; border-radius:99px; font-size:13px; font-weight:600; cursor:pointer; border:1px solid var(--sb-border); background:#fff; color:var(--sb-ink-soft); }
    .cat-chip.active { background:var(--sb-accent); color:#fff; border-color:var(--sb-accent); }
  </style>
</head>
<body data-page="notices">
  <div class="sb-app" data-layout="standard">
    <aside class="sb-sidebar" id="sbSidebar"></aside>
    <div class="sb-main">
      <header class="sb-header" id="sbHeader"></header>
      <nav class="sb-topbar" id="sbTopbar"></nav>
      
      <main class="sb-content">
        <div class="sb-page-head">
          <div class="sb-page-head__txt">
            <div class="sb-breadcrumb"><a href="#">홈</a> <i class="bi bi-chevron-right"></i> 업무 <i class="bi bi-chevron-right"></i> 공지 관리</div>
            <h1>공지 관리</h1>
            <p>전사 공지사항을 게시하고 카테고리별로 관리합니다.</p>
          </div>
          <div class="sb-page-head__actions">
            <button class="btn btn-sb btn-sm" id="ntcNew" onclick="openNewModal()"><i class="bi bi-megaphone"></i> 공지 작성</button>
          </div>
        </div>

        <div class="d-flex gap-2 flex-wrap mb-3" id="catChips">
          <button class="cat-chip active" data-cat="all"><i class="bi bi-grid"></i> 전체</button>
          <button class="cat-chip" data-cat="인사"><span class="sb-dot" style="background:var(--sb-accent)"></span> 인사</button>
          <button class="cat-chip" data-cat="보안"><span class="sb-dot" style="background:var(--sb-red)"></span> 보안</button>
          <button class="cat-chip" data-cat="IT"><span class="sb-dot" style="background:var(--sb-violet)"></span> IT</button>
          <button class="cat-chip" data-cat="복지"><span class="sb-dot" style="background:var(--sb-green)"></span> 복지</button>
          <button class="cat-chip" data-cat="일반"><span class="sb-dot" style="background:#9aa3b1"></span> 일반</button>
        </div>

        <div class="sb-card">
          <div class="sb-toolbar">
            <strong style="font-size:14px">공지 목록</strong>
            <span class="sb-badge sb-badge--gray" id="ntcCount">${notices.size()}건</span>
            <div class="grow"></div>
            <div class="sb-field sb-field--search">
              <i class="bi bi-search"></i>
              <input type="text" id="ntcSearch" placeholder="제목 검색">
            </div>
            <div class="sb-field">
              <select id="ntcSort">
                <option value="new">최신순</option>
                <option value="views">조회순</option>
              </select>
            </div>
          </div>
          
          <div id="ntcList">
            <c:if test="${empty notices}">
              <div class="sb-empty" id="ntcEmpty">
                <i class="bi bi-megaphone"></i>
                <p>등록된 공지사항이 존재하지 않습니다.</p>
              </div>
            </c:if>
            
            <c:forEach var="n" items="${notices}">
              <div class="ntc-row" 
                   data-id="${n.bno}" 
                   data-cat="${n._cat}" 
                   data-title="${n.btitle}" 
                   data-views="${n.bhit}" 
                   onclick="viewNotice(${n.bno})">
                
                <c:choose>
                  <c:when test="${n._pinned == 1}">
                    <i class="bi bi-pin-angle-fill ntc-pin"></i>
                  </c:when>
                  <c:otherwise>
                    <i class="bi bi-pin-angle" style="color:var(--sb-ink-faint); font-size:14px; opacity:.4"></i>
                  </c:otherwise>
                </c:choose>
                
                <span class="sb-badge sb-badge--${n._cat_color}">${n._cat}</span>
                
                <div style="flex:1; min-width:0">
                  <div style="font-weight:600; font-size:14px; white-space:nowrap; overflow:hidden; text-overflow:ellipsis">
                    <c:if test="${n._pinned == 1}">
                      <span class="sb-badge sb-badge--amber me-1" style="padding:1px 6px">중요</span>
                    </c:if>
                    <c:out value="${n.btitle}"/>
                  </div>
                  <div class="text-faint" style="font-size:12px; margin-top:2px">
                    ${n._author} · <fmt:formatDate value="${n.created_at}" pattern="yyyy-MM-dd"/>
                  </div>
                </div>
                
                <div class="text-faint d-none d-md-flex align-items-center gap-1" style="font-size:12.5px">
                  <i class="bi bi-eye"></i> <fmt:formatNumber value="${n.bhit}" type="number"/>
                </div>
                <i class="bi bi-chevron-right text-faint"></i>
              </div>
            </c:forEach>
          </div>
        </div>
      </main>
      
      <footer class="sb-footer" id="sbFooter"></footer>
    </div>
  </div>

  <div class="modal fade" id="noticeDetailModal" tabindex="-1" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered modal-lg">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="mdTitle">공지 로딩 중...</h5>
          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
        </div>
        <div class="modal-body">
          <div class="d-flex flex-wrap align-items-center gap-2 mb-3">
            <span id="mdCatBadge"></span>
            <span id="mdPinnedBadge"></span>
            <span class="text-faint ms-auto" style="font-size:12.5px">
              <i class="bi bi-person"></i> <span id="mdAuthor"></span> · 
              <i class="bi bi-calendar3"></i> <span id="mdDate"></span> · 
              <i class="bi bi-eye"></i> <span id="mdHit"></span>
            </span>
          </div>
          <div id="mdContent" style="font-size:14px; line-height:1.8; color:var(--sb-ink); min-height:150px; white-space:pre-wrap;"></div>
          
          <div class="sb-divider"></div>
          
          <div id="mdFileArea" class="d-flex align-items-center gap-3 text-faint" style="font-size:13px">
            <span><i class="bi bi-paperclip"></i> 첨부파일</span>
            <a id="mdFileLink" href="#" download class="d-inline-flex align-items-center gap-1" style="background:#fafbfc; border:1px solid var(--sb-border); border-radius:7px; padding:4px 10px; color:inherit; text-decoration:none;">
              <i class="bi bi-file-earmark-arrow-down" style="color:var(--sb-accent)"></i> <span id="mdFileName">파일명.ext</span>
            </a>
          </div>
        </div>
        <div class="modal-footer">
          <button class="btn btn-ghost" data-bs-dismiss="modal">닫기</button>
          <button class="btn btn-sb" data-bs-dismiss="modal"><i class="bi bi-check2"></i> 확인</button>
        </div>
      </div>
    </div>
  </div>

  <div class="modal fade" id="noticeFormModal" tabindex="-1" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered modal-lg">
      <div class="modal-content">
        <form id="noticeRegForm" action="${pageContext.request.contextPath}/notice/insert.do" method="POST" enctype="multipart/form-data">
          <input type="hidden" name="emp_id" value="1001" />
          <input type="hidden" name="com_id" value="1" />
          
          <div class="modal-header">
            <h5 class="modal-title">공지 작성</h5>
            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
          </div>
          <div class="modal-body">
            <div class="row g-3">
              <div class="col-md-4">
                <label class="sb-form-label">카테고리 구분</label>
                <select class="form-select" name="category" id="nnCat">
                  <option value="인사">인사</option>
                  <option value="보안">보안</option>
                  <option value="IT">IT</option>
                  <option value="복지">복지</option>
                  <option value="일반" selected>일반</option>
                </select>
              </div>
              <div class="col-md-8">
                <label class="sb-form-label">제목</label>
                <input type="text" class="form-control" name="btitle" id="nnTitle" placeholder="공지 사항의 핵심 제목을 입력하세요." required />
              </div>
              <div class="col-12">
                <label class="sb-form-label">공지 내용 본문</label>
                <textarea class="form-control" name="bcontent" rows="6" id="nnBody" placeholder="전사에 공지할 본문 텍스트를 작성하세요." required></textarea>
              </div>
              <div class="col-12">
                <label class="sb-form-label">파일 업로드</label>
                <input type="file" class="form-control" name="uploadFile" id="nnFile" />
              </div>
              <div class="col-12 d-flex align-items-center gap-2">
                <input type="checkbox" id="nnPin" name="isPinned" value="1" style="width:16px; height:16px; accent-color:var(--sb-accent);" />
                <span style="font-size:13.5px; font-weight: 500;">상단 고정 등록하기 (리스트 최상단 강제 배치용 플래그)</span>
              </div>
            </div>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-ghost" data-bs-dismiss="modal">취소</button>
            <button type="submit" class="btn btn-sb"><i class="bi bi-megaphone"></i> 게시하기</button>
          </div>
        </form>
      </div>
    </div>
  </div>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
  <script>
    // 컨텍스트 루트 경로 자바스크립트 전역 공유 변수 선언
    const contextPath = "${pageContext.request.contextPath}";
    let detailModalObj, formModalObj;

    document.addEventListener("DOMContentLoaded", function () {
      // 부트스트랩 모달 프로그램 객체 초기 생성 및 인스턴스 저장
      detailModalObj = new bootstrap.Modal(document.getElementById('noticeDetailModal'));
      formModalObj = new bootstrap.Modal(document.getElementById('noticeFormModal'));

      // 퍼블리셔가 구성한 카테고리 필터 칩, 검색창, 정렬 셀렉터 DOM 바인딩
      const catChips = document.getElementById("catChips");
      const searchInput = document.getElementById("ntcSearch");
      const sortSelect = document.getElementById("ntcSort");
      const rows = Array.from(document.querySelectorAll(".ntc-row"));

      // 픅론트엔드 연동용 실시간 클라이언트 사이드 필터 및 정렬 서브 함수
      function filterAndSortEngine() {
        const activeCat = catChips.querySelector(".cat-chip.active").dataset.cat;
        const keyword = searchInput.value.trim().toLowerCase();
        const sortBy = sortSelect.value;
        let showCount = 0;

        rows.forEach(row => {
          const isCatMatch = (activeCat === 'all' || row.dataset.cat === activeCat);
          const isTitleMatch = row.dataset.title.toLowerCase().includes(keyword);

          if (isCatMatch && isTitleMatch) {
            row.style.display = "flex";
            showCount++;
          } else {
            row.style.display = "none";
          }
        });

        // 결과 건수 바벨 플러그인 갱신
        document.getElementById("ntcCount").textContent = showCount + "건";

        // DOM 재배치를 활용한 실시간 정렬
        const container = document.getElementById("ntcList");
        rows.sort((a, b) => {
          if (sortBy === 'views') {
            return parseInt(b.dataset.views) - parseInt(a.dataset.views); // 조회수 내림차순
          } else {
            return parseInt(b.dataset.id) - parseInt(a.dataset.id); // 글번호(bno) 내림차순 (최신순)
          }
        }).forEach(item => container.appendChild(item));
      }

      // 이벤트 리스너 통합 바인딩
      catChips.addEventListener("click", (e) => {
        const btn = e.target.closest(".cat-chip");
        if (!btn) return;
        catChips.querySelectorAll(".cat-chip").forEach(x => x.classList.remove("active"));
        btn.classList.add("active");
        filterAndSortEngine();
      });

      searchInput.addEventListener("input", filterAndSortEngine);
      sortSelect.addEventListener("change", filterAndSortEngine);
    });

    // 💡 비동기(AJAX/Fetch) 공지사항 세부 데이터 렌더링 요청 함수
    function viewNotice(bno) {
      if (!bno) return;
      
      // Spring Controller단으로 JSON 데이터를 받기 위한 경로 호출 (.do 패턴 준수 혹은 RestController 주소 호환)
      fetch(contextPath + "/notice/detail.do?bno=" + bno)
        .then(response => {
          if(!response.ok) throw new Error("서버 통신 장애");
          return response.json();
        })
        .then(data => {
          // 응답받은 DTO 객체의 필드를 모달 팝업 엘리먼트에 바인딩
          document.getElementById("mdTitle").textContent = data.btitle;
          document.getElementById("mdContent").textContent = data.bcontent;
          document.getElementById("mdAuthor").textContent = data._author || "경영지원팀";
          document.getElementById("mdDate").textContent = data.created_at ? data.created_at.substring(0, 10) : "";
          document.getElementById("mdHit").textContent = data.bhit;
          
          // 동적 카테고리 스타일 뱃지 처리
          const badge = document.getElementById("mdCatBadge");
          badge.className = "sb-badge sb-badge--" + (data._cat_color || 'gray');
          badge.textContent = data._cat || '일반';

          // 첨부파일 영역 노출/비노출 분기 핸들링
          const fileArea = document.getElementById("mdFileArea");
          if (data.bfile && data.bfile.trim() !== "") {
            fileArea.style.display = "flex";
            // UUID 필터링 후 순수 파일명만 슬라이싱하여 표기
            const pureFileName = data.bfile.substring(data.bfile.lastIndexOf("_") + 1);
            document.getElementById("mdFileName").textContent = pureFileName;
            document.getElementById("mdFileLink").href = contextPath + "/notice/download.do?bno=" + data.bno;
          } else {
            fileArea.style.display = "none";
          }

          // 완성된 부트스트랩 모달창 트리거 활성화
          detailModalObj.show();
          
          // 화면 전환 없이 UI 조회수 수치 동적 업데이트 보정 가공
          const listRow = document.querySelector(`.ntc-row[data-id="${bno}"]`);
          if(listRow) {
            const curViews = parseInt(listRow.dataset.views) + 1;
            listRow.dataset.views = curViews;
            const eyeBadge = listRow.querySelector(".bi-eye").nextSibling;
            if(eyeBadge) eyeBadge.textContent = " " + curViews;
          }
        })
        .catch(error => {
          alert("데이터를 가져오는 중 문제가 발생했습니다.");
          console.error(error);
        });
    }

    // 작성 모달 오픈 래퍼 유틸
    function openNewModal() {
      // 폼 초기화 후 표출
      document.getElementById("noticeRegForm").reset();
      formModalObj.show();
    }
  </script>
</body>
</html>