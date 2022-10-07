package com.example.demo_project.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Bird;
import com.example.demo_project.service.ifs.Active;


@Service
public class BirdActive implements Active {

	public static BirdActive birdactive;

	@Override
	public Bird fly(int age, String name) {
		// TODO Auto-generated method stub

		Bird bird = new Bird();
		bird.setAge(age);
		bird.setName(name);

		System.out.println("���~" + bird.getAge() + "��" + ',' + bird.getName() + "���b��");

		return bird;

	}

}
