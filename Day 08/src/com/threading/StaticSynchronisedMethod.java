package com.threading;

public class StaticSynchronisedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test1 obj = new Test1();
		
		TestThread thread1 = new TestThread(obj);
		TestThread thread2 = new TestThread(obj);
		
		thread1.start();
		thread2.start();
	}

}

class Test1{
	
	synchronized static public void countIncreament() {
		System.out.println("Increament values");

		for(int i=0; i<3; i++) {
			System.out.println(i);
			try {
				Thread.sleep(400);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	synchronized static public void countDecreament() {
		System.out.println("Decreament values");

		for(int i=3; i>0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(400);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
}

class TestThread extends Thread{
	
	Test1 test;
	
	TestThread(Test1 test){
		this.test = test;
	}
	
	@Override
	public void run() {
		test.countIncreament();
		test.countDecreament();
	}
	
}