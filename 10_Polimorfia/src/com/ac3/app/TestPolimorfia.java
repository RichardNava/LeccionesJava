package com.ac3.app;

import java.util.Scanner;

class A{
	int id = 10;
	void move() {
		System.out.println("Me muevo en A");
	}
}

class B extends A{
	int id = 20;
	@Override
	void move() {
		System.out.println("Me muevo en B");
	}
	void B1() {
		System.out.println("Método B1"+id);
	}
}
class C extends A{
	String saludo;
	@Override
	void move() {
		System.out.println("Me muevo en C");
	}
	void C1() {
		System.out.println("Metodo C1"+saludo);
	}
}
public class TestPolimorfia {

	public static void main(String[] args) {
		A a = new A(); // En memoria existe A
		B b = new B(); // En memoria existe B
		C c = new C();
		System.out.println(a.id+" "+b.id+" "+c.id);
		A a2 = new B();
		A a3 = new C();
		System.out.println(a.id+" "+a2.id);
		a.move();
		a2.move();
		a3.move();
		//a.move();
		//b.id = 10;
		//b.move();
		//a = b; // En memoria dos objetos señalan a B y la referencia de A se pierde (Garbage Collector la limpia)
		//a.move();
		/*
		Object c = new B();
		((B) c).move();
		*/
		
		/*
		B[] arrayB = new B[2];	arrayB[0]=b;
		C[] arrayC = new C[2];	arrayC[0]=c;	
		createObject(arrayB);
		createObject(arrayC);
		for (B b2 : arrayB) System.out.println(b2.id);	
		for (C c2 : arrayC) System.out.println(c2.saludo);
		*/
		
	}
	public static A[] createObject(A[] objArray) {
		Scanner sc = new Scanner(System.in);
		if (objArray[0] instanceof B) {
			System.out.println("Introduce el ID");
			int id = sc.nextInt();
			B b = new B();
			b.id = id;
			objArray[objArray.length-1] = b; // obJArray.add(b);
			b.B1();
		}
		else if (objArray[0] instanceof C) {
			System.out.println("Introduce el saludo");
			String saludo = sc.next();
			C c = new C();
			c.saludo = saludo;
			objArray[objArray.length-1] = c;
			c.C1();
		}
		return objArray;
	}
}
