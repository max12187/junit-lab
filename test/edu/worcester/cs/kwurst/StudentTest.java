package edu.worcester.cs.kwurst;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {
	private Student student1;

	@Before
	public void setUp() throws Exception {
		student1 = new Student("Jane", "Smith");
	}

	@Test
	public void testCurrentEarnedCr() {
		int credits = 45;
		student1.setCurrentEarnedCr(credits);
	 	assertEquals(credits, student1.getCurrentEarnedCr());
	}
	
	@Test
	public void testAnticipatedAdditionalCredits() {
		int credits = 45;
		student1.setAnticipatedAdditionalCr(credits);
	 	assertEquals(credits, student1.getAnticipatedAdditionalCr());
	}
	
	@Test
	 public void testReadyToGraduate1(){
		//HEAP!!
		 student1.setCurrentEarnedCr(120);
		 student1.setGpa(2.0);
		 student1.setMajorComplete(true);
		 student1.setLascComplete(true);
		 assertTrue(student1.readyToGraduate());
	 }
	
	@Test
	 public void testReadyToGraduate2(){
		//HEAP!!
		 student1.setCurrentEarnedCr(69);
		 student1.setGpa(2.0);
		 student1.setMajorComplete(true);
		 student1.setLascComplete(true);
		 assertFalse(student1.readyToGraduate());
	 }
	
	@Test
	 public void testReadyToGraduate3(){
		//HEAP!!
		 student1.setCurrentEarnedCr(120);
		 student1.setGpa(1.2);
		 student1.setMajorComplete(true);
		 student1.setLascComplete(true);
		 assertFalse(student1.readyToGraduate());
	 }
	
	@Test
	 public void testReadyToGraduate4(){
		//HEAP!!
		 student1.setCurrentEarnedCr(120);
		 student1.setGpa(2.0);
		 student1.setMajorComplete(false);
		 student1.setLascComplete(true);
		 assertFalse(student1.readyToGraduate());
	 }
	
	@Test
	 public void testReadyToGraduate5(){
		//HEAP!!
		 student1.setCurrentEarnedCr(120);
		 student1.setGpa(2.0);
		 student1.setMajorComplete(true);
		 student1.setLascComplete(false);
		 assertFalse(student1.readyToGraduate());
	 }
	
	@Test
	 public void testReadyToGraduate6(){
		//HEAP!!
		 student1.setCurrentEarnedCr(420);
		 student1.setGpa(2.0);
		 student1.setMajorComplete(true);
		 student1.setLascComplete(true);
		 assertTrue(student1.readyToGraduate());
	 }
	
	@Test
	 public void getCurrentRemainingCr(){
		student1.setCurrentEarnedCr(69);
		assertEquals(120-69, student1.getCurrentRemainingCr());
		 
	 }
	
	@Test
	 public void getCurrentRemainingCr1(){
		student1.setCurrentEarnedCr(120);
		assertEquals(0, student1.getCurrentRemainingCr());
		 
	 }
	
	@Test
	 public void getCurrentRemainingCr2(){
		student1.setCurrentEarnedCr(420);
		assertEquals(0, student1.getCurrentRemainingCr());
		 
	 }
	
	@Test
	public void testStudentCount() {
	 int count = Student.getStudentCount();
	 new Student("Joe", "Jones");
	 assertEquals(count+1,Student.getStudentCount());
	}
	
	@Test
	public void testStudentID() {
	 int count = Student.getStudentCount();
	 Student s2 = new Student("Joe", "Jones");
	 assertEquals(String.format("%07d", count+1),s2.getId());
	}
	

}
