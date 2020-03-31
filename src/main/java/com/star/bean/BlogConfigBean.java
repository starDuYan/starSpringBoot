package com.star.bean;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
*	@author duxing
*   @Date 2020-03-29 11:37:02
*/
@Data
@ConfigurationProperties(prefix = "star.blog")
@Component
public class BlogConfigBean {
	private String name; 
	private Integer age;
	private String  nameAndAge;
}
