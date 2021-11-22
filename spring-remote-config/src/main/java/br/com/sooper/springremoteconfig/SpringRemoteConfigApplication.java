package br.com.sooper.springremoteconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringRemoteConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRemoteConfigApplication.class, args);
	}

}
