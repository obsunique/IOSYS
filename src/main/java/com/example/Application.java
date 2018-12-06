package com.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // controller返回页面,restcontroller返回json数据
@SpringBootApplication
public class Application {

	@RequestMapping("/helloworld")
	public String helloworld() {
		return "test";
	}

	public static void main(String[] args) throws IOException {
		// 程序启动入口
		// 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
		Properties properties = new Properties();
		InputStream devtools = Application.class.getClassLoader()
				.getResourceAsStream("application-devtools.properties");
		InputStream druidbase = Application.class.getClassLoader()
				.getResourceAsStream("application-druid-base.properties");
		InputStream druidbasedatabase = Application.class.getClassLoader()
				.getResourceAsStream("application-druid-database.properties");
		InputStream log4j = Application.class.getClassLoader().getResourceAsStream("application-log4j.properties");
		InputStream logging = Application.class.getClassLoader().getResourceAsStream("application-logging.properties");
		InputStream mvc = Application.class.getClassLoader().getResourceAsStream("application-mvc.properties");
		InputStream redis = Application.class.getClassLoader().getResourceAsStream("application-redis.properties");
		properties.load(devtools);
		properties.load(druidbase);
		properties.load(druidbasedatabase);
		properties.load(log4j);
		properties.load(logging);
		properties.load(mvc);
		properties.load(redis);
		SpringApplication app = new SpringApplication(Application.class);
		app.setDefaultProperties(properties);
		app.run(args);
	}
}
