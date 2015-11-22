package cn.edu.suse.www.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 随机生成
 * @author luoSteel
 *
 */
public class GetRandom 
{
	/**
	 * 随机生成非空任意字符串
	 * @param length
	 */
	public String getRandomString(int length)
	{
		if (length<0)
		{
			length++;
		}
		String base = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";   
		Random random = new Random();   
		StringBuffer sb = new StringBuffer();   
		for (int i = 0; i < length; i++) {   
		    int number = random.nextInt(base.length());   
		    sb.append(base.charAt(number));   
		}   
		return sb.toString();
	}
	
	/**
	 * 随机生成任意长度的	List 链表集合
	 * @param ListLength 集合的长度
	 * @param StringLength 元素的长度
	 */
	public List<String> GetRandomList(int ListLength,int StringLength)
	{
		if (ListLength<0)
		{
			ListLength++;
		}
		List<String> list = new ArrayList<String>();
		for (int i = 0 ; i < ListLength ;i ++)
		{
			list.add(getRandomString(StringLength));
		}
		return list;
	}
	
	/**
	 * 固定的测试链表集合
	 * @return
	 */
	public List<String> getUtilList()
	{
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");
		list.add("H");
		return list;
	}

}
