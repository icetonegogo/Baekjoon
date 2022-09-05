import java.util.Map.Entry;
import java.util.*;

public class Main{

	public static void main(String[] args){
    	
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        map.put("Key1",1);
        map.put("Key2",2);
        map.put("Key3",3);
        map.put("Key4",4);
        map.put("Key5",5);
        
        /* 방법 1 - KeySet() : key */
        for(String key : map.keySet()){
        	System.out.println(key);
        }
        
        /* 방법 2 - entrySet() : key/value */
        for(Entry<String, Integer>elem : map.entrySet()){
        	System.out.println(elem.getKey() + " " + elem.getValue());
        }
        
        /* 방법 3 - Iterator */
        
        // Iterator 1. keySet()
        Iterator<String> keys = map.keySet().iterator();
        while(keys.hasNext()){
        	String key = keys.next();
            System.out.println(key);
        }
        
        // Iterator 2. keySet()
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
        	String key = (String)iterator.next();
            System.out.println(key);
        }
        
        // Iterator 3. entrySet() : key/value
        Set set2 = map.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()){
        	Entry<String,Integer>entry = (Entry)iterator2.next();
            String key = (String)entry.getKey();
            int value = (Integer)entry.getValue();
            System.out.println(key);
            System.out.println(value);
        }
    }
}
