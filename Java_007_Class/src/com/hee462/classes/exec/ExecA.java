/*
 * java의 package
 * java는 소스코드를 package 단위로 관린한다.
 * package = folder 와 같은 개념으로 보면 된다.
 * 
 * base-package : com.hee462.classes
 * 3단위, 3단계 package 단위를 base-package라고 한다.
 * base-package 는 일부 Application ID (식별자) 역할을 한다.
 * 
 */

package com.hee462.classes.exec;

public class ExecA {
	/*
	 *  정수 1개를 전달 받아서, 매개변수에 num1에 받고
	 *  num1 변수에 전달받은 값이 소수인지 판별하여
	 *  소수이면 num1을 return 하고, 아니면 1을 return하는 method 
	 *  
	 *  가장 기본적인 형태만 갖춘 method 정의
	 *  method 원형, method prototype 이라고 한다.
	 */
	public static int prime(int num1) {
		for(int i =2 ; i < num1 ; i++) {
			if(num1 % i == 0) {
				return 0;
			}
		}
		return num1;
	}
	public static void main(String[] args) {
		/*
		 * prime() method 에게 정수 11을 전달하여
		 * 소수인가를 판별하고 그결과를 console에 출력
		 */
		int result = prime(11);
		if(result > 0) {
			System.out.println(result + " 는 소수");
		}
	}

}
