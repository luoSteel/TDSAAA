package cn.edu.suse.www.Test;

import org.junit.Before;
import org.junit.Test;

public class JAVA_JC {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		final long a = 24l*60*60*1000*1000;
		final long b = 24l*60*60*1000;
		System.out.println(a/b);
		System.out.println(2.1-1.1);
	}

}
