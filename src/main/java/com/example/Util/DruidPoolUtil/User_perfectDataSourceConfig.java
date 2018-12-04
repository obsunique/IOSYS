package com.example.Util.DruidPoolUtil;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

@Configuration
//扫描 Mapper 接口并容器管理
@MapperScan(basePackages = User_perfectDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "user_perfectSqlSessionFactory")
public class User_perfectDataSourceConfig {

 // 精确到 cluster 目录，以便跟其他数据源隔离
 static final String PACKAGE = "com.example.mapper.user_perfect";
 static final String MAPPER_LOCATION = "classpath:mapper/user_perfect/*.xml";

 @Value("${user_perfect.datasource.url}")
 private String url;

 @Value("${user_perfect.datasource.username}")
 private String user;

 @Value("${user_perfect.datasource.password}")
 private String password;

 @Value("${user_perfect.datasource.driverClassName}")
 private String driverClass;

 @Bean(name = "user_perfectDataSource")
 public DataSource clusterDataSource() {
     DruidDataSource dataSource = new DruidDataSource();
     dataSource.setDriverClassName(driverClass);
     dataSource.setUrl(url);
     dataSource.setUsername(user);
     dataSource.setPassword(password);
     return dataSource;
 }

 @Bean(name = "user_perfectTransactionManager")
 public DataSourceTransactionManager clusterTransactionManager() {
     return new DataSourceTransactionManager(clusterDataSource());
 }

 @Bean(name = "user_perfectSqlSessionFactory")
 public SqlSessionFactory clusterSqlSessionFactory(@Qualifier("user_perfectDataSource") DataSource clusterDataSource)
         throws Exception {
     final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
     sessionFactory.setDataSource(clusterDataSource);
     sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
             .getResources(User_perfectDataSourceConfig.MAPPER_LOCATION));
     return sessionFactory.getObject();
 }
 
 @Bean
 public ServletRegistrationBean statViewServle(){
     ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
     //白名单：
     servletRegistrationBean.addInitParameter("allow","192.168.1.218,127.0.0.1");
     //IP黑名单 (存在共同时，deny优先于allow) : 如果满足deny的即提示:Sorry, you are not permitted to view this page.
     servletRegistrationBean.addInitParameter("deny","192.168.1.100");
     //登录查看信息的账号密码.
     servletRegistrationBean.addInitParameter("loginUsername","druid");
     servletRegistrationBean.addInitParameter("loginPassword","123456");
     //是否能够重置数据.
     servletRegistrationBean.addInitParameter("resetEnable","false");
     return servletRegistrationBean;
 }
 
 @Bean
 public FilterRegistrationBean statFilter(){
     FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
     //添加过滤规则.
     filterRegistrationBean.addUrlPatterns("/*");
     //添加不需要忽略的格式信息.
     filterRegistrationBean.addInitParameter("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
     return filterRegistrationBean;
     }
}
