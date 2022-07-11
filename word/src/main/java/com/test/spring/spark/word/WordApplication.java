package com.test.spring.spark.word;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.test.spring.spark.word"})
public class WordApplication {

	public static void main(String[] args) {
		SpringApplication.run(WordApplication.class, args);
	}

}
