package kr.or.dgit.mybatis_dev.test;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_dev.dto.UserPICS;
import kr.or.dgit.mybatis_dev.services.UserPicService;

public class UserPicServiceTest {
	private static UserPicService userPicService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass()");
		userPicService = UserPicService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()");
		userPicService = null;
	}
	

/*	@Test
	public void aTestInsertUserPic(){
		byte[] pic = null;
		File file = new File(System.getProperty("user.dir")+"\\DataFiles\\merry.jpg");
		
		try(InputStream is = new FileInputStream(file);){
			pic = new byte[is.available()];
			is.read(pic);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		UserPICS userPic = new UserPICS(1, "메리", pic,"요거프레소");
		int res = userPicService.insertUserPic(userPic);
		
		
	}
	
	@Test
	public void bTestFindUserPicById(){
		UserPICS userPic = userPicService.findUserPicById(1);
		byte[] pic = userPic.getPic();
		
		File file = new File(System.getProperty("user.dir")+"\\Download\\전지현.jpg");
		
		try (OutputStream os = new FileOutputStream(file);){
			os.write(pic);
			os.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}*/
	
	

}
