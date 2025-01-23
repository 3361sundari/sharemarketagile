package com.share.sharemarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SharemarketApplication {

	@GetMapping("/welcome")
	public String welcomeMessage(){
		System.out.println("Get Mapping!!!");
		return "Deployment is successful!!!";
	}
	public static void main(String[] args) {
		SpringApplication.run(SharemarketApplication.class, args);
	}

}
