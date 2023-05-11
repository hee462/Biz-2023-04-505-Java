package com.hee462.books.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class BookExecB {
	// ISBN,도서명,출판사,저자,발행일,페이지,가격
	//  0   , 1    ,  2  , 3 ,   4  ,   5   , 6 
	/*
	 * 도서정보.txt 파일을 열어서 각 line 을 읽어 들인 후 index 0부터 index 8 번까지 데이터를 console 에 출력하기
	 */
	public static void main(String[] args) {

		String bookFile= "src/com/hee462/books/data/도서정보(2023-05-11).txt";
		Scanner fileScan = null;
		InputStream is = null;

		try {
			is = new FileInputStream(bookFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//	e.printStackTrace();
			System.out.println(bookFile + "파일이 없습니다.");
			return;
		}
		/*
		 * InputStream(FileInputStream)를 사용하여 직접 파일을 읽을 수 있다.
		 * 하지만 그 절차가 상당히 많은 코딩을 해야 한다.
		 * 좀더 쉽게 "text" 파일을 읽어서 메모리로 가져오기 위해 Scanner 도구를 연결하여 사용한다.
		 */
		fileScan = new Scanner(is);
		System.out.println("=".repeat(100));
		System.out.println("ISBN\t도서명\t출판사\t저자\t발행일\t페이지\t가격");
		System.out.println("-".repeat(100));
		
		// 위치 확인을 위한 변수 선언
		int rows = 0;
		while (fileScan.hasNext()) {

			String list = fileScan.nextLine();

			String[] bkList = list.split(",");
			// 데이터 검증하는 코드
			// rows 증가 횟수
			rows++;
			//bkList의 길이가 7보다 작으면
			if(bkList.length <7) {
				System.out.printf("%d 번째 데이터 문제\n" , rows);
				System.out.println(list);
				break;
			}else {
				
				System.out.printf("%s\t" , bkList[0]);
				System.out.printf("%s\t" , bkList[1]);
				System.out.printf("%s\n" , bkList[2]);
			}
			
			}
		fileScan.close();
		}

	}


