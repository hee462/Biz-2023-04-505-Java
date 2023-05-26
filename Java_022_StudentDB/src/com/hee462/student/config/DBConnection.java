package com.hee462.student.config;


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
	//java에서 DB로 연결할때 사용하는 코드	
		DataSource dataSource
		 = new PooledDataSource(
				 DBContract.JDBC_DRIVER,
				 DBContract.DB_URL,
				 DBContract.USER_NAME,
				 DBContract.PASSWORD
				 );
		/*
		 * 여러개의 table에 대하여 CRUD를 실행할때
		 * 타이밍에 의한 데이터 sync 오류 등을 자체적으로 관리하는 도구
		 */
		TransactionFactory transactionFactory
		 = new  JdbcTransactionFactory();
		
		// mybatis를 사용하여 DBMS에 연결하기 위한 환경 설정
		Environment envirnoment
		= new Environment("dev", transactionFactory, dataSource);
		
		// 환경설정 등을 mybatis의 SqlSessionFactory 에게 전달하기 위한 객체
		Configuration configuration = new Configuration(envirnoment);
		// Dao interface가 저장되어 있는 package를 지정한다
		// MyBatis는 Dao interface 파일을 scan 하여 
		// Annotation 으로 설정된 SQL 명령문과
		// 각 method의 return type
		configuration.addMappers("com.hee462.student.mapper");
		
		sqlSesiFactory 
		 = new SqlSessionFactoryBuilder().build(configuration);

	}
	public static SqlSessionFactory getFactory() {
		return sqlSesiFactory;
	}
}
