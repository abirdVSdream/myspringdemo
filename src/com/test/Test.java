package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.test.bean.NorthMan;
import com.test.bean.NothMans;
import com.test.bean.SouthMan;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		NorthMan n =(NorthMan) ac.getBean("north");
		n.eat();
		n.drink();
		n.likes();
		SouthMan s = (SouthMan) ac.getBean("south");
		s.eat();
		s.drink();
		s.likes();
		NothMans ns =(NothMans) ac.getBean("norths");
		ns.drink();
		ns.likes();
		NothMans nms = new NothMans();
		

	}

}
