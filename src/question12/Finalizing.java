package question12;

public class Finalizing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalizing obj = new Finalizing();        
	              
	        obj = null;  
	     // calling the garbage collector using gc()  
	        System.gc();     
	        System.out.println("End of the gc ");     
	    }       
	    protected void finalize()     
	    {     
	        System.out.println("Calling the finalize()");     
	    }     
	

}