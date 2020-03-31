package com.star.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
*	@author duxing
*   @Date 2020-03-28 22:34:02
*/
@Data
@Component
public class BlogProperties {
	@Value("${star.blog.name}")
	private String name; 
	@Value("${star.blog.age}")
	private Integer age;
}
