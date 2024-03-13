package com.cyb;

public class RunnableClass implements Runnable{

	public RunnableClass() {
	}
	public void run() {
		int i = 0;
		while(i<100) {
			System.out.println(i);
			i++;
		}
	}
}
