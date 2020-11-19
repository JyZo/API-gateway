package cal.fallback;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;

import com.netflix.hystrix.exception.HystrixTimeoutException;

public class DevideServiceFallback implements FallbackProvider{

	private static final String DEFAULT_MESSAGE = "devide service failed";
	
	@Override
	public String getRoute() {
		// TODO Auto-generated method stub
		return "devide";
	}

	@Override
	public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
        if (cause instanceof HystrixTimeoutException) {
            return new GatewayClientResponse(HttpStatus.GATEWAY_TIMEOUT, DEFAULT_MESSAGE);
        } else {
            return new GatewayClientResponse(HttpStatus.INTERNAL_SERVER_ERROR, DEFAULT_MESSAGE);
        }
	}
}

