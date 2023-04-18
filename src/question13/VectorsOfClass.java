package question13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorsOfClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> names=new Vector<String>();
	    names.add("Avi");
	    names.add("Srinidi");
	    names.add("Ranjeet");
	    names.add("Pinky");
	    //Iterating the array list using iterator
	    System.out.println("VectorClass elements: ");
	    Iterator itr=names.iterator();
	    while(itr.hasNext()){
	      System.out.println(itr.next());
	    }
	  }
	

}
