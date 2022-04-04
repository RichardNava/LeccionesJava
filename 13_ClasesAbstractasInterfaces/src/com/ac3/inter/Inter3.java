package com.ac3.inter;

public interface Inter3 {
		int NUM = 10;
	 default void girar(int num) {
		 System.out.println("INTER3 "+ num);
	 }
}
