package com.bit.frame.service;

import org.apache.log4j.Logger;

public class UserService {
	Logger log = Logger.getLogger(this.getClass()); 
	int su;
	String msg;

	public int getSu() {
		return su;
	}

	public String getMsg() {
		return msg;
	}

	public void setSu(int su) {
		this.su = su;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String pringMsg() {
		System.out.println(msg + " 출력");
		return msg;
	}
	
	public void pringSu() {
		String[] arr = {"첫번째", "두번째"};
		System.out.println(arr[su]);
	}
}
