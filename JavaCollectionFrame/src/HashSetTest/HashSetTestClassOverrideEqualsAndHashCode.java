package HashSetTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//重写了equals方法和hashCode方法

class student1{
	public int id;
	public String name;
	public int age;
	public student1(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString(){
		return "id="+this.id+"name="+this.name+"age="+this.age;
	}
	@Override
	 public boolean equals(Object anObject){
		if(anObject==null) return false;
		if(getClass()!=anObject.getClass()) return false;
		student1 std=(student1)anObject;
		if(this.id!=std.id) return false;
		if(this.name.equals(std.name)==false) return false;
		if(this.age!=std.age) return false;
		return true;
	}
	@Override //默认名字不为空
	 public int hashCode(){
		int hash=5;
		hash=hash*19+this.id;
		hash=hash*19+this.name.hashCode();
		hash=hash*19+this.age;
		return hash;
	}
}

//不存在顺序
public class HashSetTestClassOverrideEqualsAndHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<student1> set=new HashSet<student1>();
		set.add(new student1(1,"zhangsan",20));
		set.add(new student1(2,"lisi",20));
		set.add(new student1(1,"zhangsan",20));
		set.add(new student1(3,"wangwu",20));
		
		Iterator<student1> iterator=set.iterator();
		while(iterator.hasNext()){
			System.out.println((student1)(iterator.next()));
		}		

	}

}
