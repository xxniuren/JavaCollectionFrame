package LinkedHashSetTest;

import java.util.Iterator;
import java.util.LinkedHashSet;



//测试linkedHashSet
//LinkedHashSet保存了输入的一个顺序

class student2{
	public int id;
	public String name;
	public int age;
	public student2(int id,String name,int age){
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
		student2 std=(student2)anObject;
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


public class LinkedHashSetTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<student2> linkedHashSet=new LinkedHashSet<student2>();
		linkedHashSet.add(new student2(1,"zhangsan",20));
		linkedHashSet.add(new student2(2,"lisi",20));
		linkedHashSet.add(new student2(3,"wangwu",20));
		linkedHashSet.add(new student2(1,"zhangsan",20));
		
		Iterator<student2> iterator=linkedHashSet.iterator();
		while(iterator.hasNext()){
			System.out.println((student2)(iterator.next()));
		}
	}

}
