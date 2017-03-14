package kr.or.dgit.mybatis_dev.services;

import java.util.List;
import java.util.logging.Logger;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.StudentMapper;
import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class StudentService {
	private static final Log log = LogFactory.getLog(StudentService.class);
	private String nameSpace = "kr.or.dgit.mybatis_dev.dao.StudentMapper";
	
	public Student selectStudentByNoForResultMap(Student student){
		log.debug("selectStudentByNoForResultMap()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.selectOne(nameSpace+".selectStudentByNoForResultMap", student);
		}
	}
	
	public List<Student> selectStudentByAllForResultMap(){
		log.debug("selectStudentByAllForResultMap()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.getMapper(StudentMapper.class).selectStudentByAllForResultMap();
		}
	}
	
	public Student findStudentByNo(Student student){
		log.debug("findStudentByNo()");
		try(SqlSession sqlSesseion = MybatisSqlSessionFactory.openSession()){
			return sqlSesseion.getMapper(StudentMapper.class).findStudentByNo(student);
		}
	}
	public Student findStudentByNoApi(Student student){
		log.debug("findStudentByNoApi()");
		try(SqlSession sqlSesseion = MybatisSqlSessionFactory.openSession()){
			return sqlSesseion.selectOne(nameSpace+".selectOne", student);
		}
	}
	public Student findStudentByNoAnnotation(Student student){
		log.debug("findStudentByNoAnnotation()");
		try(SqlSession sqlSesseion = MybatisSqlSessionFactory.openSession()){
			return sqlSesseion.getMapper(StudentMapper.class).findStudentByNoAnnotation(student);
		}
	}
	
	public List<Student> findStudentByAll(){
		log.debug("findStudentByAll()");
		try(SqlSession sqlSesseion = MybatisSqlSessionFactory.openSession()){
			return sqlSesseion.getMapper(StudentMapper.class).findStudentByAll();
		}
	}
	
	public List<Student> findStudentByAllApi(){
		log.debug("selectStudentByAllApi()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.selectList(nameSpace+".selectAll");
		}
	}
	public List<Student> findStudentByAllAnnotation(){
		log.debug("selectStudentByAllAnnotation()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.getMapper(StudentMapper.class).findStudentByAllAnnotation();
		}
	}
	
	public int insertStudent(Student student){
		log.debug("insertStudent(Student student)");
		try(SqlSession sqlSesseion = MybatisSqlSessionFactory.openSession()){
			StudentMapper studentDao = sqlSesseion.getMapper(StudentMapper.class);
			int res = studentDao.insertStudent(student);
			sqlSesseion.commit();
			return res;
		}
	}
	
	public int insertStudentApi(Student student){
		log.debug("insertStudentApi(Student student");
		int res = -1;
		try(SqlSession sqlSesseion = MybatisSqlSessionFactory.openSession()){
			res = sqlSesseion.insert(nameSpace+".insertStudent", student);
			sqlSesseion.commit();
			return res;
		}
	}
	
	public int insertStudentAnnotation(Student student){
		log.debug("insertStudentAnnotation(Student student)");
		try(SqlSession sqlSesseion = MybatisSqlSessionFactory.openSession()){
			StudentMapper studentDao = sqlSesseion.getMapper(StudentMapper.class);
			int res = studentDao.insertStudentAnnotation(student);
			sqlSesseion.commit();
			return res;
		}
	}
	
	public int updateStudent(Student student){
		log.debug("updateStudent(Student student)");
		try(SqlSession sqlSesseion = MybatisSqlSessionFactory.openSession()){
			StudentMapper studentDao = sqlSesseion.getMapper(StudentMapper.class);
			int res = studentDao.updateStudent(student);
			sqlSesseion.commit();
			return res;
		}
	}
	
	public int updateStudentApi(Student student){
		log.debug("updateStudentApi(Student student)");
		int res = -1;
		try(SqlSession sqlSesseion = MybatisSqlSessionFactory.openSession()){
			res = sqlSesseion.update(nameSpace+".updateStudent", student);
			sqlSesseion.commit();
			return res;
		}
	}

	public int updateStudentAnnotation(Student student){
		log.debug("updateStudentAnnotation(Student student)");
		try(SqlSession sqlSesseion = MybatisSqlSessionFactory.openSession()){
			StudentMapper studentDao = sqlSesseion.getMapper(StudentMapper.class);
			int res = studentDao.updateStudentAnnotation(student);
			sqlSesseion.commit();
			return res;
		}		
	}
	
	public 	int deleteStudent(Student student){
		log.debug("deleteStudent(Student student)");
		int res = -1;
		try(SqlSession sqlSesseion = MybatisSqlSessionFactory.openSession()){
			res = sqlSesseion.delete(nameSpace+".deleteStudent", student);
			sqlSesseion.commit();
			return res;
		}
	}
	
	public int deleteStudentApi(Student student){
		log.debug("deleteStudentApi(Student student)");
		try(SqlSession sqlSesseion = MybatisSqlSessionFactory.openSession()){
			StudentMapper studentDao = sqlSesseion.getMapper(StudentMapper.class);
			int res = studentDao.deleteStudent(student);
			sqlSesseion.commit();
			return res;
		}
	}
	
	public int deleteStudentAnnotation(Student student){
		log.debug("deleteStudentAnnotation(Student student)");
		try(SqlSession sqlSesseion = MybatisSqlSessionFactory.openSession()){
			StudentMapper studentDao = sqlSesseion.getMapper(StudentMapper.class);
			int res = studentDao.deleteStudent(student);
			sqlSesseion.commit();
			return res;
		}
	}
	
}
