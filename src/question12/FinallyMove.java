package question12;

public class FinallyMove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      try {    
		        System.out.println("trying block");  
		     
		       int data=25/0;    
		       System.out.println(data);    
		      }   
		    
		      finally {  
		        System.out.println("finally blocked");  
		      }    
		         
		      }    
	}


