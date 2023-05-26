package com.hee462.student.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hee462.student.mapper.sql.StudentSQL;
import com.hee462.student.models.StudentDto;
/*
 * Dao (Dao Sccess Object), 
 *  = Mapper(SQL 문과 DTO를 자동으로 매칭시킨다)
 * 
 * DB 와 연결하여 CRUD 를 처리하는 객체
 * 
 * MyBatis를 사용하게 되면 Dao interface를 생성하고
 * 각 method 에  Annottaion 을 부착하여 SQL 명령문을 설정한다
 * 
 * 그러면 나머지 여러가지 코드(DBMS 에서 데이터를 가져와서 DTO에 담고,다시 List add 하여
 *  		Return하는 이러한 코드를  Mybatis의 SqlSessionFactory가 대신 생성해 준다.
 * 
 * 
 */

public interface StudentDao {
	
	@Select("SELECT *FROM tbl_student")
	public List<StudentDto> selectAll();
	
	@Select(" SELECT * FROM tbl_student WHERE st_num = #{id}")
	public StudentDto findById(String id);
	// 이름으로 조회하는 법 
	@Select(" SELECT * FROM tbl_student WHERE st_name = #{name}")
	public List<StudentDto> findByName(String name);
	
	@Delete(" DELETE FROM tbl_student WHERE st_num =#{id}")
	public int delete(String id);
	
	@Insert(StudentSQL.SUTDENT_INSERT)
	public int insert(StudentDto dto);
	
	@Update(StudentSQL.SUTDENT_UPDATE)
	public int update(StudentDto dto);
	
	
}
