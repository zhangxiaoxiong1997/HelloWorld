package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.IBankService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("/applicationContext.xml");
		IBankService service = (IBankService) ac.getBean("BankServiceImpl");
		service.zhuanzhang();
		System.out.println("×ªÕË³É¹¦£¡£¡");
	}
}
