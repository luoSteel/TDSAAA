package cn.edu.suse.www.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<Object> s = new HashSet<Object>();
		//无序不可重复
		Employee e1 = new Employee("1000", "JACK1");
		Employee e2 = new Employee("1001", "JACK2");
		Employee e3 = new Employee("2000", "JACK3");
		Employee e4 = new Employee("2001", "JACK4");
		Employee e5 = new Employee("3000", "JACK5");
		Employee e6 = new Employee("3001", "JACK6");
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		s.add(e5);
		s.add(e6);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(s.size());
		//遍历
		Iterator<Object> it = s.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
			
		}
	}
}
//该公司员工编号是：1000-9999
class Employee{
	//编号
	String no;//
	//姓名
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