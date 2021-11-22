package br.com.sooper.springeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class SpringEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaClientApplication.class, args);
	}

}
