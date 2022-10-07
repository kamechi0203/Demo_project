package com.example.demo_project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo_project.entity.Person;
import com.example.demo_project.service.ifs.Active;
import com.example.demo_project.service.ifs.PersonService;

@SpringBootTest
class DemoProjectApplicationTests {

//	@Autowired	
//	private Active act;
	@Autowired
	private PersonService personservice;

//	private PersonService personService;

//	@Test
//	public void contextLoads() {
//		act.fly(2, "YEEE");
	@Test
	public void contexLoads() {
		Person per = personservice.getPersonInfo("YYY");
		System.out.println(per.getId());

	}

//		Person per = personService.getPersonInfo("YYY");
//		System.out.println(per.getId());
}
