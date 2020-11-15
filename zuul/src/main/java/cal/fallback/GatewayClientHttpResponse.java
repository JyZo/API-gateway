package cal.fallback;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;

public class GatewayClientHttpResponse implements ClientHttpResponse {

	public GatewayClientHttpResponse(HttpStatus internalServerError, String defaultMessage) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public InputStream getBody() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpHeaders getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpStatus getStatusCode() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRawStatusCode() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getStatusText() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

}
