package kr.or.dgit.mybatis_dev.services;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.StudentMapper;
import kr.or.dgit.mybatis_dev.dao.StudentMapperImpl;
import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class StudentService {
	private static final Log log = LogFactory.getLog(StudentService.class);
	private static final StudentService instance = new StudentService();
	public static StudentService getInstance() {return instance;}

	private String nameSpace = "kr.or.dgit.mybatis_dev.dao.StudentMapper";
	
	public Student selectStudentByNoForResultMap(Student student){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentByNoForResultMap(student);
		}
	}
	
	public List<Student> selectStudentByAllForResultMap(){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentByAllForResultMap();
		}
	}
	
	public Map<String, Object> selectStudentByNoForHashMap(Student student){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentByNoForHashMap(student);
		}
	}
	
	public List<Map<String, Object>> selectStudentByAllForHashMap(){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentByAllForHashMap();
		}
	}
	
	public Student selectStudentByNoWithAddress(Student student){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentByNoWithAddress(student);
		}
	}
	
	public Student selectStudentByNoAssociationAddress(Student student){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentByNoAssociationAddress(student);
		}
	}
	public int updateStudent(Student student){
		int res = -1;
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			res = studentMapper.updateStudent(student);
			sqlSession.commit(); 
			
		}
		return res;
	}
	public int insertStudent(Student student){
		int res = -1;
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			res = studentMapper.insertStudent(student);
			sqlSession.commit(); 
			
		}
		return res;
	}
	public int deleteStudent(Student student){
		int res = -1;
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			res = studentMapper.deleteStudent(student);
			sqlSession.commit(); 
			
		}
		return res;
	}
	public int insertEnumStudent(Student student){
		int res = -1;
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			res = studentMapper.insertEnumStudent(student);
			sqlSession.commit(); 
		}
		return res;
	}

	
}
