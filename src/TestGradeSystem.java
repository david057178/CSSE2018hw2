import static org.junit.Assert.*;

import java.io.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestGradeSystem {

	GradeSys gradeSys=null;
	@Before
	public void setUp() throws Exception {
		gradeSys=new GradeSys();
	}

	@After
	public void tearDown() throws Exception {
		gradeSys=null;
	}

	@Test
	public void testShowGrade1() {
		ByteArrayOutputStream str=new ByteArrayOutputStream();
		System.setOut (new PrintStream (str));
		gradeSys.user=gradeSys.map.get("955002056");
		gradeSys.showGrade();
		assertEquals("³\¤åÄÉ¦¨ÁZ:lab1:     88\n" + 
				"      lab2:     49*\n" + 
				"      lab3:     88\n" + 
				"      mid-term :  98\n" + 
				"      final exam : 91\n" + 
				"      total grade : 88\n" 
				, str.toString());
	}
	/*
	@Test
	public void testShowGrade2() {
		ByteArrayOutputStream str=new ByteArrayOutputStream();
		System.setOut (new PrintStream (str));
		gradeSys.user=gradeSys.map.get("962001044");
		gradeSys.showGrade();
		assertEquals("87\r\n86\r\n98\r\n88\r\n87\r\n88\r\n", str.toString());
	}
	*/

}
