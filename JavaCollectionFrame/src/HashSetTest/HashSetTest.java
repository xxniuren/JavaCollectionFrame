package HashSetTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//由于String类型已经重写了equals方法和hashCode，所以可以使用在set中
public class HashSetTest {
	
	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		set.add("abc");
		set.add("def");
		set.add("abc");
		
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()){
			System.out.println((String)(iterator.next()));
		}
	}

}
