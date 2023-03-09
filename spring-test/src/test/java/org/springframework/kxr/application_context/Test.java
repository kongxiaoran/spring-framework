package org.springframework.kxr.application_context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: kongxr
 * @Date: 2023-02-28 15:22
 * @Description:
 * 熟悉 Spring应用上下文
 */
@Configuration
@ComponentScan
public class Test {

	public static void main(String[] args) {
		//1.创建spring上下文
		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(Test.class);
//		//2.上下文中注册bean
//		configApplicationContext.register(Test.class);
		//3.刷新spring上下文，内部会启动spring上下文
		configApplicationContext.refresh();
		//4.关闭spring上下文
		System.out.println("stop ok!");
	}
}
