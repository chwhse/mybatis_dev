package kr.or.dgit.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

import kr.or.dgit.mybatis_dev.dto.Course;

public interface CourseMapper {
	public List<Course> searchCourse(Map<String, Object> param);
	public List<Course> searchChooseCourse(Map<String, Object> map);
	public List<Course> searchWhereCourse(Map<String, Object> map);
	public List<Course> searchTrimCourse(Map<String, Object> map);
	public List<Course> searchForeachCourseByTutors(Map<String, Object> map);
	
}
