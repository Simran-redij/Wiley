package com.threading;

public class ExampleOfDaemonThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleOfDaemonThread thread1 = new ExampleOfDaemonThread();
		thread1.setName("Thread1");
		ExampleOfDaemonThread thread2 = new ExampleOfDaemonThread();
		thread2.setName("Thread2");
		ExampleOfDaemonThread thread3 = new ExampleOfDaemonThread();
		thread3.setName("Thread3");
		
		thread1.setDaemon(true);
		
		thread1.start();
		thread2.start();
		thread3.start();

	}
	
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			try {
				Thread.sleep(2000);
				System.out.println("Daemon thread running"); // This won't be displayed
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		for(int i=1; i<=3; i++) {
			System.out.println(Thread.currentThread().getName()+" is running and value of i = "+i);
		}
	}

}
