package com.alticast.proj;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	/**
	 * REST : 'REpresentational State Transfer'의 약어로, 하나의 URL은 하나의 고유한 리소스를 대표하도록 설계한다는 개념.
	 * REST API : 외부에서 특정 URL을 통해서 사용자가 원하는 정보를 제공하는 방식.
	 * 					- 최근에 Open API에서 많이 사용되면서 REST 방식으로 제공되는 외부 연결 URL을 REST API라 하고, 
	 * 						REST 방식의 서비스 제공이 가능한 것을 'Restful'하다라고 표현함. 
	 * 
	 * 스프링 v3 부터 본격적으로 REST 방식의 처리를 지원. (@ResponseBody annotation 지원)
	 * 스프링 v4 에 들어와서는 컨트롤러 차원의 annotation 인, @RestController 가 본격적으로 소개 됨.
	 * 
	 * 스프링 3 까지는 컨트롤러에서 @Controller annotation을 사용해서 처리하고, 
	 * 	화면 처리를 담당하는 JSP가 아닌 데이터를 서비스하려면 해당 메소드가 리턴 타입에 @ResponseBody annotation을 추가하는 형태로 작성. 
	 */
	@RequestMapping(value = "/rest")
	@ResponseBody
	public String restApiStrTest() {
		return "Hello, Rest API !";
	}
	
}
