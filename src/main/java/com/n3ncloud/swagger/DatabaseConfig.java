package com.n3ncloud.swagger;
 
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
 
@Configuration
//@MapperScan(basePackages="com.n3ncloud.swagger.mapper")
@EnableTransactionManagement
public class DatabaseConfig {
 
	/*
	 * @Bean public SqlSessionFactory sqlSessionFactory(DataSource dataSource)throws
	 * Exception { final SqlSessionFactoryBean sessionFactory =new
	 * SqlSessionFactoryBean(); sessionFactory.setDataSource(dataSource);
	 * PathMatchingResourcePatternResolver resolver =new
	 * PathMatchingResourcePatternResolver();
	 * sessionFactory.setMapperLocations(resolver.getResources(
	 * "classpath:mybatis/*.xml")); return sessionFactory.getObject(); }
	 * 
	 * @Bean public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory
	 * sqlSessionFactory)throws Exception { final SqlSessionTemplate
	 * sqlSessionTemplate =new SqlSessionTemplate(sqlSessionFactory); return
	 * sqlSessionTemplate; }
	 */
 
}