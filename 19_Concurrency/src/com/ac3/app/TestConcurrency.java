package com.ac3.app;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CyclicBarrier;

public class TestConcurrency {

	public static void main(String[] args) {
		List<Integer> list = new CopyOnWriteArrayList<>();
		CyclicBarrier barrier = new CyclicBarrier(3,() ->{
			System.out.println(list.stream()
					.peek(System.out::println)
					.mapToInt(n -> n)
					.sum());
		});
		for (int i = 1; i <= 3; i++) {
			new Thread(new Lector(barrier,list,new File("").getAbsolutePath().toString()+"\\src\\com\\ac3\\app\\numbers"+i+".txt")).start();
		}
	}

}

class Lector implements Runnable{ // Versión con implementación
	CyclicBarrier barrier;
	List<Integer> list;
	String url;
	
	public Lector(CyclicBarrier barrier, List<Integer> list, String url) {
		super();
		this.barrier = barrier;
		this.list = list;
		this.url = url;
	}

	@Override
	public void run() {
		try {
			Files.lines(Path.of(url))
				 .forEach(n -> list.add(Integer.parseInt(n)));
			System.out.println(url.substring(url.length()-13, url.length())+" pasa a modo de espera");
			barrier.await();
		} catch (IOException | InterruptedException | BrokenBarrierException  e) {
			e.printStackTrace();
		}
	}
	
}