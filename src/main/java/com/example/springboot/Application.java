package com.example.springboot;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {


		try {
            System.out.println("-----------Application啟動 Sleep Start-----");
			Thread.sleep(30000);
			System.out.println("-----------Application啟動 Sleep End-----");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		SpringApplication.run(Application.class, args);
	}

	
}
