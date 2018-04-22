package com.sanit.springbootmybatis.demo;

import com.sanit.springbootmybatis.demo.controller.UserController;
import com.sanit.springbootmybatis.demo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.sanit.springbootmybatis.demo.dao")
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private UserController userController;

	@Test
	public void testAdd(){
		User user = new User();
		user.setUserName("test");
		user.setPassword("123456");
		user.setPhone("123456789");

		System.out.println("resp: "+userController.addUser(user));
	}


}
