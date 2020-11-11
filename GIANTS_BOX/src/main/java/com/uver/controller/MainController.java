package com.uver.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("MainController")
public class MainController {
	private static final Logger LOG = LoggerFactory.getLogger(EventImgController.class);

	
	//--- 메인페이지로 이동
		@RequestMapping(value="main.do")
		public String goMain() {
			LOG.debug("-------------------");
			LOG.debug("main page()");
			LOG.debug("-------------------");
			
			//--- 추후 views 폴더에 main.jsp 페이지 설정
			return "index";
		}
		
	//--- 로그인 페이지로 이동
			@RequestMapping(value="login.do")
			public String goLogin() {
				LOG.debug("-------------------");
				LOG.debug("login()");
				LOG.debug("-------------------");
				
				//--- 추후 views 폴더에 main.jsp 페이지 설정
				return "login";
			}
			
	//--- 회원가입 페이지로 이동
	@RequestMapping(value="signup.do")
	public String goSignup() {
		LOG.debug("-------------------");
		LOG.debug("signup()");
		LOG.debug("-------------------");
		
		//--- 추후 views 폴더에 main.jsp 페이지 설정
		return "signup";
	}
	
	//--- 이벤트 view 페이지로 이동
	@RequestMapping(value="eventView.do")
	public String goEventView() {
		LOG.debug("-------------------");
		LOG.debug("eventView()");
		LOG.debug("-------------------");
		
		//--- 추후 views 폴더에 main.jsp 페이지 설정
		return "event_view";
	}
	
	//--- 이벤트 등록 페이지로 이동
	@RequestMapping(value="eventReg.do")
	public String goEventReg() {
		LOG.debug("-------------------");
		LOG.debug("eventReg()");
		LOG.debug("-------------------");
		
		//--- 추후 views 폴더에 main.jsp 페이지 설정
		return "event_reg";
	}
	
	//--- 로그인 후 이벤트 페이지로 이동
	@RequestMapping(value="mainUser.do")
	public String goMainUser() {
		LOG.debug("-------------------");
		LOG.debug("mainUser()");
		LOG.debug("-------------------");
		
		//--- 추후 views 폴더에 main.jsp 페이지 설정
		return "index_after_login";
	}
	
	
	
	

}
