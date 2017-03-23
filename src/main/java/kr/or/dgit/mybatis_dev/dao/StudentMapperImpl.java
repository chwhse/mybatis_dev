package kr.or.dgit.mybatis_dev.dao;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.Student;

public class StudentMapperImpl implements StudentMapper {
	private String nameSpace = "kr.or.dgit.mybatis_dev.dao.StudentMapper";
	private static final Log log = LogFactory.getLog(StudentMapperImpl.class);

	private SqlSession sqlSession;
	
	public StudentMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public Student selectStudentByNoForResultMap(Student student) {
		log.debug("selectStudentByNoForResultMap()");
		return sqlSession.selectOne(nameSpace+".selectStudentByNoForResultMap", student);
	}

	@Override
	public List<Student> selectStudentByAllForResultMap() {
		log.debug("selectStudentByAllForResultMap()");
		return sqlSession.getMapper(StudentMapper.class).selectStudentByAllForResultMap();
	}

	@Override
	public Map<String, Object> selectStudentByNoForHashMap(Student student) {
		log.debug("selectStudentByNoForHashMap()");
		return sqlSession.selectOne(nameSpace+".selectStudentByNoForHashMap", student);
	
	}

	@Override
	public List<Map<String, Object>> selectStudentByAllForHashMap() {
		log.debug("selectStudentByAllForHashMap()");
		return sqlSession.selectList(nameSpace+".selectStudentByAllForHashMap");
	
	}

	@Override
	public Student selectStudentByNoWithAddress(Student student) {
		log.debug("selectStudentByNoWithAddress()");
		return sqlSession.selectOne(nameSpace+".selectStudentByNoWithAddress",student);
	
	}

	@Override
	public Student selectStudentByNoAssociationAddress(Student student) {
		log.debug("selectStudentByNoAssociationAddress()");
		return sqlSession.selectOne(nameSpace+".selectStudentByNoAssociationAddress",student);
	
	}

	@Override
	public int updateStudent(Student student) {
		log.debug("updateStudent()");
		return sqlSession.update(nameSpace+".updateStudent",student);
	}

	@Override
	public int insertStudent(Student student) {
		log.debug("insertStudent()");
		return sqlSession.insert(nameSpace+".insertStudent",student);
	}

	@Override
	public int deleteStudent(Student student) {
		log.debug("deleteStudent()");
		return sqlSession.delete(nameSpace+".deleteStudent",student);
	}

	@Override
	public int insertEnumStudent(Student student) {
		log.debug("insertEnumStudent()");
		return sqlSession.insert(nameSpace+".insertEnumStudent",student);
	}

}
