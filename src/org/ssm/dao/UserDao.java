package org.ssm.dao;

import org.apache.ibatis.annotations.Insert;
import org.ssm.model.User;

public interface UserDao {
	
	@Insert("insert into user(userName,userPass,nickName) values(#{userName},#{userPass},#{nickName})")
	public void register(User user) ;

}
