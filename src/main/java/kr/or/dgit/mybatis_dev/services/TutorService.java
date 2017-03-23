package kr.or.dgit.mybatis_dev.services;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.TutorMapper;
import kr.or.dgit.mybatis_dev.dto.Tutor;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class TutorService {
	private static final Log log = LogFactory.getLog(TutorService.class);
	private static final TutorService instance = new TutorService();
	public static TutorService getInstance() {return instance;}
	
	/*private String nameSpace = "kr.or.dgit.mybatis_dev.dao.TutorMapper";
	*/

	private TutorService() {}
	
	public Tutor selectTutorById(int id){
		log.debug("selectTutorById()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.getMapper(TutorMapper.class).selectTutorById(id);
		}
	}
	
	public int insertTutor(Tutor tutor){
		log.debug("insertTutor()");
		int res = -1;
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			res = sqlSession.getMapper(TutorMapper.class).insertTutor(tutor);
			sqlSession.commit();
		}
		return res;
	}
	
	

}
