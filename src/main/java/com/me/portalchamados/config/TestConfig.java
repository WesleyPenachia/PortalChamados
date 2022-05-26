package com.me.portalchamados.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.me.portalchamados.service.DBServives;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DBServives dbService;
	
	@Bean
	public void instanciaDB() {
		this.dbService.instaciaDB();
	}
}
