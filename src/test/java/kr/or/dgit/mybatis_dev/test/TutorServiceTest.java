package kr.or.dgit.mybatis_dev.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.Course;
import kr.or.dgit.mybatis_dev.dto.Gender;
import kr.or.dgit.mybatis_dev.dto.Tutor;
import kr.or.dgit.mybatis_dev.services.TutorService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TutorServiceTest {
	private static TutorService tutorService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass()");
		tutorService = TutorService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()");
		tutorService = null;
	}
	
	@Before
	public void setUp(){
		System.out.println("setUp()");
	}
	@After
	public void tearDown(){
		System.out.println("tearDown()");
	}

	/*
	@Test
	public void aTestSelectTutorById(){
		Tutor tutor = tutorService.selectTutorById(1);
		Assert.assertNotNull(tutor);
		System.out.println("TestSelectTutorById()"+tutor);
		List<Course> courses = tutor.getCourses();
		Assert.assertNotNull(courses);
		for(Course c: courses){
			Assert.assertNotNull(c);
			System.out.println(c);
		}
	} */
	
	@Test
	public void bTestInsertTutor(){
		Tutor tutor = new Tutor();
		tutor.setTutorId(9);
		tutor.setName("hong");
		tutor.setEmail("hgd@");
		tutor.setGender(Gender.MALE);
		
		int res = tutorService.insertTutor(tutor);
		Assert.assertEquals(1, res);
	}

}
