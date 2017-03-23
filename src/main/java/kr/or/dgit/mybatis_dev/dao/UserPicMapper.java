package kr.or.dgit.mybatis_dev.dao;

import kr.or.dgit.mybatis_dev.dto.UserPICS;

public interface UserPicMapper {
	int insertUserPic(UserPICS userPic);
	UserPICS selectUserPicById(int id);
}
