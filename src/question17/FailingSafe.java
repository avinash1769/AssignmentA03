package question17;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailingSafe {
	  public static void main(String args[])   
	    {   
	        CopyOnWriteArrayList<Integer> listny   
	            = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 2, 8, 23 });   
	        Iterator itr = listny.iterator();   
	        while (itr.hasNext()) {   
	            Integer i = (Integer)itr.next();   
	            System.out.println(i);   
	            if (i == 2)   
	                listny.add(7);   
	        }   
	    }  
}
