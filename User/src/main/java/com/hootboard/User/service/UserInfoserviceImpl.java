package com.hootboard.User.service;


import java.util.List;
import java.util.NoSuchElementException;

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

	public String deleteUser(Long userId) {
		if(userInfoRepository.findById(userId).isPresent())
		{userInfoRepository.deleteById((long) userId);
		return "success";}
		throw new NoSuchElementException("No such User");
		
	}

	public UserInfo getUserById(Long userId) {
		if(userInfoRepository.findById(userId).isPresent())
		return userInfoRepository.findById(userId).get();
		else
			throw new NoSuchElementException("No such User");
			
		
	}

	public UserInfo saveUser(UserInfo userInfo) {
		return userInfoRepository.save(userInfo);
		
	}
	public UserInfo updateUser(UserInfo userInfo) {
		if(userInfoRepository.findById(userInfo.getId()).isPresent())
			return userInfoRepository.save(userInfo);
		else
			throw new NoSuchElementException("No such User");
		
	}

}
