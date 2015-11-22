package cn.edu.suse.www.Collection;

import java.util.List;

import cn.edu.suse.www.Util.GetRandom;

public class MyList 
{

	public static void main(String[] args) 
	{
		
		GetRandom getRandom = new GetRandom();
		List<String> list = getRandom.getUtilList();
		List<String> c = getRandom.GetRandomList(5, 10);
		//在末尾添加元素
		list.add("luoSteel");
		//在指定位置添加元素
		list.add(list.size(), "luoSteel");
		System.out.println(c);
		System.out.println(list);
		//将指定集合添加到集合的末尾
		list.addAll(c);
		System.out.println(list);
	}

}
