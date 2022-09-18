// As mentioned before, if a thread has acquired the lock, other threads will be blocked even if they 
// are calling other 'synchronized' methods of the same object. Non-synchronized methods won't be blocked.

package com.threading;
import java.time.*;


public class IntrinsicLockDemo {
	

	 public static void main (String[] args) throws InterruptedException {
	        IntrinsicLockDemo demo = new IntrinsicLockDemo();
	        Thread thread1 = new Thread(() -> {
	            System.out.println("thread1 before call "+LocalDateTime.now());
	            demo.syncMethod1("from thread1");
	            System.out.println("thread1 after call "+LocalDateTime.now());
	        });
	        Thread thread2 = new Thread(() -> {
	            System.out.println("thread2 before call "+LocalDateTime.now());
	            demo.syncMethod2("from thread2");
	            System.out.println("thread2 after call "+LocalDateTime.now());
	        });

	        thread1.start();
	        thread2.start();
	    }

	    private synchronized void syncMethod1 (String msg) {
	        System.out.println("in the syncMethod1 "+msg+" "+LocalDateTime.now());
	        try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

	    private synchronized void syncMethod2 (String msg) {
	        System.out.println("in the syncMethod2 "+msg+" "+LocalDateTime.now());
	        try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
}
