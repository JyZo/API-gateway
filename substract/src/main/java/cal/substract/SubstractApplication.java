package cal.substract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SubstractApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubstractApplication.class, args);
	}
}
