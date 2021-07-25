package com.hootboard.User.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hootboard.User.model.UserInfo;
import com.hootboard.User.repository.UserInfoRepository;

@Service
public class UserInfoserviceImpl implements UserInfoservice {
	
	@Autowired
	UserInfoRepository userInfoRepository;

	public List<UserInfo> getAllUsers() {
		// TODO Auto-generated method stub
		return userInfoRepository.findAll();
	}

	public String deleteUser(int userId) {
		if(userInfoRepository.findById((long) userId).isPresent())
		userInfoRepository.deleteById((long) userId);
		return "success";
		
	}

	public UserInfo getUserById(int userId) {
		return userInfoRepository.findById((long) userId).get();
		
	}

	public int saveOrUpdateUser(UserInfo userInfo) {
		if(userInfoRepository.save(userInfo)!=null)
			return 0;
		else
			return 1;
		
	}

}
