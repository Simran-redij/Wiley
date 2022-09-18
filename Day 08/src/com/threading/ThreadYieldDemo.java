package com.threading;

// Thread Yield : It checks whether any other thread has same or more priority than itself, if such thread is found
// it pauses the execution of the current thread & executes that other thread first

public class ThreadYieldDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadOne threadOne = new ThreadOne();
		ThreadTwo threadTwo = new ThreadTwo();
		threadOne.start();
		threadTwo.start();
	}

}

class ThreadOne extends Thread{
	
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Thread one is running");
			Thread.yield();
		}
	}
}

class ThreadTwo extends Thread{
	
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Thread two is running");
			Thread.yield();
		}
	}
}