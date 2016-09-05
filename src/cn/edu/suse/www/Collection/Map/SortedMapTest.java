package cn.edu.suse.www.Collection.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortedMapTest {
	public static void main(String[] args) {
		Map<product, Double> p = new TreeMap<product, Double>();
		product p1 = new product("西瓜1", 1.1);
		product p5 = new product("西瓜5", 1.5);
		product p2 = new product("西瓜2", 1.2);
		product p6 = new product("西瓜6", 1.6);
		product p7 = new product("西瓜7", 1.7);
		product p3 = new product("西瓜3", 1.3);
		product p4 = new product("西瓜4", 1.4);
		
		p.put(p1, 1.0);
		p.put(p2, 2.0);
		p.put(p3, 3.0);
		p.put(p4, 4.0);
		p.put(p5, 5.0);
		p.put(p6, 6.0);
		p.put(p7, 7.0);
		
		Iterator<Entry<product, Double>> it = p.entrySet().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
class product implements Comparable<Object>{
	String name;
	double price;
	public product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		product other = (product) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
		return true;
	}

	public String toString() {
		return "product [name=" + name + ", price=" + price + "]";
	}
	public int compareTo(Object o) {
		double p1 = this.price;
		double p2 = ((product)o).price;
		if (p1==p2){
			return 0;
		}else if (p1<p2) {
			return -1;
		}else{
			return 1;
		}
	}
	
}