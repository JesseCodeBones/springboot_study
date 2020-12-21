

package com.jesse.study.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestMain {
	
	@Autowired
	private TestConfigBean testConfigBean;
	
	@RequestMapping("/")
	public String index(){

		System.out.println(testConfigBean.getMyName());
		return "Greeting from Spring boot";
	}


	
}
