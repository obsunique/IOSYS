/**
 * 
 */
package com.example.ConfigurerAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author hadoop
 *
 */

public class managementAdapter implements HandlerInterceptor {

	/**
	 * 
	 */

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		Cookie[] cookies = request.getCookies();
		if (cookies == null || cookies.length < 1) {
			request.getRequestDispatcher("/Turing/login").forward(request, response);
			return false;
		} else {
			for (Cookie cookie : cookies) {
				// 如果能成立，就表示找到了上一次访问的时间。
				if ("TOKEN_ADMIN".equals(cookie.getName())) {
					return true;
				}
			}
		}
		request.getRequestDispatcher("/Turing/false").forward(request, response);
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

}
