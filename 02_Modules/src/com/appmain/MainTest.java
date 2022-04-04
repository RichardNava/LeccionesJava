package com.appmain;

import com.modules.testM;

public class MainTest {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testM tm = new testM();
		tm.setId(15.5);
		System.out.println(testM.getId());
		testM.incrementId(15.5);
		System.out.println(testM.getId());
	}

}
