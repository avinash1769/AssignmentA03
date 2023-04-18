package question6;

import question6.StringAndBufferendBuilderPart;

public class DriverClass extends StringAndBufferendBuilderPart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long startTime = System.currentTimeMillis();  
	        concatWithString();  
	        System.out.println((System.currentTimeMillis()-startTime)+"ms");  
	        startTime = System.currentTimeMillis();  
	        concatWithStringBuffer();  
	        System.out.println((System.currentTimeMillis()-startTime)+"ms");  
	    }  
	}