package com.hootboard.User.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hootboard.User.model.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {

}
