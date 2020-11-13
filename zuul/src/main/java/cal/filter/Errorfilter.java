package cal.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class Errorfilter extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return RequestContext.getCurrentContext().getThrowable() != null;
	}

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		Throwable throwable = RequestContext.getCurrentContext().getThrowable();
        System.out.printf("Exception was thrown in filters: ", throwable);
        return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "error";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
