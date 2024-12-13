package com.driveManager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.driveManager.service.TestService;
import com.driveManager.vo.Test;

@Controller
public class Main {
	
	@Autowired
	private TestService testService;

	@GetMapping("/")
	public String mainPage() {
		System.out.println("메인페이지 실행");
		return "index.html";
	}
	
	@GetMapping("/dbTest")
	public String dbTest(Model model) {
		System.out.println("dbTest 실행");
		List<Test> list = testService.getAllTest();
		
		System.out.println(list);
		model.addAttribute("result", list);
		
		return "dbTestPage.html";
	}
	
	
	
	
	
	
}
