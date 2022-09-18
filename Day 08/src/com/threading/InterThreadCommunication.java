package com.threading;

class Printer {

	// Initially 10 paper are set in printer
	int noOfPaper = 10;

	// Synchronized the method for inter-thread communication
	

	synchronized void addPages(int noOfPages) {

		// Adding more pages in printer
		this.noOfPaper = noOfPages;
		System.out.println("Adding "+noOfPages+" pages");
		// After adding the paper in printer, notify the paused thread
		notify(); // notify the blocked/waited thread that I am done with the job, you can continue
	}
	
	
	synchronized void prinitingPages(int pages) {
		System.out.println("Priniting the pages...");
		for (int i = 0; i < 10; i++) {
			// Priniting Pages
			noOfPaper = noOfPaper - 1;
			System.out.println("Available papers in tray : " + this.noOfPaper);
		}

		// If balance number of papers is less than user input then wait for addPages()
		// synchronized method and printing
		// will resume after that
		if (this.noOfPaper < pages) {
			System.out.println("Number of papers in printer are less");
			try {
				System.out.println("Waiting...");
				wait(); // hold the execution for synchronized method till resources gets available.
						// Other thread will
				// take up the job to fill up the resources.
			} catch (Exception e) {

			}
		}
		//System.out.println("After called notify() method number of paper : " + this.noOfPaper);
		System.out.println("Printing process complete");
	}
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Printer();
		// Create two new thread and start them simultaneously
		// First thread for print the pages
		new Thread() {
			@Override
			public void run() {
				// User want to print 20 pages
				printer.prinitingPages(20);
			}
		}.start();

		// Second thread for add pages in printer
		new Thread() {
			@Override
			public void run() {
				// User want to print 20 pages
				printer.addPages(10);
			}
		}.start();

	}

}
