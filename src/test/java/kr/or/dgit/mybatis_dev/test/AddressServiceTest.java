package kr.or.dgit.mybatis_dev.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.Address;
import kr.or.dgit.mybatis_dev.dto.Course;
import kr.or.dgit.mybatis_dev.dto.Gender;
import kr.or.dgit.mybatis_dev.dto.Tutor;
import kr.or.dgit.mybatis_dev.services.AddressService;
import kr.or.dgit.mybatis_dev.services.TutorService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AddressServiceTest {
	private static AddressService addressService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass()");
		addressService = addressService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()");
		addressService = null;
	}
	
	@Before
	public void setUp(){
		System.out.println("setUp()");
	}
	@After
	public void tearDown(){
		System.out.println("tearDown()");
	}

	@Test
	public void aTestSelectAdderessByAddrIdAndState(){
		Address address = addressService.selectAdderessByAddrIdAndState("CA", "92110");
		Assert.assertNotNull(address);
	} 
	
	@Test
	public void bTestSelectAdderessByAddrIdAndStateForMap(){
		Map<String, Object> param = new HashMap<>();
		param.put("state", "CA");
		param.put("zip", "92110");
		
		Address address = addressService.selectAdderessByAddrIdAndStateForMap(param);
		Assert.assertNotNull(address);
	}
	
	@Test
	public void cTestSelectAddressByAll(){
		RowBounds rowBounds = new RowBounds(0,3);
		
		List<Address> lists = addressService.selectAddressByAll(rowBounds);
		
		Assert.assertNotNull(lists);
	} 

}
