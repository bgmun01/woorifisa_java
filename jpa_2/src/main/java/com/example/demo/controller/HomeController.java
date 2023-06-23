package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.service.RepoService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {
	
	RepoService service;
	// 주입방법 생성자
	
	
	@Autowired
	public HomeController(RepoService service) {
		this.service = service;
	}
	
	
	@RequestMapping("/") //경로??
	public String index() { //String 을 반환하는 index
		return "index";
	}
		
	@RequestMapping("/hello")
	public String hello(@RequestParam String name, Model model)	 {
		log.debug("hello의 파라미터 : {}", name); // 1. 파라미터 처리
		// 2. 모델 연결
		String msg = service.helloService(name);
		//3. 화면에 전달할 값을 저장
		model.addAttribute("msg", msg);
		//3. forward 로 페이지 전환 : return 되는 페이지에 forward 로 호출 그냥return 하면 forward 로간다,
		return "hello";
	}
	
	@RequestMapping(value = "/onlypost",method = RequestMethod.POST)
	public String onlyPost() {
		return "";
		
	}
		
	}
