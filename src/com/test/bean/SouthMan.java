package com.test.bean;

import com.test.inter.Person;
import com.test.inter.Pom;

public class SouthMan implements Person {
	private String like;
	private Pom pom;
	
	public Pom getPom() {
		return pom;
	}

	public void setPom(Pom pom) {
		this.pom = pom;
	}

	public String getLike() {
		return like;
	}

	public void setLike(String like) {
		this.like = like;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("南方人喜欢吃米饭");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("南方人喜欢喝茶");
	}
	public void likes()
	{
		pom.rcite();
		System.out.println(like);
	}

}
