package com.example.ConfigurerAdapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class mvccconfiguration implements WebMvcConfigurer {

	
	@Bean
	public managementAdapter getmanagementAdapter()
	{
		return new managementAdapter();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		InterceptorRegistration registration = registry.addInterceptor(getmanagementAdapter());

		registration.addPathPatterns("/**"); // 拦截所有路径

		registration.excludePathPatterns("/android/**", "/Aipface/**", "/pc/admin/**"); // 不拦截的路径
	}

}
