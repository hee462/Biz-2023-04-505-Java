package com.hee462.books.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class BookExecA {
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

		while (fileScan.hasNext()) {

			String list = fileScan.nextLine();

			String[] bkList = list.split(",");

//			for (int i = 0; i < 8; i++) {
//
//				System.out.println(bkList[i]);
//			}
			
			for( String str : bkList) {
				System.out.print(str);
			}
			System.out.println();
		}

	}

}
