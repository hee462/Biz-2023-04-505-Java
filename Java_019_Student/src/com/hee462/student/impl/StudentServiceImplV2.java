package com.hee462.student.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import com.hee462.student.models.StudentDto;
import com.hee462.student.utils.Index;
import com.hee462.student.utils.Line;
import com.hee462.student.utils.config;

/*
 * insertStudent,printStudent,loadStudent 모두 상속 받는다.
 */
public class StudentServiceImplV2 extends StudentServiceImplV1 {

	protected StudentDto inputStudent() {
		System.out.println(Line.dLine(60));
		System.out.println("학생정보 입력 종료하려면 QUIT 입력");
		System.out.println(Line.sLine(60));
		
		String stNum  = "";
		StudentDto stDto = new StudentDto();
		
		while(true) {
			
			System.out.print("학번(정수) >> ");
			stNum = scan.nextLine();
			if (stNum.equals("QUIT")) break;
			try {
				int intNum = Integer.valueOf(stNum);
				stNum = String.format("%04d", intNum);
			} catch (Exception e) {
				System.out.println("학번은 정수로 입력하세요");
				continue;
			}
			break;
		}
		if(stNum.equals("QUIT")) return null;
		
		for(StudentDto dto : stdList) {
			if(dto.stNum.equals(stNum)) {
				System.out.println(Line.sLine(100));
				System.out.println("동일학번 학생 데이터 있음, 데이터 수정!!");
				System.out.println(dto.toString());
				System.out.println(Line.sLine(100));
				
				// dto 의 어떤 데이터가 stDto 에 저장될까??
				// dto의 원본 데이터 주소가 stDto에 저장이 된다.
				stDto = dto;
			}
		}
        // stDto.stNum에 null 값이면 새로운 stDto.stName을 넣는다
		// 입력된 속성을 확인하는 코드
		System.out.printf("이름(%s) >> ",stDto.stName == null ? "신규" : stDto.stName);
		// stName.equals("") ==> 엔터값을 입력하면 기존값 그대로 유지한다
		String stName = scan.nextLine();
		if(stName.equals("")) {
			stName =stDto.stName;
		}
		if (stName.equals("QUIT")) return null;

		System.out.printf("학과(%s) >> ",stDto.stDept == null ? "신규" : stDto.stDept);
		String stDept = scan.nextLine();
		if(stDept.equals("")) {
			stDept =stDto.stDept;
		}
		if (stDept.equals("QUIT")) return null;

		int intGrade = 0;
		while (true) {
			
			System.out.printf("학년(%d) >> " , stDto.stGrade);
			String strGrade = scan.nextLine();
			
			if (strGrade.equals("QUIT")) break;
			try {
				//stGrade 가 0이 아닌경우는 데이터가 없는 경우
				//0이 아니거나 엔터일 경우는  그대로 유지하고 아니면 형변환진행
				if(stDto.stGrade !=0 && strGrade.equals("")) {
					intGrade =stDto.stGrade;
				} else {
					
					intGrade = Integer.valueOf(strGrade);
				}
			} catch (Exception e) {
				System.out.println("학년은 정수로 입력하세요");
				continue;
			}
			if (intGrade < 1 || intGrade > 4) {
				System.out.println("학년은 정수 1 ~ 4까지만 입력하세요");
				continue;
			}
			break;
		}
		if(intGrade == 0)  return null;

		System.out.printf("전화번호(%s) >> " ,stDto.stTel);
		String stTel = scan.nextLine();
		if (stTel.equals("QUIT"))  return null;
		if(stTel.equals("")) {
			stTel =stDto.stTel;
		}
		
		stDto.stNum = stNum;
		stDto.stName = stName;
		stDto.stDept = stDept;
		stDto.stGrade = intGrade;
		stDto.stTel = stTel;
		// stdList.add(stDto);
		return stDto;

	}
	public void insertStudent() {
		// v1 보다 먼저 처리해
		// super.insertStudent();
		// 그리고 나머지는 내가 처리할께
		while (true) {
			// 왜 this???????
			// 그냥 써도 되지만 확실하게 하기 위해서
			StudentDto stDto = this.inputStudent();
			//stDto에 받은 값이 없으면 멈춤
			if (stDto == null)
				break;
			// 주소 위치값
			int index = 0;
			for (index = 0; index < stdList.size(); index++) {
	/*
	 * inputStudent() 가 return 한 dto 하고 stdList의 요소중에서 참조한 dto 하고 주소가 일치하냐?
	 *  주소가 일치하다 ==> stdList에 있는 요소이다
	 */
				if (stdList.get(index) == stDto) {
					break;
				}
			}
			if (index >= stdList.size()) {
				stdList.add(stDto);
			}
		}
		System.out.println("여기는 v2");

		OutputStream os = null;
		PrintWriter out = null;

		try {
			// 입력값을 저장할 파일을 불러오기
			os = new FileOutputStream(config.STUDENT_FILE);
			out = new PrintWriter(os);
			// 각 요소에 입력받은 값 저장하기
			for (StudentDto dto : stdList) {

				out.printf("%s", dto.stNum);
				out.printf("%s", dto.stName);
				out.printf("%s", dto.stDept);
				out.printf("%s", dto.stGrade);
				out.printf("%s\n", dto.stTel);

			}
			//  파일 닫기
			out.close();
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void loadStudent() {
		
		InputStream is = null;
		Scanner scan = null;
		
		try {
			is = new FileInputStream(config.STUDENT_FILE);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scan = new Scanner(is);
		// 위치 확인용 변수
		int rows = 0;
		while(scan.hasNext()) {
			String line = scan.nextLine();
			String[] student = line.split(",");
			
			rows ++;
			try {
				StudentDto stDto = new StudentDto();
				stDto.stNum = student[Index.STUDENT.ST_NUM];
				stDto.stName = student[Index.STUDENT.ST_NAME];
				stDto.stDept = student[Index.STUDENT.ST_DEPT];
				stDto.stGrade = Integer.valueOf(student[Index.STUDENT.ST_GRADE]);
				stDto.stTel = student[Index.STUDENT.ST_TEL];
				stdList.add(stDto);
			} catch (Exception e) {
				System.out.println(rows + " 라인에서 Exception 발생");
			}
		}
		
		System.out.println("Load 한 데이터 개수 : " + stdList.size());
	}
	
	public void deleteStudent() {
		Scanner scan =new Scanner(System.in);
		System.out.println(Line.dLine(100));
		System.out.println("학생정보 삭제,삭제할 학번 입력");
		System.out.println("학번 >>");
		String stNum = scan.nextLine();
		if(stNum.equals("")) {
			return;
		}
		StudentDto stDto = null;
//		for(StudentDto dto : stdList) {
//			if(dto.stNum.equals(stNum)) {
//				stDto = dto;
//				break;
//			}
//		}
		int index =0;
		for(index =0; index <stdList.size();index++) {
			if(stdList.get(index).stNum.equals(stNum)) {
				System.out.println(Line.sLine(100));
				System.out.println(stdList.get(index));
				System.out.println(Line.sLine(100));
				break;
				
			}
		}
		if(index < stdList.size()) {
			System.out.println("학생정보를 삭제할까요? (Y/N)");
			String yesNo = scan.nextLine();
			if(yesNo.equals("Y")) {
				stdList.remove(index);
			}
		}
		return;
	}
	
}
