package server.demo.seversamplecxsz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


//Enable server for configuration... 
@SpringBootApplication
@EnableEurekaServer
public class SeverSampleCxszApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeverSampleCxszApplication.class, args);
	}

}
// Hey I'm here