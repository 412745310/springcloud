package com.chelsea.springcloud_zuul.filter;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * 过滤器
 * @author shevchenko
 *
 */
@Component
public class MyFilter extends ZuulFilter {

	@Override
	public Object run() {
		try{
			RequestContext ctx = RequestContext.getCurrentContext();
			HttpServletRequest request = ctx.getRequest();
			String token = request.getParameter("token");
			if(StringUtils.isBlank(token)) {
				ctx.setSendZuulResponse(false);
				ctx.setResponseStatusCode(401);
				ctx.getResponse().getWriter().write("token is empty");
			} else {
				ctx.setSendZuulResponse(true);
				ctx.setResponseStatusCode(200);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public String filterType() {
		return "pre";
	}

}
