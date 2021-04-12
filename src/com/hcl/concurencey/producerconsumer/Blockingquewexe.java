package com.hcl.concurencey.producerconsumer;

import java.util.concurrent.*;



public class Blockingquewexe {

	public static void main(String[] args) {
		BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<Integer>();
	    
	    ExecutorService pes = Executors.newFixedThreadPool(2);
	    ExecutorService ces = Executors.newFixedThreadPool(2);
	    
	    
	    
	   pes.submit(new Producer(sharedQueue, 1));
	    pes.submit(new Producer(sharedQueue, 2));
	    ces.submit(new Consumer(sharedQueue, 1));
	    ces.submit(new Consumer(sharedQueue, 2));
	     
	    pes.shutdown();
	    ces.shutdown();
	}

}