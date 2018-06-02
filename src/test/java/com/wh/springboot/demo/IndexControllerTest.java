package com.wh.springboot.demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.wh.springboot.demo.controller.IndexController;


@RunWith(SpringRunner.class)
@SpringBootTest(classes=IndexController.class)
public class IndexControllerTest{
	private MockMvc mvc;
	
	@Before
	public void before(){
		this.mvc=MockMvcBuilders.standaloneSetup(new IndexController()).build();
	}
	
	@Test
	public void contextLoads() throws Exception{
		RequestBuilder req= MockMvcRequestBuilders.get("/index");
		MvcResult mvcResult = mvc.perform(req).andReturn() ;
		
		
	}

}








