package com.nttdata.configserverbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerBankApplication.class, args);
	}

}
