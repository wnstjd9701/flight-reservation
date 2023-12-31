package com.project.myapp.common.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


public class LoggingInterceptor implements HandlerInterceptor {

	static final Logger logger= LoggerFactory.getLogger(LoggingInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
	    String requestURL = request.getRequestURL().toString();
	    String contextPath = request.getContextPath();
	    String requestURI = requestURL.replaceFirst(request.getScheme() + "://", "")
	                                  .replaceFirst(":" + request.getServerPort(), "")
	                                  .replaceFirst(request.getServerName(), "")
	                                  .replaceFirst(contextPath, "");

	    logger.info("요청 URL: " + requestURI);

		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
