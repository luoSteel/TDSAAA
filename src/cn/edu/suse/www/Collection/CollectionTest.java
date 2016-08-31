package cn.edu.suse.www.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
	public static void main(String[] args) {
		Collection<Object> c = new ArrayList<Object>();
		System.out.println(c.isEmpty());
		c.add(1);
		c.add(new Integer(100));
		Object O = new Object();
		c.add(O);
		User u = new User("luogang", 12);
		c.add(u);
		System.out.println(c.isEmpty());
		System.out.println(c.size());
		Object[] obs = c.toArray();
		for(int i=0 ; i<obs.length;i++){
			System.out.println(obs[i]);
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