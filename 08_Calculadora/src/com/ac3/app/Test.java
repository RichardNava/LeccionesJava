package com.ac3.app;

import java.util.Scanner;
import com.ac3.tools.CalcFunctions;

public class Test{

	public static void main(String[] args) {
		var calc = new CalcFunctions();
		var sc = new Scanner(System.in);

		while (calc.showOp(sc)){ }
		
		/*
		boolean cond=true;
		while (cond){ 
			cond = calc.showOp(sc);
		}
		*/
		sc.close();
	}

}
