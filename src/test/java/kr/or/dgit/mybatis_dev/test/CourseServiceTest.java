package kr.or.dgit.mybatis_dev.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.Course;
import kr.or.dgit.mybatis_dev.services.CourseService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CourseServiceTest {
	private static CourseService courseService;
/*
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass()");
		courseService = CourseService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()");
		courseService = null;
	}
	
	@Before
	public void setUp(){
		System.out.println("setUp()");
	}
	@After
	public void tearDown(){
		System.out.println("tearDown()");
	}

	
/	@Test
	public void aTestSearchCourse(){
		Map<String, Object> param = new HashMap<>();
		param.put("tutorId", 1);
		param.put("courseName", "%java%");
		param.put("startDate", "2013-01-01");
		param.put("endDate", "2013-05-01");
		
		List<Course> searchCourse = courseService.searchCourse(param);
		Assert.assertNotNull(searchCourse);
	}
	@Test
	public void bTestSearchChooseCourse(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("searchBy","Tutor");
		map.put("tutorId", 1);
		
		map.replace("searchBy", "CourseName");
		map.remove("tutorId");
		map.put("courseName", "%java%");
		
		List<Course> searchChooseCourse = courseService.searchChooseCourse(map);
		Assert.assertNotNull(searchChooseCourse);
	}
	@Test
	public void cTestSearchWhereCourse(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("tutorId", 1);
		map.clear();
		map.put("courseName", "%java%");
		map.clear();
		map.put("startDate", "2013-01-01");
		map.put("endDate", "2013-05-01");
		
		List<Course> searchWhereCourse = courseService.searchWhereCourse(map);
		Assert.assertNotNull(searchWhereCourse);
	}
	@Test
	public void dTestSearchTrimCourse(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("tutorId", 1);
		map.put("courseName", "%java%");
		
		List<Course> searchTrimCourse = courseService.searchTrimCourse(map);
		Assert.assertNotNull(searchTrimCourse);
	}
	@Test
	public void eTestsearchForeachCourseByTutors(){
		List<Integer> tutorIds = new ArrayList<Integer>();
		tutorIds.add(1);
//		tutorIds.add(2);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("tutorIds", tutorIds);
		
		List<Course> searchForeachCourseByTutors = courseService.searchForeachCourseByTutors(map);
		Assert.assertNotNull(searchForeachCourseByTutors);
	}*/

}
