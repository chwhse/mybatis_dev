package kr.or.dgit.mybatis_dev.services;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.AddressMapper;
import kr.or.dgit.mybatis_dev.dao.AddressMapperImpl;
import kr.or.dgit.mybatis_dev.dao.TutorMapper;
import kr.or.dgit.mybatis_dev.dto.Address;
import kr.or.dgit.mybatis_dev.dto.Tutor;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class AddressService {
	
	private static final AddressService instance = new AddressService();
	public static AddressService getInstance() {return instance;}
	
	
	private AddressService() {}
	
	public Address selectAdderessByAddrIdAndState(String state, String zip) {
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
		AddressMapper addressMapper = new AddressMapperImpl(sqlSession);
		return addressMapper.selectAdderessByAddrIdAndState(state, zip);
	}

	public Address selectAdderessByAddrIdAndStateForMap(Map<String, Object> param) {
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
		AddressMapper addressMapper = new AddressMapperImpl(sqlSession);
		return addressMapper.selectAdderessByAddrIdAndStateForMap(param);
	}
	public List<Address> selectAddressByAll(RowBounds rowBounds) {
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
		AddressMapper addressMapper = new AddressMapperImpl(sqlSession);
		return addressMapper.selectAddressByAll(rowBounds);
	}
	
	

}
