package com.driveManager.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.driveManager.vo.User;

@Mapper
public interface UserMapper {
	@Select("SELECT * FROM users WHERE user_name = LOWER(#{userName})")
	User findByUsername(String userName);

	@Select("SELECT COUNT(*) FROM users WHERE user_name = LOWER(#{userName})")
	int userNameDupChk(Map<String, Object> params);

	@Insert("INSERT INTO users(user_name, password, email) VALUES(LOWER(#{userName}), #{password}, #{email})")
	int userInsert(Map<String, Object> params);

	@Insert("INSERT INTO authorities(user_no, authority) VALUES(#{userNo}, #{authority})")
	int insertAuthority(Map<String, Object> params);

	@Select("SELECT authority FROM authorities WHERE user_no = #{userNo}")
	List<String> findAuthoritiesByUserNo(Integer userNo);


}

