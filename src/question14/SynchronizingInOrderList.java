package question14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizingInOrderList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> lost1 = new ArrayList<String>();
	      lost1.add("Avi");
	      lost1.add("srinidi");
	      lost1.add("ranjeet");
	      lost1.add("Pinky");
	      List<String> synlist = Collections.synchronizedList(lost1);
	      synchronized(synlist) {
	         Iterator<String> itr = synlist.iterator();
	         while(itr.hasNext()) {
	            String str = itr.next();
	            System.out.println(str);
	         }
	      }
	   }
}
