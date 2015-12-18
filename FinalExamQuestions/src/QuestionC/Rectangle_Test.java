package QuestionC;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Rectangle_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Rectangle_Test1() {
		// modified this test for my test function
		try{
			Rectangle r2 = new Rectangle(-5, -10);
			int thex = r2.getX();
			int they = r2.getY();
			assertTrue(r2.ComputeArea() == 50);
		} catch (IllegalRectangle e) {
				System.out.println("Sorry, but either your x or your y is negative");
		}
	}
	
	@Test
	public void Rectangle_Test2() {
		
	
		Rectangle r2;
		try {
			r2 = new Rectangle(5, 10);
			assertTrue(r2.ComputeArea() == 50);
		} catch (IllegalRectangle e) {
			System.out.println("Sorry, but either your x or your y is negative");
		}
	}
	

}
