// 1. High flexibility and programmatic control  
// 2. Chain locking supported 
// 3. Performance improvement
// 4. Fairness locking support

package com.threading;

import java.time.LocalDateTime;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class ExtrinsicLockDemo {
	
	Lock lock = new ReentrantLock();
	 
	public static void main (String[] args) throws InterruptedException {
		 
		 
		 	
	        ExtrinsicLockDemo demo = new ExtrinsicLockDemo();
	        Thread thread1 = new Thread(() -> {
	            System.out.println("thread1 before call "+LocalDateTime.now());
	            demo.syncMethod1("from thread1");
	            System.out.println("thread1 after call "+LocalDateTime.now());
	        });
	        Thread thread2 = new Thread(() -> {
	            System.out.println("thread2 before call "+LocalDateTime.now());
	            demo.syncMethod1("from thread2");
	            System.out.println("thread2 after call "+LocalDateTime.now());
	        });

	        thread1.start();
	        thread2.start();
	    }

	    private void syncMethod1 (String msg) {
	    	
	    	
	        System.out.println("in the syncMethod1 "+msg+" "+LocalDateTime.now());
	        try {
	        	lock.lock();
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        
	    }

	    private void syncMethod2 (String msg) {
	        System.out.println("in the syncMethod2 "+msg+" "+LocalDateTime.now());
	        try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        finally {
	        	lock.unlock();
	        }
	    }
}
