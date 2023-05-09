package com.hee462.classes.exec;

import com.hee462.classes.models.StdData;

public class StudentB {
	public static void main(String[] args) {
		for (int i = 0; i < StdData.STUDENT.length; i++) {
			String[] student = StdData.STUDENT[i].split(",");  // 구분자로 나누고 
			System.out.println(student[StdData.ST_NUM] + " \t"); // 각 항목으로 출력
			System.out.println(student[StdData.ST_NAME] + " \t");
			System.out.println(student[StdData.ST_DEPT] + " \t");
			System.out.println(student[StdData.ST_GRADE] + " \t");
			System.out.println(student[StdData.ST_PROF] + " \t");
			System.out.println(student[StdData.ST_TEL] + " \t");
			System.out.println(student[StdData.ST_ADDRESS] + " \t");

		}

	}
}
