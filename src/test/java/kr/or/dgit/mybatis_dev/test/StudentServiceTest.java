package kr.or.dgit.mybatis_dev.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

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
	
	@Test
	public void aTestFindStudentByNo() {
		Student std = new Student();
		std.setStudId(1);
		Student findStd = studentService.findStudentByNo(std);
		Assert.assertNotNull(findStd);
	}
	
	@Test
	public void bTestFindStudentByNoApi() {
		Student std = new Student();
		std.setStudId(1);
		Student findStd = studentService.findStudentByNoApi(std);
		Assert.assertNotNull(findStd);
	}
	
	@Test
	public void cTestFindStudentByNoAnnotation() {
		Student std = new Student();
		std.setStudId(1);
		Student findStd = studentService.findStudentByNoAnnotation(std);
		Assert.assertNotNull(findStd);
	}
	
	@Test
	public void dTestSelectStudentByAll() {
		List<Student> lists = studentService.findStudentByAll();
		for(Student s : lists){
			System.out.println(s);
		}
		Assert.assertNotNull(lists);
	}

	@Test
	public void eTestSelectStudentByAllApi() {
		List<Student> lists = studentService.findStudentByAllApi();
		for(Student s : lists){
			System.out.println(s);
		}
		Assert.assertNotNull(lists);
	}
	@Test
	public void fTestSelectStudentByAllAnnotation() {
		List<Student> lists = studentService.findStudentByAllAnnotation();
		for(Student s : lists){
			System.out.println(s);
		}
		Assert.assertNotNull(lists);
	}
	@Test
	public void gTestInsertStudent() {
		Student student = new Student(3, "김두환", "kdh@dgit.com", new Date(),new PhoneNumber("010-1111-1111"));
		int res = studentService.insertStudent(student);
		Assert.assertEquals(1, res);
	}
	@Test
	public void hTestInsertStudentApi() {
		Student student = new Student(4,"김두환","kdh@dgit.com",new Date(),new PhoneNumber("010-1111-1111"));
		int res = studentService.insertStudentApi(student);
		Assert.assertEquals(1, res);
	}
	@Test
	public void iTestInsertStudentAnnotation() {
		Student student = new Student(5, "김두환", "kdh@dgit.com", new Date(),new PhoneNumber("010-1111-1111"));
		int res = studentService.insertStudentAnnotation(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void jTestUpdatetudent() {
		Student student = new Student(3, "김두화니", "kdh@google.com", new Date(),new PhoneNumber("010-3232-2222"));
		int res = studentService.updateStudent(student);
		Assert.assertEquals(1, res);
	}
	@Test
	public void kTestUpdateStudentApi() {
		Student student = new Student(4,"김두화니","kdh@dgit.com",new Date(),new PhoneNumber("010-3232-2222"));
		int res = studentService.updateStudentApi(student);
		Assert.assertEquals(1, res);
	}
	@Test
	public void lTestUpdateStudentAnnotation() {
		Student student = new Student(5, "김두화니", "kdh@dgit.com", new Date(),new PhoneNumber("010-3232-2222"));
		int res = studentService.updateStudentAnnotation(student);
		Assert.assertEquals(1, res);
	}
	@Test
	public void mTestDeletetudent() {
		Student std = new Student();
		std.setStudId(3);
		int res = studentService.deleteStudent(std);
		Assert.assertEquals(1, res);
	}
	@Test
	public void nTestDeleteStudentApi() {
		Student std = new Student();
		std.setStudId(4);
		int res = studentService.deleteStudentApi(std);
		Assert.assertEquals(1, res);
	}
	@Test
	public void oTestDeleteStudentAnnotation() {
		Student std = new Student();
		std.setStudId(5);
		int res = studentService.deleteStudentAnnotation(std);
		Assert.assertEquals(1, res);
	}
}
