package cn.edu.suse.www.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<Object> s = new HashSet<Object>();
		//无序不可重复
		s.add(1);
		s.add(1);
		s.add(100);
		s.add(85);
		s.add(88);
		Employee e = new Employee("1000", "JACK");
		Employee e1 = new Employee("1000", "JACK1");
		Employee e2 = new Employee("1002", "JACK2");
		Employee e3 = new Employee("1003", "JACK3");
		s.add(e);
		s.add(e1);
		s.add(e2);
		s.add(e3);
		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
		System.out.println(s.size());
		//遍历
		Iterator<Object> it = s.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
			
		}
	}
}
class Employee{
	String no;
	String name;
	public Employee(String no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	public int hashCode() {
		return no.hashCode();
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (no == null) {
			if (other.no != null)
				return false;
		} else if (!no.equals(other.no))
			return false;
		return true;
	}
	public String toString() {
		return "Employee [no=" + no + ", name=" + name + "]";
	}
	
	
}