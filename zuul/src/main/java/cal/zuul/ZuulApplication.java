package cal.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.context.annotation.Bean;
import cal.fallback.AddServiceFallback;
import cal.fallback.DevideServiceFallback;
import cal.fallback.MultiplationServiceFallback;
import cal.fallback.SubstractServiceFallback;
import cal.filter.Errorfilter;
import cal.filter.Postfilter;
import cal.filter.Prefilter;
import cal.filter.Routefilter;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}

	@Bean
    public Prefilter preFilter() {
        return new Prefilter();
    }
    
	@Bean
	public Postfilter postFilter() {
		return new Postfilter();
	}
    
    @Bean
    public Errorfilter errorFilter() {
        return new Errorfilter();
    }
    
    @Bean
    public Routefilter routeFilter() {
        return new Routefilter();
    }
    
    @Bean
    public FallbackProvider addServiceFallback() {
    	return new AddServiceFallback();
    }
    
    @Bean
    public FallbackProvider substractServiceFallback() {
    	return new SubstractServiceFallback();
    }
    
    @Bean
    public FallbackProvider multiplationServiceFallback() {
    	return new MultiplationServiceFallback();
    }
    
    @Bean
    public FallbackProvider devideServiceFallback() {
    	return new DevideServiceFallback();
    }
}
