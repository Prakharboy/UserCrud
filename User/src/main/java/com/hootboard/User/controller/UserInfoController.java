package com.hootboard.User.controller;

import java.util.List;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hootboard.User.model.UserInfo;
import com.hootboard.User.service.UserInfoservice;

@RestController
public class UserInfoController {
	org.slf4j.Logger logger = LoggerFactory.getLogger(UserInfoController.class);
	
	@Autowired  
	UserInfoservice service;
	
	
	@PostMapping("/saveUserInfo")  
	private ResponseEntity<?> saveUser(@RequestBody UserInfo userInfo)   
	{  //request validation here
		 logger.info("An INFO Message");
		    return new ResponseEntity<>(service.saveOrUpdateUser(userInfo), HttpStatus.OK);
		
	}  

	@PutMapping("/updateUserInfo")  
	private ResponseEntity<?> update(@RequestBody UserInfo userInfo)   
	{  
		return new ResponseEntity<>(service.saveOrUpdateUser(userInfo), HttpStatus.OK);
	
	} 

	@GetMapping("/getUserInfo/{userId}")  
	private ResponseEntity<?> getUserInfoById(@PathVariable("userId") int userId)   
	{  
		return new ResponseEntity<>(service.getUserById(userId), HttpStatus.OK);
	
	}  
	  
	@DeleteMapping("/deleteUserInfo")
	private ResponseEntity<?> deleteUserInfo(@RequestParam(value = "userId") int userId)   
	{  
		return new ResponseEntity<>(service.deleteUser(userId), HttpStatus.OK);
		 
	} 
	
	@GetMapping("/userInfo")  
	private ResponseEntity<?> getAllUsers()   
	{  
		return new ResponseEntity<>(service.getAllUsers(), HttpStatus.OK);
	  
	}  
	
	

}
