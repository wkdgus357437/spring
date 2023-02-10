package com.controller;

import javax.servlet.annotation.WebServlet;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	
	@RequestMapping(value = "/hello.do", method = RequestMethod.GET)
	public ModelAndView hello() { //사용자가 만든 콜백(init(), doget(), dopost(), destroy()) 메소드
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", "honghonghong!!!!!!!");
		//mav.setViewName("hello"); //=> /view/hello.jsp
		mav.setViewName("/WEB-INF/view/hello"); //=> /view/hello.jsp
		
		return mav;
	}
	@RequestMapping(value = "/hello2.do", method = RequestMethod.GET, produces = "text/html; charset=utf-8")
	@ResponseBody
	public String hello2() {
		return "환영합니다.";//스프링에서는 리턴타입이 String이면 단순문자열이 아니라 , 파일명으로 인식한다.
		// 스프링은 Welcome.jsp파일을 찾는다.(에러)
		// 만약 단순 문자열로 웹에 띄우려면 @ResponseBody 어노테이션을 추가한다.
		//produces = "text/html; charset=utf-8"  :poset방식으로 보낼때 한글처리
	}

}
