package br.com.sooper.springeurekafeignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringEurekaFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaFeignClientApplication.class, args);
	}

}
