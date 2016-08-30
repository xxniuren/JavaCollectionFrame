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
		//ͨ��key��������е�Value
		//�õ�key��Set����
		Set<String> set=map.keySet();
		//�õ�set���ϵĵ�����
		Iterator<String> iterator=set.iterator();
		//ͨ���������õ�ÿһ��Keyֵ
		while(iterator.hasNext()){
			String key=(String)iterator.next();
			//�õ�Valueֵ
			String value=map.get(key);
			System.out.println(value);
		}
		//�õ�Entry��set����
		Set<Entry<String,String>> entry=map.entrySet();
		//�õ�������
		Iterator<Entry<String,String>> iter=entry.iterator();
		while(iter.hasNext()){
			Entry<String,String> entr=iter.next();
			System.out.println(entr.getKey());
			System.out.println(entr.getValue());
		}
		
		//�õ�keySet����
		Set<String> keySet=map.keySet();
		//�õ�������
		Iterator<String> keyDat=keySet.iterator();
		//ѭ������
		while(keyDat.hasNext()){
			String key=keyDat.next();
			String value=map.get(key);
			System.out.println(value);
		}
	}

}
