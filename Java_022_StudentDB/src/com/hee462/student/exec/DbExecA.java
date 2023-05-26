package com.hee462.student.exec;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.hee462.student.config.DBConnection;
import com.hee462.student.mapper.StudentDao;
import com.hee462.student.models.StudentDto;

public class DbExecA {
	
	public static void main(String[] args) {
		// SqlSessionFactory에게 DB와 연결할 Session 요청하기
		// openSession()의 true: INSERT, UPDATE , DELETE 를 수행할때 자동으로 COMMIT 명령 실행
		// 이 옵션을 사용하지 않으면 Java에서 추가,수정,삭제한 데이터가 
		// SQl Developer등에서 확인이 안될수 있다.
		SqlSession sqlSession 
			= DBConnection.getFactory().openSession(true);
		// StudentDao interface 를 구현하 DaoImplV1과 같은 코드를 생성하여 stDao에 담아줌
		StudentDao stDao = sqlSession.getMapper(StudentDao.class);
		
		List<StudentDto> stdList = stDao.selectAll();
		System.out.println(stdList.toString());
	}
}
