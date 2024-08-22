package com.log_generator.log_generator;

import co.elastic.apm.attach.ElasticApmAttacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogGeneratorApplication {

	public static void main(String[] args) {
		//to run application by Elastic APM (and load properties file)
		ElasticApmAttacher.attach("elasticapm.properties");
				//System.setProperty("elastic.apm.agent.path","elastic-apm-agent-1.51.0.jar");
		SpringApplication.run(LogGeneratorApplication.class, args);
	}

}
