package com.example.BS4;

import com.example.BS4.config.VarConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Bs4Application {

	@Autowired
	VarConfig varConfig;

	public static void main(String[] args) {
		SpringApplication.run(Bs4Application.class, args);
	}

	@PostConstruct
	private void executeInfo(){
		System.out.println("INFO VARCONFIG...");
		System.out.println(varConfig);
	}

}
