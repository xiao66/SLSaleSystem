package org.slsale.service.user;

import org.slsale.pojo.user.User;

public interface UserService {
	
	//登录
	public User getLoginUser(User user) throws Exception;
	
	//新增
	public int addUser(User user) throws Exception;

}
