package cn.edu.suse.www.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionsTest {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(1);
		l.add(4);
		l.add(2);
		Iterator<Integer> it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----------------");
		Collections.sort(l);
		Iterator<Integer> it1 = l.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		Set<Integer> s = new HashSet<Integer>();
		s.add(15);
		s.add(11);
		s.add(14);
		s.add(12);
		List<Integer> ls = new ArrayList<Integer>(s);
		Collections.sort(ls);
		Iterator<Integer> it2 = ls.iterator();
		System.out.println("-----------------");
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		List<Person> list = new ArrayList<Person>();
		
		Person p1 = new Person(10001, "Luoagng1");
		Person p2 = new Person(10002, "Luoagng2");
		Person p3 = new Person(10003, "Luoagng3");
		Person p4 = new Person(10004, "Luoagng4");
		Person p6 = new Person(10006, "Luoagng6");
		Person p5 = new Person(10005, "Luoagng5");
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		Collections.sort(list);
		Iterator<Person> it11 = list.iterator();
		while (it11.hasNext()) {
			Object object = (Object) it11.next();
			System.out.println(object);
		}
		
		//将ArrayList转换为线程安全的
		List<Object> mylist = new ArrayList<Object>();
		Collections.synchronizedList(mylist);
		
	}
}
class Person implements Comparable<Object>{
	Integer id;
	String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	public int compareTo(Object o) {
		int i1 = this.id;
		int i2 = ((Person)o).id;
		if (i1==i2){
			return 0;
		}else if (i1<i2) {
			return -1;
		}else {
			return 1;
		}
	}
	
}
















