package cn.edu.suse.www.String;

public class StringTest {

	public static void main(String[] args) {
		String s1 = "abc";
		System.out.println(s1.charAt(2));
		System.out.println(s1.endsWith("人"));
		System.out.println("abc".equalsIgnoreCase("AbC"));
		byte bytes[] = s1.getBytes();
		for(int i=0;i<bytes.length;i++){
			System.out.println(bytes[i]);
		}
		String s2 = "abcabc";
		System.out.println(s2.indexOf("b",s2.indexOf("b")+1));
		System.out.println(s2.lastIndexOf("b"));
		
		
	}
}
