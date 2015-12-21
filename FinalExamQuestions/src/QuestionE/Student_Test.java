package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

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
		
		
		
		Student stu1 = new Student(new UUID(1, 1), "Bert", "Randall", "Gibbons", dBirthDate1, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student(new UUID(2, 1), "Bert", "Randall", "Gibbons", dBirthDate2, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu3 = new Student(new UUID(3, 1), "Bert", "Randall", "Gibbons", dBirthDate3, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu4 = new Student(new UUID(4, 1), "Bert", "Randall", "Gibbons", dBirthDate4, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu5 = new Student(new UUID(5, 1), "Bert", "Randall", "Gibbons", dBirthDate5, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");

		
		HashMap<Integer, Student> Students = new HashMap<Integer, Student> ();
		
		Students.put(1, stu1);
		Students.put(2, stu2);
		Students.put(3, stu3);
		Students.put(4, stu4);
		Students.put(5, stu5);
		// dont know what the question was asking since i am doing this outside of my lab. only whats not in my github, that is
		assertTrue(stu4 == Students.get(4));
		assertTrue(Students.get(2).getDOB() == dBirthDate2);
		// The Rest should work too
	}

}
