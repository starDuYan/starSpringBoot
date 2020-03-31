package com.star.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.star.bean.factory.config.YamlConfigFactory;

import lombok.Data;

/**
*	@author duxing
*   @Date 2020-03-29 11:37:02
*/
@Data
@Configuration
@ConfigurationProperties(prefix = "star")
//@PropertySource("classpath:test.yml") 对yml 不直接支持，需特殊处理
@PropertySource(value = {"classpath:test.yml"},factory = YamlConfigFactory.class)
@Component
public class BlogConfigTestBean {
	private String name; 
	private Integer age;
	private String  nameAndAge;
}
