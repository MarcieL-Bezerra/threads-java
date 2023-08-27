package br.com.marciel.lambda;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrincipalLambda {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		
        for(int i = 0; i<5; i++) {
			
        	executorService.submit(()->{
        		synchronized (executorService) {
        			UsandoLambda usando = new UsandoLambda();
    				usando.simplesprint( );
    				}
				});
        	
       
				
		}
        executorService.shutdown();
	}
	
}
