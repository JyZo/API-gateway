package cal.fallback;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.client.ClientHttpResponse;

public class AllServiceFallback implements FallbackProvider{

	@Override
	public String getRoute() {
		// TODO Auto-generated method stub
		return "*";
	}

	@Override
	public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
		// TODO Auto-generated method stub
		return null;
	}

}
