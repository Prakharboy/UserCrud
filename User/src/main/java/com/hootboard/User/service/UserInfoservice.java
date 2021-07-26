package com.hootboard.User.service;


import java.util.List;

import com.hootboard.User.model.UserInfo;


public interface UserInfoservice {
	

	public List<UserInfo> getAllUsers();

	public String deleteUser(Long userId);

	public UserInfo getUserById(Long userId);

	public UserInfo saveUser(UserInfo userInfo);
	
	public UserInfo updateUser(UserInfo userInfo);

}
