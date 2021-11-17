package pl.yuro.lolapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class LeagueOfLegendsApiConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeagueOfLegendsApiConsumerApplication.class, args);
	}

}
