package com.threading;

public class DefaultThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// One way to start thread :
		Thread thread = new Thread() {
			public void run() {
				System.out.println("Run is invoked");
			}
		};
		thread.start();
		
		// but we cannot call start method as Runnable Interface only has run():
		Runnable thread2 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Run for runnable is invoked");
			}
		};
		
		// Second way to start thread :
		Thread t1 = new Thread(thread2);
		t1.start();
	}

}
