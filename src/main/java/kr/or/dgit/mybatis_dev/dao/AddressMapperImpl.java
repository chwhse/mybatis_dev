package kr.or.dgit.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.Address;

public class AddressMapperImpl implements AddressMapper {
	
	private String namespace = "kr.or.dgit.mybatis_dev.dao.AddressMapper.";
	private static final Log log = LogFactory.getLog(CourseMapperImpl.class);

	private SqlSession sqlSession;
	
	public AddressMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public Address selectAdderessByAddrIdAndState(String state, String zip) {
		log.debug("selectAdderessByAddrIdAndState()");
		return sqlSession.getMapper(AddressMapper.class).selectAdderessByAddrIdAndState(state, zip);
	}

	@Override
	public Address selectAdderessByAddrIdAndStateForMap(Map<String, Object> param) {
		log.debug("selectAdderessByAddrIdAndStateForMap()");
		return sqlSession.selectOne(namespace+"selectAdderessByAddrIdAndStateForMap", param);
	}

	@Override
	public List<Address> selectAddressByAll(RowBounds rowBounds) {
		log.debug("selectAddressByAll()");
		return sqlSession.selectList(namespace+"selectAddressByAll",null,rowBounds);
	}

}
