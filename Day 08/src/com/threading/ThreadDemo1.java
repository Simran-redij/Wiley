package com.threading;

public class ThreadDemo1 extends Thread implements Runnable{

	// implicitly invoked when the thread executes
	public void run() {
		System.out.println("ThreadDemo1 is executed");
		System.out.println(Thread.currentThread());
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId());
		
		ThreadDemo1 demo1 = new ThreadDemo1();
		ThreadDemo1 demo2 = new ThreadDemo1();
		ThreadDemo1 demo3 = new ThreadDemo1();
		
		// demo1.setName("My thread");
		// demo1.run();
		demo1.start(); //thread-0
		demo2.start(); //thread-1
		demo3.start(); //thread-2
		
		Thread t1 = new Thread();
		

	}

}
