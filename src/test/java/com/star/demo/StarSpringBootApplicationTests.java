package com.star.demo;

import java.util.Random;

import org.apache.ibatis.javassist.expr.NewArray;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StarSpringBootApplicationTests {

	@Test
	void contextLoads() {
		System.out.println(new Random().nextDouble());
		System.out.println(new Random().nextInt(100));
		System.out.println(new Random().nextInt(8888));
	}

}
