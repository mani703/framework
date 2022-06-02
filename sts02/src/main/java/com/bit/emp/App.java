package com.bit.emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.emp.model.EmpVo;

public class App {

	public static void main(String[] args) {
		ApplicationContext ac = null;
		ac = new ClassPathXmlApplicationContext("/applicationContext.xml");
		EmpVo bean = (EmpVo) ac.getBean("bean");
		
		System.out.println(bean);
	}

}
