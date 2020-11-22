package cal.filter;



import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class Prefilter extends ZuulFilter{

	//private static Logger log = LoggerFactory.getLogger(Prefilter.class);
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		System.out.println("prefliter run!!");
//		RequestContext ctx = RequestContext.getCurrentContext();
//		HttpServletRequest request = ctx.getRequest();
//		log.info("url:"+request.getRequestURI().toString());
//		log.info("port:"+request.getServerPort());
//		log.info("port:"+request.getLocalPort());
//		log.info("port:"+request.getRemotePort());
//		
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
