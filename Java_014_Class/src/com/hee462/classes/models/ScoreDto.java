package com.hee462.classes.models;
/*
 * Dto(data transfer Object , 데이터를 묶음으로 관리하기 위한) 클래스
 * 
 * 1. 클래스 변수를 모두 private 으로 선언
 * 2. 변수 값을 읽고 쓰기 위한 setter, getter method를 선언
 * 3. 변수 값을 확인하기 위한 toString() method를 재 정의 ( Override)  
 * 
 */
public class ScoreDto {

	private String stNum;
	private int scKor;
	private int scMath;
	private int scMusin;
	private int scArt;
	
	// ALT+SHIFT+S 제너레이션
	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public int getScKor() {
		return scKor;
	}
	public void setScKor(int scKor) {
		this.scKor = scKor;
	}
	public int getScMath() {
		return scMath;
	}
	public void setScMath(int scMath) {
		this.scMath = scMath;
	}
	public int getScMusin() {
		return scMusin;
	}
	public void setScMusin(int scMusin) {
		this.scMusin = scMusin;
	}
	public int getScArt() {
		return scArt;
	}
	public void setScArt(int scArt) {
		this.scArt = scArt;
	}
	
	public void getTotal( ) {
		int total = this.scKor;
		total += this.scMath;
		total+= this.scMusin;
		total += this.scArt;
		
	} 
	
	
	
	
	
	/*
	 * Java 의 모든 클래스는 기본적으로 toString() method를 포함하고 있다.
	 * 
	 * 하지만 기본 toString() 은 메모리 주소를 보여주는 포함
	 * 
	 * Dto 클래스에서는 변수의 값들을 문자열로 변환하여 return 하는
	 * method 로 재정의 (다시 선언) 한다
	 * 
	 * @Override : Annotation 키워드
	 * @Override : 기본에 존재하는 method를 다시 선언하겠다 라는 지시어
	 * 
	 */
	
	@Override
	public String toString() {
		return "ScoreDto [stNum=" + stNum + ", scKor=" + scKor + ", scMath=" + scMath + ", scMusin=" + scMusin
				+ ", scArt=" + scArt + "]";
	}

}
