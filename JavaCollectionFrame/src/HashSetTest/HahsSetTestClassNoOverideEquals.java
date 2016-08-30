package HashSetTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//没有重写hashCode和equals方法，所以导致了程序输出错误
class student{
	public int id;
	public String name;
	public int age;
	public student(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString(){
		return "id="+this.id+"name="+this.name+"age="+this.age;
	}
}


public class HahsSetTestClassNoOverideEquals {

	public static void main(String[] args) {
		Set<student> set=new HashSet<student>();
		set.add(new student(1,"zhangsan",20));
		set.add(new student(2,"lisi",20));
		set.add(new student(1,"zhangsan",20));
		set.add(new student(3,"wangwu",20));
		
		Iterator<student> iterator=set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}

}
