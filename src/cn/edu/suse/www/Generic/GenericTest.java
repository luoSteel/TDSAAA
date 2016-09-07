package cn.edu.suse.www.Generic;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class GenericTest {
	public static void main(String[] args) {
		Collection<Object> s = new HashSet<Object>();
		s.add(new A());
		s.add(new B());
		s.add(new C());
		
		Iterator<Object> it = s.iterator();
		while (it.hasNext()) {
			Object o = (Object) it.next();
			if(o instanceof A){
				((A)o).m1();
			}else if(o instanceof B){
				((B)o).m2();
			}else if (o instanceof C) {
				((C)o).m3();
			}
		}
		Collection<String> list = new HashSet<String>();
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("1");
		
		
		Iterator<String> it1 = list.iterator();
		while (it1.hasNext()) {
			String string = (String) it1.next();
			System.out.println(string);
		}
	}
}
class A{
	public void m1(){
		System.out.println("A IS M1");
	}
}
class B{
	public void m2(){
		System.out.println("B IS M2");
	} 
}
class C{
	public void m3(){
		System.out.println("C IS M3");
	}
}