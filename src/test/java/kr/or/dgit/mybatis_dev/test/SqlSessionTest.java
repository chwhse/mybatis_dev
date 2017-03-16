package kr.or.dgit.mybatis_dev.test;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;



public class SqlSessionTest {
	
	private static SqlSessionFactory sqlSessionFactory;
/*	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		sqlSessionFactory = MybatisSqlSessionFactory.getSqlSessionFactory();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		sqlSessionFactory = null;
	}

	@Test
	public void test() {
		Assert.assertNotNull(sqlSessionFactory.openSession());
	}*/

}
