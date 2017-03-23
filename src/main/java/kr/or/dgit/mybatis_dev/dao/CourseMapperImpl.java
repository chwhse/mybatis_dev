package kr.or.dgit.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.Course;

public class CourseMapperImpl implements CourseMapper {
	private String namespace = "kr.or.dgit.mybatis_dev.dao.CourseMapper.";
	private static final Log log = LogFactory.getLog(CourseMapperImpl.class);

	private SqlSession sqlSession;
	
	public CourseMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	
	@Override
	public List<Course> searchCourse(Map<String, Object> param) {
		log.debug("searchCourse()");
		return sqlSession.selectList(namespace+"searchCourse", param);
	}


	@Override
	public List<Course> searchChooseCourse(Map<String, Object> map) {
		log.debug("SearchChooseCourse()");
		return sqlSession.selectList(namespace+"SearchChooseCourse", map);
	}


	@Override
	public List<Course> searchWhereCourse(Map<String, Object> map) {
		log.debug("searchWhereCourse()");
		return sqlSession.selectList(namespace+"searchWhereCourse", map);
	}


	@Override
	public List<Course> searchTrimCourse(Map<String, Object> map) {
		log.debug("searchTrimCourse()");
		return sqlSession.selectList(namespace+"searchTrimCourse", map);
	}


	@Override
	public List<Course> searchForeachCourseByTutors(Map<String, Object> map) {
		log.debug("searchForeachCourseByTutors()");
		return sqlSession.selectList(namespace+"searchForeachCourseByTutors", map);
	}
	
	
}
