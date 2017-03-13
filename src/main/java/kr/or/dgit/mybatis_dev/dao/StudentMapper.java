package kr.or.dgit.mybatis_dev.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kr.or.dgit.mybatis_dev.dto.Student;

public interface StudentMapper {
	Student findStudentByNo(Student student);
	Student findStudentByNoApi(Student student);  // Web에서 쓰는 방법 (spring)
	@Select("SELECT STUD_ID, NAME, EMAIL, PHONE, DOB FROM students where STUD_ID = #{studId}")
	Student findStudentByNoAnnotation(Student student);
	
	List<Student> findStudentByAll();
	List<Student> findStudentByAllApi();
	@Select("SELECT STUD_ID, NAME, EMAIL, PHONE, DOB FROM students")
	List<Student> findStudentByAllAnnotation();

	int insertStudent(Student student);
	int insertStudentApi(Student student);
	@Insert("INSERT INTO students (stud_id,name,email,phone,dob) values(#{studId},#{name},#{email},#{phone},#{dob})")
	int insertStudentAnnotation(Student student);
	
	int updateStudent(Student student);
	int updateStudentApi(Student student);
	@Update("UPDATE students set name=#{name}, email=#{email}, phone=#{phone}, dob=#{dob} where stud_id=${studId}")
	int updateStudentAnnotation(Student student);
	
	int deleteStudent(Student student);
	int deleteStudentApi(Student student);
	@Delete("DELETE FROM students where stud_id=#{studId}")
	int deleteStudentAnnotation(Student student);
	
}
