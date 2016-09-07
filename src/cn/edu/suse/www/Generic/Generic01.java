package cn.edu.suse.www.Generic;


public class Generic01 {
	public static void main(String[] args) {
		MY<String> s = new MY<String>();
		s.m("String");
		
	}
}
class MY<T>{
	public void m(T t){
	System.out.println(t);
	}
}