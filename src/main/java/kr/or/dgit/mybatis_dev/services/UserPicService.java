package kr.or.dgit.mybatis_dev.services;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.UserMapperImpl;
import kr.or.dgit.mybatis_dev.dao.UserPicMapper;
import kr.or.dgit.mybatis_dev.dto.UserPICS;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class UserPicService {
	private static final UserPicService instance = new UserPicService();
	public static UserPicService getInstance() {return instance;}

	
	public UserPICS findUserPicById(int id){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.getMapper(UserPicMapper.class).selectUserPicById(id);
		}
	}
	public int insertUserPic(UserPICS userPic){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			UserPicMapper userPicMapper = new UserMapperImpl(sqlSession);
			int res = userPicMapper.insertUserPic(userPic);
			sqlSession.commit();
			return res;
		}
	}
	
}
