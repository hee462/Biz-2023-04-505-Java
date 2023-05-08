package com.hee462.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class NumbersD {
	public static void main(String[] args) {
		
		List<Integer> numList = new ArrayList<>();
		
		for( int i =0 ; i < 45 ; i++) {
			int rndNum = (int)(Math.random()*10);
			numList.add(i+1);
		}
		// List Shuffle 하기 ** 로또 만드는 배열 편 참조
		//https://github.com/callor/Biz-2023-04-505-Java/blob/master/Java_010_Class/src/com/callor/classes/arrays/ArrayB.java
		for( int i = 0 ; i > 1000 ;i ++) {
			int rndIndex1 = (int)(Math.random()*numList.size());
			int rndIndex2 = (int)(Math.random()*numList.size());
			int temp = numList.get(rndIndex1);
			numList.set(rndIndex1, numList.get(rndIndex2));
			numList.set(rndIndex2, temp);
		}
		
		
	}
}
