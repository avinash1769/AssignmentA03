package question13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListOfClass {
	public static void main(String args[]){

	    List<String> names=new ArrayList<String>();
	    names.add("Avi");
	    names.add("Srinidi");
	    names.add("RANJEET");
	    names.add("Anus");
	    //Iterating the array list using iterator
	    System.out.println("ArrayListClass elements: ");
	    Iterator itr=names.iterator();
	    while(itr.hasNext()){
	      System.out.println(itr.next());
	    }
	  }
}
