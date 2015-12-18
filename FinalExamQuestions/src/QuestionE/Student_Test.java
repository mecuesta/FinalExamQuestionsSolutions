package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

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
	public void Student_Test() {
		
		Date dBirthDate1 = null;
		Date dBirthDate2 = null;
		Date dBirthDate3 = null;
		Date dBirthDate4 = null;
		Date dBirthDate5 = null;
		try {
			dBirthDate1 = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
			dBirthDate2 = new SimpleDateFormat("yyyy-MM-dd").parse("1932-07-31");
			dBirthDate3 = new SimpleDateFormat("yyyy-MM-dd").parse("1942-07-31");
			dBirthDate4 = new SimpleDateFormat("yyyy-MM-dd").parse("1952-07-31");
			dBirthDate5 = new SimpleDateFormat("yyyy-MM-dd").parse("1962-07-31");
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		int personID;
		for (personID = 1; personID < 6; personID++) {
			Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate1, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
			Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate1, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
			
		}
		HashMap<personID, Student> Students = new HashMap<personID, Student> ();
		
			
		
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate1, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("Manuel", "Enrique", "Cuesta", )

		assertTrue(1==1);
	}

}
