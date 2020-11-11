package cal.devide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DevideApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevideApplication.class, args);
	}

}
