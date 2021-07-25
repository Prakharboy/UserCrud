package com.hootboard.User.service;


import java.util.List;

import com.hootboard.User.model.UserInfo;


public interface UserInfoservice {
	

	public List<UserInfo> getAllUsers();

	public String deleteUser(int userId);

	public UserInfo getUserById(int userId);

	public int saveOrUpdateUser(UserInfo userInfo);

}
