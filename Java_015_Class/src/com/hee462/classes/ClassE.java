package com.hee462.classes;

import java.util.List;

public class ClassE {

	private List<String> strList;

	public ClassE() {

	}

	public ClassE(List<String> strList) {
		this.strList = strList;
		
	}
	
	public void printList() {
		System.out.println(strList.toString());
	}
}
