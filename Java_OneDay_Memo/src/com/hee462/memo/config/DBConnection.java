package com.hee462.memo.config;
import javax.sql.DataSource;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
// 연결 통로 연결하고 저장하기
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
		
		TransactionFactory transaFactory 
		= new JdbcTransactionFactory();
		
		Environment environment
		= new Environment("dev", transaFactory, dataSource);
		
		Configuration configuration = new Configuration(environment);
		
		configuration.addMappers("com.hee462.memo.mappers");
		
		sqlSesiFactory 
		= new SqlSessionFactoryBuilder().build(configuration);
		
	}
	public static SqlSessionFactory getFactory() {
		return sqlSesiFactory;
	}
	
	
}
