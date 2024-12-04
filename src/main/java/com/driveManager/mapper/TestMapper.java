package com.driveManager.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.driveManager.vo.Test;

@Mapper
public interface TestMapper {
	
//	@Select("SELECT * FROM test_table")
//	List<Test> findAll();
	List<Test> findAll();

}
