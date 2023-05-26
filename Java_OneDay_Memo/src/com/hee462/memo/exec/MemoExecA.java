package com.hee462.memo.exec;

import com.hee462.memo.sevice.MemoService;


public class MemoExecA {
	public static void main(String[] args) {
		
//		SqlSession sqlSession = DBConnection.getFactory().openSession(true);
//		MemoDao mDao  = sqlSession.getMapper(MemoDao.class);
//		MemoDto mDto = new MemoDto();
//		mDto.m_seq = 2;
//		mDto.m_writer = "성춘향";
//		mDto.m_date = "2023-05-23";
//		mDto.m_subject = "춘향가";
//		mDto.m_content = "사랑가";
//		int result = mDao.insert(mDto);
//		if(result >0) {
//			System.out.println(" 데이터 추가 성공");
//		}else {
//			System.out.println("데이터 추가 실패");
//		}
		
		MemoService mService = new MemoService();
	//	mService.printMemo();
	//	mService.findByWriter();
	//	mService.updateMemo();
	//	mService.newMemo();
	//	mService.deleteMemo();
	}
	 
}

