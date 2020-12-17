

package com.jesse.study.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestMain {
	
	@RequestMapping("/")
	public String index(){
		return "Greeting from Spring boot";
	}
}
