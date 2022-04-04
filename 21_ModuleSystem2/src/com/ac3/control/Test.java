package com.ac3.control;

import com.ac3.core.Invoice;
import com.ac3.utils.*;

public class Test {

	public static void main(String[] args) {
		Invoice in1 = new Invoice();
		in1.setAmount(1200);
		System.out.println(in1.getAmount());
		System.out.println(IVAUtility.calculateIVA(100));

	}

}
