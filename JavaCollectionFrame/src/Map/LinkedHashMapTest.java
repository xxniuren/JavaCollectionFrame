package Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		LinkedHashMap<String,String> map= new LinkedHashMap<String,String>();
		map.put("123", "123");
		map.put("234", "234");
		map.put("234", "234");
		map.put("345", "345");
		
		//得到输出键值对
		Set<Entry<String,String>> set1=map.entrySet();
		Iterator<Entry<String,String>> iterator=set1.iterator();
		while(iterator.hasNext()){
			Entry<String,String> e=iterator.next();
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		
	}

}
