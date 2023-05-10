package com.hee462.classes.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class StudentExecB {
	public static void main(String[] args) {

		String studentFile = "src/com/hee462/classes/datas/Student.csv ";
		String saveFile = "src/com/hee462/classes/datas/Student-save.csv ";
		// 객체를 선언만 할때 , null 값을 저장하여 초기화를 하면,
		// 객체때문에 발생하는 메모리 관련 문제를 조금 줄일 수 있다
		Scanner fileScan = null;
		
// is 변수를 사용하기 위해서는 아래 코드를 사용하지 않는다. 파일을 관리하는 코드는 대부분 이렇게 사용한다
//		try {
//			InputStream is  =  new FileInputStream(studentFile);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		/*
		 *  InputStream 도구
		 *  컴퓨터의 외부 (네트워크, 파일 등) 로 부터 데이터를 메모리로 load 하는데
		 *  사용하는 도구들의 부모
		 */
		InputStream is = null;
		try {
			is = new FileInputStream(studentFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		fileScan = new Scanner(is); // System.in (키보드 입력) 
		String line = fileScan.nextLine();
		System.out.println(line);
		System.out.println(fileScan.nextLine());
		System.out.println(fileScan.nextLine());
		System.out.println(fileScan.nextLine());
		for(int i =0; i <100 -4 ;i++) {
			System.out.println(fileScan.nextLine());
		}
		
		
	}
}
