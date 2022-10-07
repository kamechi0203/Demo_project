package com.example.demo_project.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Person;
import com.example.demo_project.service.ifs.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Override
	public Person getPersonInfo(String id) {

		// TODO Auto-generated method stub
		Person per = new Person();

		per.setId(id);
		per.setName("AAA");
		per.setCity("BBB");
		per.setAge(30);

		return per;
	}

	public void getPersonInfo(Person per) {
		// TODO Auto-generated method stub

	}

}
