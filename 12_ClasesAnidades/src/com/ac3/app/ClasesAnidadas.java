package com.ac3.app;

enum Dias{
	//Constantes
}
public class ClasesAnidadas {
	String name;
	static int numero;
	enum Dias2{
		//Constantes
	}
	public ClasesAnidadas(String name) {
		super();
		this.name = name;
	}
	class Interna{
		String name;
		//ClasesAnidadas ca = new ClasesAnidadas("A");
		public Interna(String name) {
			super();
			this.name = name;
			numero++;
		}
		public Interna() {
			super();
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Interna-> Name=" + name;
		}
		
	}
    static class IntStatica{
		String nombre;
		int num;
		ClasesAnidadas ca = new ClasesAnidadas("A");
		public IntStatica() {
			super();
			//this.nombre = name;
			this.num = numero;
			m2();
			//m1();
			ca.m1();
		}
		
	}
	public static void main(String[] args) {
		ClasesAnidadas ca = new ClasesAnidadas("Clase A1");
		ClasesAnidadas.Interna cInt = ca.new Interna("Clase Interna");
		System.out.println(cInt.getName());
		// Instancia directa de nuestra clase anidada estandar
		ClasesAnidadas.Interna cInt2 = new ClasesAnidadas("Clase A2").new Interna("Clase 2");
		// Instancia directa de nuestra clase anidada estática
		ClasesAnidadas.IntStatica cIntStat = new ClasesAnidadas.IntStatica();
	}
	
	public void m1() {
		final int NUMERO = 19; // (effectively) final
			class InternaMetodo{
				int num;
	
				public InternaMetodo() {
					super();
					num = NUMERO;
				}
				
			}
		InternaMetodo im = new InternaMetodo();
		System.out.println(im.num);

	}
	public static void m2() {
	}
}
