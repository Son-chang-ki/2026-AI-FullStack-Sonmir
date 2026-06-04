package com.the703.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

//<mvc : annotation-driven />    @Controller   ,   @RequestMapping("/basic.do")
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class BoardController {
//	<property name="prefix"  value="/view/"  />
//  <property name="suffix"  value=".jsp"  />
	
	@RequestMapping("/board/list.do")
	public String list(Model model) { return "board/list"; }
		//  /view(folder)/   +  board(폴더)/list(파일명)    +   .jsp (확장자)
	    // 테스트 : http://localhost:8282/spring003_mvc/view/board/list.do
	
	@RequestMapping("/board/write.do")
	public String write(Model model) { return "board/write"; }
		//  /view(folder)/   +  board(폴더)/list(파일명)    +   .jsp (확장자)
	    // 테스트 : http://localhost:8282/spring003_mvc/view/board/write.do
	
	@RequestMapping("/board/detail.do")
	public String detail(Model model) { return "board/detail"; }
		//  /view(folder)/   +  board(폴더)/list(파일명)    +   .jsp (확장자)
	    // 테스트 : http://localhost:8282/spring003_mvc/view/board/detail.do
	
	@RequestMapping("/board/edit.do")
	public String edit(Model model) { return "board/edit"; }
		//  /view(folder)/   +  board(폴더)/list(파일명)    +   .jsp (확장자)
	    // 테스트 : http://localhost:8282/spring003_mvc/view/board/edit.do
	
	@RequestMapping("/board/delete.do")
	public String delete(Model model) { return "board/delete"; }
		//  /view(folder)/   +  board(폴더)/list(파일명)    +   .jsp (확장자)
	    // 테스트 : http://localhost:8282/spring003_mvc/view/board/delete.do

}
/*
/board/list.do            /view/board/list.jsp 
/board/write.do           /view/board/write.jsp    (글쓰기폼)
/board/detail.do          /view/board/detailjsp    (상세보기)
/board/edit.do            /view/board/edit.jsp     (수정하기폼)
/board/delete.do          /view/board/delete.jsp   (삭제하기폼)

*/