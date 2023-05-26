package com.hee462.memo.mappers.impl;

public class MemoSQL {
	//SQL 문 만들어서 불러서 간단하게 사용할려고
	public static final String MEMO_INSERT
			= " INSERT INTO tbl_memo( "
			+ " m_seq , m_writer, m_date, m_subject, m_content) "
			+ " VALUES( "
			+ " #{m_seq},#{m_writer},#{m_date},#{m_subject},#{m_content}) ";
	
	
	public static final String MEMO_UPDATE 
			= " UPDATE tbl_memo "
			+ " SET m_writer = #{m_writer} ,"
			+ " m_date = #{m_date}, "
			+ " m_subject = #{m_subject}, "
			+ " m_content = #{m_content} "
			+ " WHERE m_seq = #{m_seq} ";
}
