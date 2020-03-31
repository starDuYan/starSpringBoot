package com.star.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制器
*	@author duxing
*   @Date 2020-03-17 18:26:50
*/
@RestController
@EnableAutoConfiguration
public class starController {
	@RequestMapping("/test")
	public String test() {
		return "duxing 第一次测试";
	}
}
