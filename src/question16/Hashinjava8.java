package question16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashinjava8 {
	  public static void main(String[] args) {
	        Map<String, Long> p = new HashMap<String, Long>();
	        p.put("A",8L);
	        p.put("B",90L);
	        p.put("c",7788184L);

	        Iterator<String> keyIterator = p.keySet().iterator();

	        while (keyIterator.hasNext()){
	            String key = keyIterator.next();
	            if ("A".equals(key)){
	                p.put("B",90L);
	            }
	        }
	    }
}
