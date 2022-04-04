package com.ac3.app;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EjemploNIO {

	public static void main(String[] args) {

		// Opción 1 para crear un Path
		Path pt = Path.of("data.txt");
		System.out.println(pt);
		// Opción 2 para crear un Path
		Path pt2 = Paths.get("D:/temp3/edit/v4/data.txt");
		System.out.println(pt2.getFileName());
		System.out.println(pt2.getName(1));
		System.out.println(pt2.getNameCount());
		/*
		 * String string = "d:\\"; for (int i = 0; i < pt2.getNameCount(); i+=2) {
		 * string += pt2.getName(i)+"\\"; } System.out.println(string);
		 */

		Path pt3 = Path.of("D:\\temp\\.\\..\\texto.txt"); // Absoluta
		Path pt4 = Path.of("texto2.txt"); // Relativa
		System.out.println(pt3.resolve(pt4));
		pt4 = pt4.toAbsolutePath();
		System.out.println(pt4);
		System.out.println(pt3.relativize(pt4));
		Path pt5 = Path.of("D:\\temp\\..\\cosas\\relativo\\texto2.txt");
		System.out.println(pt3.relativize(pt5));
		System.out.println(pt3.normalize());
		Path pt6 = Path.of("C:/temp/data.txt");
		Scanner sc = new Scanner(System.in);
		try {
			//Files.createDirectories(pt2);
			//Files.writeString(pt, "\nnueva cosa", Charset.forName("UTF-8"), StandardOpenOption.APPEND);
			//Files.writeString(pt6, "Prueba", Charset.forName("UTF-8"), StandardOpenOption.CREATE);
			//Files.readAllLines(pt).forEach(System.out::println);
			/*
			int count = 1;
			for (var p : Files.readAllLines(pt)) {
				System.out.println(p+" linea "+ count );
				count++;
			}
			*/
			//System.out.println(Files.readString(pt) + " cosa");
			//Files.lines(pt).filter(s -> s.startsWith("nueva")).skip(1).forEach(System.out::println);
			//Files.delete(pt6);
			//Files.copy(pt6, pt);
			Files.move(pt2, pt6, StandardCopyOption.REPLACE_EXISTING);
		} catch (NoSuchFileException e) {
			System.out.println("El archivo que intenta eliminar no existe. Lo voy a crear.");
			try {
				Files.createFile(pt6);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} catch (FileAlreadyExistsException e) {
			System.out.println("El archivo existe. ¿Quiere sobrescribirlo? (Y/N)");
			switch (sc.next().toUpperCase()) {
			case "Y":
				try {
					Files.copy(pt6, pt, StandardCopyOption.REPLACE_EXISTING);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				break;
			default:
				break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
