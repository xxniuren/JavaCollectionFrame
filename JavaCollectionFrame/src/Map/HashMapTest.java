package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("abc", "abc");
		map.put("def", "def");
		map.put("abc", "abc");
		map.put(null, null);
		//通过key来获得所有的Value
		//得到key的Set集合
		Set<String> set=map.keySet();
		//得到set集合的迭代器
		Iterator<String> iterator=set.iterator();
		//通过迭代器拿到每一个Key值
		while(iterator.hasNext()){
			String key=(String)iterator.next();
			//得到Value值
			String value=map.get(key);
			System.out.println(value);
		}
		//得到Entry的set集合
		Set<Entry<String,String>> entry=map.entrySet();
		//得到迭代器
		Iterator<Entry<String,String>> iter=entry.iterator();
		while(iter.hasNext()){
			Entry<String,String> entr=iter.next();
			System.out.println(entr.getKey());
			System.out.println(entr.getValue());
		}
		
		//得到keySet集合
		Set<String> keySet=map.keySet();
		//得到迭代器
		Iterator<String> keyDat=keySet.iterator();
		//循环查找
		while(keyDat.hasNext()){
			String key=keyDat.next();
			String value=map.get(key);
			System.out.println(value);
		}
	}

}
