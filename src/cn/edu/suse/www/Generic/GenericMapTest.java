package cn.edu.suse.www.Generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class GenericMapTest {
	public static void main(String[] args) {
		Map<String,Integer> maps = new HashMap<String, Integer>();
		
		maps.put("你大爷的", 1000);
		maps.put("去你的", 123);
		maps.put("你大爷的1", 1000);
		maps.put("你大爷的2", 1000);
		
		Set<String> keys = maps.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string+"="+maps.get(string));
		}
		SortedSet<M> ss = new TreeSet<M>();
		ss.add(new M(1000.1));
		ss.add(new M(1000.2));
		ss.add(new M(1000.3));
		ss.add(new M(1000.4));
		Iterator<M> IT = ss.iterator();
		while (IT.hasNext()) {
			M m = (M) IT.next();
			System.out.println(m);
		}
	}

}
class M implements Comparable<M>{
	double sal;

	public M(double sal) {
		super();
		this.sal = sal;
	}

	public String toString() {
		return "M [sal=" + sal + "]";
	}

	public int compareTo(M o) {
		double sal1 = this.sal;
		double sal2 = o.sal;
		if(sal1==sal2){
			return 0;
		}else if (sal1>sal2) {
			return -1;
		}else {
			return 1;
		}
	}
	
}



















