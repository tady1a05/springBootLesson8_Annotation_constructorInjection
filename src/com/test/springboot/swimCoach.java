package com.test.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class swimCoach implements Coach{
	FortunateServices fs;
	
	@Autowired
	public swimCoach(FortunateServices fs) {
		this.fs = fs;
	}
	
	public swimCoach() {
	}
	
	@Override
	public String doWorkOut() {
		return "Swim 100m";
	}
	
	public String doLucky() {
		return fs.doLucky();
	}
}
