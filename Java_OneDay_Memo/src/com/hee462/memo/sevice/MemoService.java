package com.hee462.memo.sevice;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.hee462.memo.config.DBConnection;
import com.hee462.memo.mappers.MemoDao;
import com.hee462.memo.models.MemoDto;

public class MemoService {

	SqlSession sqlSession = DBConnection.getFactory().openSession(true);
	MemoDto mDto = new MemoDto();
	MemoDao mDao = sqlSession.getMapper(MemoDao.class);
	protected final Scanner scan;
	protected List<MemoDto> mList;

	public MemoService() {
		scan = new Scanner(System.in);

	}

	public void printMemo() {
		System.out.println("=".repeat(100));
		System.out.println("메모장 리스트");
		System.out.println("=".repeat(100));
		List<MemoDto> mList = mDao.selectAll();
		
		for (MemoDto mdto : mList) {
			System.out.println(mdto.m_seq);
			System.out.println(mdto.m_writer);
			System.out.println(mdto.m_date);
			System.out.println(mdto.m_subject);
			System.out.println(mdto.m_content);
			}

		//System.out.println(mList.toString());
	}

	// 작성자로 메모 찾기
	public void findByWriter() {
		System.out.println("=".repeat(100));
		System.out.println(" 조회하고자 하는 일련번호를 입력하세요");
		System.out.println(" 일련번호  >> ");
		String strseq = scan.nextLine();
		MemoDto dto = mDao.findByseq(strseq);
		if (dto == null) {
			System.out.println("일치하는 일련번호 없습니다");
			return;
		} else {
			System.out.println("=".repeat(100));
			System.out.printf("작성자 : %s\n", dto.m_writer);
			System.out.printf(" 제목 : %s\n", dto.m_subject);
			System.out.printf("내용 : %s\n", dto.m_content);
		}
	}
	// 메모 수정
	public void updateMemo() {
		while (true) {
			System.out.println(" 수정할 메모장 일련번호를 입력하세요");
			System.out.println(" 일련 번호  >>");
			String strseq = scan.nextLine();
			MemoDto dto = mDao.findByseq(strseq);

			if (dto == null) {
				System.out.println("일치하는 일련번호가 없습니다");
				continue;
			}
			System.out.printf("작성자 : %s\n", dto.m_writer);
			String strWriter = scan.nextLine();
			if (!strWriter.equals(""))
				dto.m_writer = strWriter;

			System.out.printf("제목 : %s\n", dto.m_subject);
			String strsub = scan.nextLine();
			if (!strsub.equals(""))
				dto.m_subject = strsub;

			System.out.printf("내용 : %s\n", dto.m_content);
			String strcontent = scan.nextLine();
			if (!strcontent.equals(""))
				dto.m_content = strcontent;

			int result = mDao.update(dto);
			if (result > 0)
				System.out.println("변경 성공");
			else
				System.out.println("변경 실패");
		}
	}

	// 새로운 매모 생성 
	public void newMemo() {
		System.out.println("=".repeat(100));
		System.out.println("새로운 메모장 등록 ");
		System.out.println("=".repeat(100));

		System.out.println("작성자  >>");
		String strWriter = scan.nextLine();
		System.out.printf("작성일자 :%s\n" ,mDto.m_date);
		System.out.println(" 제목  >>");
		String strsubject = scan.nextLine();

		System.out.println(" 내용  >>");
		String strtext = scan.nextLine();
		
		mDto.m_writer = strWriter;
		mDto.m_subject = strsubject;
		mDto.m_content = strtext;
		
		int result = mDao.insert(mDto);
		if (result > 0)
			System.out.println("메모 등록 성공");
		else
			System.out.println("메모 등록 실패");
		
		
	}

	// 메모 삭제
	public void deleteMemo() {
		System.out.println("=".repeat(100));
		System.out.println("삭제할 메모장 일련번호를 입력하세요");
		System.out.println("일련번호 >> ");
		String strseq = scan.nextLine();
		MemoDto dto = mDao.findByseq(strseq);
		if (dto == null) {
			System.out.println("일치하는 일련번호가 없습니다");
			return;
		}
		int result = mDao.delete(strseq);
		if (result > 0)
			System.out.println("메모 삭제 성공");
		else
			System.out.println("메모 삭제 실패");
		
	}
	
	protected String getTodayDate() {
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat todayFormat = new SimpleDateFormat("YYYY-MM-dd");
		String todayString = todayFormat.format(date);
		return todayString;
	}
	protected String getTodayTime() {
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat timeFormat  = new SimpleDateFormat("HH:mm:ss");
		String timeString  = timeFormat.format(date);
		return timeString;
	}
	
}
