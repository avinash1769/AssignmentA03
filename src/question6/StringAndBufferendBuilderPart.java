package question6;

public class StringAndBufferendBuilderPart {
	
	 public static String concatWithString()    {  
	        String bwr = "Hello";  
	        for (int i=0; i<1000; i++){  
	            bwr = bwr + "Hi";  
	        }  
	        return bwr;  
	    }  
	    public static String concatWithStringBuffer(){ 
	    	
	        StringBuffer serb = new StringBuffer("Hello");  
	        for (int i=0; i<10000; i++){  
	            serb.append("Hello");  
	        }  
	        return serb.toString();  
	    }
}