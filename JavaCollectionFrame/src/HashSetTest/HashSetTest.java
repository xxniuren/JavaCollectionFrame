package HashSetTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//����String�����Ѿ���д��equals������hashCode�����Կ���ʹ����set��
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
