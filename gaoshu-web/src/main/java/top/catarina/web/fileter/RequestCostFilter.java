package top.catarina.web.fileter;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author langhsu on 2015/7/10.
 */
@Component
public class RequestCostFilter implements Filter {
    private Logger log = Logger.getLogger(RequestCostFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		StopWatch stopWatch = new StopWatch(System.currentTimeMillis() + "");
		stopWatch.start();
		chain.doFilter(request, response);
		stopWatch.stop();

		log.debug(httpRequest.getRequestURI() + " -> request cost - " + stopWatch.getTotalTimeMillis());
    }

    @Override
    public void destroy() {

    }
}
