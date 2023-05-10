package com.hee462.classes.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class StudentExecC {
	public static void main(String[] args) {

		String studentFile = "src/com/hee462/classes/datas/Student.csv ";
		String saveFile = "src/com/hee462/classes/datas/Student-save.csv ";

		Scanner fileScan = null;
		InputStream is = null;
		try {
			is = new FileInputStream(studentFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		fileScan = new Scanner(is); // System.in (키보드 입력)
		// hsaNext : 다음 줄이 없으면 실행 종료
		while (fileScan.hasNext()) {
			System.out.println(fileScan.nextLine());
		}
		fileScan.close();

	}
}
