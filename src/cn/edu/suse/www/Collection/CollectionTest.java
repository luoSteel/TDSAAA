package cn.edu.suse.www.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
	public static void main(String[] args) {
		Collection<Object> c = new ArrayList<Object>();

		c.add(1);
		c.add(new Integer(100));
		Object O = new Object();
		c.add(O);
		User u = new User("luogang", 12);
		c.add(u);
		
		System.out.println(c.isEmpty());
		System.out.println(c.size());
		
		Iterator<Object> it = c.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		c.clear();
		System.out.println(c.size());
	}

}
class User{
	private String user;
	private int age;
	User(String user,int age)
	{
		this.user = user;
		this.age = age;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (age != other.age)
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	public String toString() {
		return "User [user=" + user + ", age=" + age + "]";
	}
	
}