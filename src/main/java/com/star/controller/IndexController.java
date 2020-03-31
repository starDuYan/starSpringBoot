package com.star.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.star.bean.BlogConfigBean;
import com.star.bean.BlogConfigTestBean;
import com.star.bean.BlogProperties;

/**
*	@author duxing
*   @Date 2020-03-28 22:24:55
*   测试配置信息
*/
@RestController
@EnableAutoConfiguration
public class IndexController {
	
	@Autowired
	private BlogProperties blog;
	@Autowired
	private BlogConfigBean config;
	@Autowired
	private BlogConfigTestBean configTest;
	
	
	@RequestMapping("/index111")
	public String index111() {
//		return config.getName()+config.getAge()+"---"+config.getNameAndAge();
//		return configTest.getName()+configTest.getAge()+"-stardu--"+configTest.getNameAndAge();
		return "";
	}
}
