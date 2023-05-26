package com.hee462.student.mapper.sql;

public class StudentSQL {
	
	// myBatis 에서 사용할 SQL 명령문에는 반드시 final 키워드가 있어야됨
	public static final String SUTDENT_INSERT 
			= " INSERT INTO tbl_student("
			+ "st_num, st_name, st_dept, st_grade, st_tel) "
			+ " VALUES("
			+ "#{st_num},#{st_name},#{st_dept},#{st_grade},#{st_tel})";
	
	public static final String SUTDENT_UPDATE 
			= " UPDATE tbl_student "
			+ " SET st_name = #{st_name} "
			+ " SET st_dept = #{st_dept} "
			+ " SET st_grade = #{st_grade} "
			+ " SET st_tel = #{st_tel} "
			+ " WHERE st_num = #{st_num} "; 
}
