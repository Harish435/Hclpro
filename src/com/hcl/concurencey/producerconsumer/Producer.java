package com.hcl.concurencey.producerconsumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable {

	 private final BlockingQueue<Integer> sharedQueue;
	    private int threadNo;
	    private Random random = new Random();
	    public Producer(BlockingQueue<Integer> sharedQueue,int threadNo) {
	        this.threadNo = threadNo;
	        this.sharedQueue = sharedQueue;
	    }
	    @Override
	    public void run() {
	        // Producer produces a continuous stream of numbers for every 200 milli seconds
	       
	            try {
	            	for (Integer i = 1; i < 5 + 1; ++i)
		            {
		                System.out.println("Produced:" + i + ":by thread:"+ threadNo);
		                Thread.sleep(1000);
		                sharedQueue.put(i);
		            }
	             /* //  int number = random.nextInt(10);
	                System.out.println("Produced:" + number + ":by thread:"+ threadNo);
	                sharedQueue.put(number);
	                Thread.sleep(200);*/
	            } catch (Exception err) {
	                err.printStackTrace();
	            }
	        
	    }
	}