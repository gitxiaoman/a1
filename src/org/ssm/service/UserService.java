package org.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.ssm.dao.UserDao;
import org.ssm.model.User;

@Component(value="userService")
public class UserService {
	
	@Autowired
	private UserDao userDao ;
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void register(User user){
		 userDao.register(user) ;
		 //验证事务
		 User us = new User() ;
		 us.setUserId(1) ;  //mybatis将新增后的id值赋给userId
		 us.setUserName("xiaoqing");
		 us.setUserPass("pass") ;
		 us.setNickName("qingqing") ;
		 userDao.register(us);
	}

}
