package com.jesse.study.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class TestConfigBean {

	public String getMyName() {
		return myName;
	}

	@Value("${myName}")
	private String myName;
	
	
}
