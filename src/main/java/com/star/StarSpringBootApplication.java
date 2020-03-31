package com.star;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.star.bean.BlogConfigBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 程序主入口
 * @author duxing
 *
 */


@SpringBootApplication
public class StarSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarSpringBootApplication.class, args);
	}

}
