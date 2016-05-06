package com.test.bean;

import com.test.inter.Person;

public class NorthMan implements Person {
	private String like;
	

	public NorthMan() {
		eat();
	}

	public NorthMan(String like) {
		super();
		this.like = like;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("北方人喜欢吃面食");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("北方人喜欢喝酒");
	}
	public void likes()
	{
		System.out.println(like);
	}

}
