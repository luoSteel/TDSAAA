package cn.edu.suse.www.Collection.SortedSet;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
	public static void main(String[] args) {
		SortedSet<Object> ss = new TreeSet<Object>();
		user u1 = new user(9);
		user u2 = new user(92);
		user u3 = new user(29);
		user u4 = new user(19);
		user u5 = new user(59);
		user u6 = new user(9);
		ss.add(u1);//自动装箱
		ss.add(u2);
		ss.add(u3);
		ss.add(u4);
		ss.add(u5);
		ss.add(u6);
		//遍历
		Iterator<Object> it = ss.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
class user implements Comparable<Object>{
	String name;
	int age;
	public String toString() {
		return "user [age=" + age + "]";
	}
	public user(int age) {
		super();
		this.age = age;
	}
	public int compareTo(Object o) {
		return this.age-((user)o).age;
	}
	
}
