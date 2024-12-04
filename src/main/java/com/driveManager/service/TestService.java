package com.driveManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.driveManager.mapper.TestMapper;
import com.driveManager.vo.Test;

@Service
public class TestService { 

	@Autowired
	private TestMapper testMapper;
	
	public List<Test> getAllTest() {
        return testMapper.findAll();
    }

	
}
