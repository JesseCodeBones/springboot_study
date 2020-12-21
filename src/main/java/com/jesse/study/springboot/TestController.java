package com.jesse.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping("/hello")
	public String helloPage(){
		return "index";
	}
}
