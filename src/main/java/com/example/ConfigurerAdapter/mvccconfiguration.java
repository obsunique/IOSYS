package com.example.ConfigurerAdapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class mvccconfiguration implements WebMvcConfigurer{

	@Autowired
	private managementAdapter managementAdapter;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		InterceptorRegistration registration = registry.addInterceptor(managementAdapter);
		
		registration.addPathPatterns("/**"); //拦截所有路径
		
		registration.excludePathPatterns("/android/**","/Aipface/**"); //不拦截的路径
	}
	
}
