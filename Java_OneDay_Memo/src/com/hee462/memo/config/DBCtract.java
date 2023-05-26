package com.hee462.memo.config;

public class DBCtract {
	 //연결통로 만들기
	public static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USER_NAME ="C##myuser";
	public static final String PASSWORD ="12341234";
	
	public static class TABLE{
		public static final String MYUSER ="tbl_memo";
	}
	
	public static class COLUMN{
		public static final String M_SEQ =	"m_seq";
		public static final String M_WRITER = "	m_writer";
		public static final String M_DATE = "m_date";
		public static final String M_SUBJECT = "m_subject";
		public static final String M_CONTENT = "m_content";

	}
	
}
