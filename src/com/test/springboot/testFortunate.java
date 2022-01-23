package com.test.springboot;

import org.springframework.stereotype.Component;

@Component
public class testFortunate implements FortunateServices {

	@Override
	public String doLucky() {
		// TODO Auto-generated method stub
		return "You are lucky today!";
	}

}
