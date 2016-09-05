package cn.edu.suse.www.Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {
	public static void main(String[] args) throws Exception{
		Map<String, String> p = new HashMap<String, String>();
		p.put("10000", "JAVA1");
		p.put("10011", "JAVA2");
		p.put("10002", "JAVA3");
		p.put("10003", "JAVA4");
		p.put("10004", "JAVA5");
		p.put("10000", "JAVA6");
		
		System.out.println(p.size());
		System.out.println(p.containsKey("10000"));
		System.out.println(p.containsValue("JAVA6"));
		
		System.out.println(p.get("10000"));
		
		Iterator<String> it = p.values().iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		Iterator<String> key = p.keySet().iterator();
		while (key.hasNext()) {
			String id = key.next();
			System.out.println(id+":"+p.get(id)+" ");
		}
		//entrySet
		//将Map转换为Set
		System.out.println();
		Iterator<Entry<String, String>> it1 = p.entrySet().iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
	}
}





















