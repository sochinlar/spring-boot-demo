package com.wh.springboot.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/index")
public class IndexController {
	
	@RequestMapping
	public String index(){
		return "hello world";
	}
	
	@RequestMapping("get")
	public List<String> get(){
		List<String> list = new ArrayList<>();
		
		list.add("adjif");
		list.add("==d");
		
		return list;
	}
}
