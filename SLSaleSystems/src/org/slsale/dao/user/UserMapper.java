package org.slsale.dao.user;

import org.slsale.pojo.user.User;

public interface UserMapper {

	//登录
	public User getLoginUser(User user)throws Exception;
	
	//新增
	public int addUser(User user)throws Exception;
	
}
