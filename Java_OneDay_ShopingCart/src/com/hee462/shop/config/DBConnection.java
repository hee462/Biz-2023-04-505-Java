package com.hee462.shop.config;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class DBConnection {
	
	private static SqlSessionFactory sqlSesiFactory;
	static {
		DataSource dataSource =
				new PooledDataSource(
						DBCtract.JDBC_DRIVER,
						DBCtract.DB_URL,
						DBCtract.USER_NAME,
						DBCtract.PASSWORD
						);
		
		TransactionFactory transFactory = new JdbcTransactionFactory();
		
		Environment environment = new Environment("dev", transFactory, dataSource);
		
		Configuration configuration = new Configuration(environment);
		configuration.addMappers("com.hee462.shop.mappers");
		
		sqlSesiFactory = new SqlSessionFactoryBuilder().build(configuration);
	}
	public static SqlSessionFactory getFactory() {
		return sqlSesiFactory;
		
	}
	
	
	
	
}
