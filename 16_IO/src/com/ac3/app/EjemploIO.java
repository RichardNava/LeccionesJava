package com.ac3.app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2320977342434761482L;
	private int id;
	private String name;
	private boolean isAdult;
	
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public User(int id, String name, boolean isAdult) {
		this.id = id;
		this.name = name;
		this.isAdult = isAdult;
	}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public boolean isAdult() {
		return isAdult;
	}
	
}

public class EjemploIO {

	public static void main(String[] args) {
		User[] users = { new User(1, "Leire"), new User(2, "Lidia"), new User(3, "Lucia") };

		String dir = "C:/temp/test.txt";
		try (FileWriter out = new FileWriter(dir); BufferedWriter bw = new BufferedWriter(out)) {
			for (User user : users) {

				bw.write(user.getId() + " " + user.getName());
				bw.newLine();

				/*
				 * out.write(user.getId() + " " + user.getName());
				 */
			}
		} catch (IOException e) {
			System.out.println(e);
		}

		try (FileReader in = new FileReader(dir); BufferedReader br = new BufferedReader(in)) {
			String line = "";
			while ((line = br.readLine()) != null) { // line = "1 Ramon"
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println(e);
		}

		String dir2 = "C:/temp/users.obj";
		User u1 = new User(5, "Roberto", true);
		
		try (FileOutputStream fos = new FileOutputStream(dir2); ObjectOutputStream out = new ObjectOutputStream(fos)) {
			out.writeObject(u1);
		} catch (Exception e) {
			System.out.println(e);
		} 

		User u = null;
		try (var fis = new FileInputStream(dir2); var in = new ObjectInputStream(fis)) {
			u = (User) in.readObject();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(u.getId() + " " + u.getName()+" "+u.isAdult());
	}

}
