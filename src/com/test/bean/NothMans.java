package com.test.bean;

import com.test.inter.Pom;

public class NothMans extends NorthMan
{
	private Pom pom;
	
	public NothMans()
	{
		//调用父类的无参构造方法时会自动调用子类的eat方法
		eat();
	}
	public NothMans(Pom pom) {
		super();
		this.pom = pom;
	}
	public NothMans(String like,Pom pom) {
		super(like);
		this.pom = pom;
	}
//覆盖父类的eat
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("北方人喜欢吃面食还喜欢吃米粉");
	}

	public void drink() {
		// TODO Auto-generated method stub
		super.drink();
		pom.rcite();
	}
}
