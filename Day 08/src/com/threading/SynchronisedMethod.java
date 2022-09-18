package com.threading;

class Test{
	
	public synchronized void count() {// At a time not more than one thread can access this method
		
		for(int i=0; i<3; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
			try {
				Thread.sleep(400);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyThread1 extends Thread{
	
	Test test;
	
	MyThread1(Test test){
		this.test = test;
	}
	
	@Override
	public void run() {
		test.count();
	}
}


public class SynchronisedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test obj = new Test();
		
		MyThread1 thread1 = new MyThread1(obj);
		MyThread1 thread2 = new MyThread1(obj);
		
		thread1.start();
		thread2.start();
	}

}


