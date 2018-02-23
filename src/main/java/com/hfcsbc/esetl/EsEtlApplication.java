package com.hfcsbc.esetl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchAutoConfiguration;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchDataAutoConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {ElasticsearchAutoConfiguration.class, ElasticsearchDataAutoConfiguration.class})
@EnableElasticsearchRepositories(basePackages = "com.hfcsbc.esetl.repository")
@EnableJpaRepositories(basePackages = "com.hfcsbc.esetl.repository.jpa")
public class EsEtlApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsEtlApplication.class, args);
	}
}
