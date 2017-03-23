package kr.or.dgit.mybatis_dev.dao;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.UserPICS;

public class UserMapperImpl implements UserPicMapper {
	private String nameSpace="kr.or.dgit.mybatis_dev.dao.UserPicMapper.";
	private static final Log log = LogFactory.getLog(UserMapperImpl.class);
	private SqlSession sqlSession;
	
	
	public UserMapperImpl(SqlSession sqlSession) {
		super();
		this.sqlSession = sqlSession;
	}

	@Override
	public int insertUserPic(UserPICS userPic) {
		log.debug("insertUserPic()");
		return sqlSession.insert(nameSpace+"insertUserPic", userPic);
	}

	@Override
	public UserPICS selectUserPicById(int id) {
		log.debug("selectUserPicById()");
		return sqlSession.selectOne(nameSpace+"selectUserPicById", id);
	}

}
