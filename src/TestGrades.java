import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestGrades {

	Grades g=null;
	
	@Before
	public void setUp() throws Exception {
		g= new Grades();
		//88 92 88 98 91
		g.grades[0]=88;
		g.grades[1]=92;
		g.grades[2]=88;
		g.grades[3]=98;
		g.grades[4]=91;
	}

	@After
	public void tearDown() throws Exception {
		g=null;
	}

	@Test
	public void testCountEachTotal1() {
		int[] weight=new int[5];
		weight[0]=10;
		weight[1]=10;
		weight[2]=10;
		weight[3]=30;
		weight[4]=40;
		g.countEachTotal(weight);
		assertEquals(93,g.total);
		//fail("Not yet implemented");
	}
	@Test
	public void testCountEachTotal2() {
		int[] weight=new int[5];
		weight[0]=15;
		weight[1]=15;
		weight[2]=15;
		weight[3]=20;
		weight[4]=35;
		g.countEachTotal(weight);
		assertEquals(92,g.total);
		//fail("Not yet implemented");
	}

}
