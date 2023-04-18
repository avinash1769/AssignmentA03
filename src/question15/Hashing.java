package question15;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Hashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> hnewTable=new Hashtable<Integer,String>();
		hnewTable.put(1," a");
		hnewTable.put(2,"b");
		hnewTable.put(3,"c");
		hnewTable.put(4,"d");
        System.out.println("-------------Hash table--------------");
        for (Map.Entry m:hnewTable.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        //hashmap 
        HashMap<Integer,String> hmap=new HashMap<Integer,String>();
        hmap.put(100,"A");
        hmap .put(101,"B"); 
        hmap.put(102,"C");
        hmap.put(103,"D");
        System.out.println("-----------Hash map-----------");
        for (Map.Entry m:hmap.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
	}
	}
}
