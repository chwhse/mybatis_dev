package kr.or.dgit.mybatis_dev.test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.PhoneNumber;
import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.services.StudentService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentServiceTest {
	private static StudentService studentService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass()");
		studentService = new StudentService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()");
		studentService = null;
	}
	
	@Before
	public void setUp(){
		System.out.println("setUp()");
	}
	@After
	public void tearDown(){
		System.out.println("tearDown()");
	}

	
	////////////////////////////////////////////////////////////////170313
	
	@Test
	public void pTestSelectStudentByNoForResultMap() {
		Student student = new Student();
		student.setStudId(1);
		Student selectStudent = studentService.selectStudentByNoForResultMap(student);
		Assert.assertNotNull(selectStudent);
	}
	@Test
	public void qTestSelectStudentByAllForResultMap() {
		List<Student> lists = studentService.selectStudentByAllForResultMap();
		List<Student> emptyLists = Collections.emptyList();
		Assert.assertNotEquals(emptyLists, lists);
	}
	
	////////////////////////////////////////////////////////////////////////////////////////
	
	@Test
	public void rSelectStudentByNoForHashMap() {
		Student student = new Student();
		student.setStudId(1);
		Map<String, Object> selectStudent = studentService.selectStudentByNoForHashMap(student);
		for(Entry<String, Object> e : selectStudent.entrySet()){
			System.out.printf("key : %s -> value : %s %n", e.getKey(),e.getValue());
		}
		Assert.assertNotNull(selectStudent);
	}
	
	@Test
	public void sSelectStudentByAllForHashMap() {
		List<Map<String, Object>> lists = studentService.selectStudentByAllForHashMap();
		List<Map<String, Object>> emptyLists = Collections.emptyList();
		
		for(Map<String, Object> map : lists){
			for(Entry<String, Object> e : map.entrySet()){
				System.out.printf("key : %s -> value : %s %n", e.getKey(),e.getValue());
			}
		}
		Assert.assertNotEquals(emptyLists, lists);
	}
	
	@Test
	public void tSelectStudentByNoWithAddress() {
		Student student = new Student();
		student.setStudId(1);
		Student selectStudent = studentService.selectStudentByNoWithAddress(student);
		Assert.assertNotNull(selectStudent);
	}
	
	@Test
	public void uSelectStudentByNoAssociationAddress() {
		Student student = new Student();
		student.setStudId(1);
		Student selectStudent = studentService.selectStudentByNoAssociationAddress(student);
		Assert.assertNotNull(selectStudent);
	}
	
	
}
