package Map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,String> table=new Hashtable<String,String>();
		table.put("123", "123");
		table.put("123", "345");
		table.put("234", "234");
		
		Set<Entry<String,String>> set=table.entrySet();
		Iterator<Entry<String, String>> ite=set.iterator();
		while(ite.hasNext()){
			Entry<String,String> entry=ite.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}
