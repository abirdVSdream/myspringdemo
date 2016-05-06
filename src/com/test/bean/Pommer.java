package com.test.bean;

import com.test.inter.Pom;

public class Pommer implements Pom {

	private String work = "work hard";
	public Pommer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void rcite() {
		// TODO Auto-generated method stub
		System.out.println(work);
	}

}
