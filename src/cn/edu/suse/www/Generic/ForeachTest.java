package cn.edu.suse.www.Generic;

import java.util.ArrayList;
import java.util.Collection;

public class ForeachTest {
	public static void main(String[] args) {
		Collection<String> list = new ArrayList<String>();
		list.add("1000");
		list.add("123456");
		for(String str:list){
			System.out.println(str);
		}
	}
}
