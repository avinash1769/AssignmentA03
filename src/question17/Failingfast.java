package question17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Failingfast {
	   

        public static void main(String[] args)   
        {   
            Map<String, String> element2 = new HashMap<String, String>();   
            element2.put("a", "A");   
            element2.put("b", "B");   
            element2.put("c", "C");   
            Iterator iterator = element2.keySet().iterator();   
            while (iterator.hasNext()) {   
                System.out.println(element2.get(iterator.next()));    
                element2.put("d", "D");   
            }   
        }   
      
}
