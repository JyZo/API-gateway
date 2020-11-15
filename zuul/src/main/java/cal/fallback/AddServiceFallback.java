package cal.fallback;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import com.netflix.hystrix.exception.HystrixTimeoutException;

@Component
public class AddServiceFallback implements FallbackProvider{

	private static final String DEFAULT_MESSAGE = "Weather information is not available.";
	
	@Override
	public String getRoute() {
		// TODO Auto-generated method stub
		return "add";
	}

	@Override
	public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
		// TODO Auto-generated method stub
		if (cause instanceof HystrixTimeoutException) {
			return new GatewayClientHttpResponse(HttpStatus.INTERNAL_SERVER_ERROR,DEFAULT_MESSAGE);
		}
		return null;
	}

}
