package com.hee462.classes.arrays;
/*
 * 다수의 데이터를 정보 처리할 경우
 * 데이터를 수집하고, 수집이 완료 되었을때 한꺼번에 처리한다.
 * 
 * 실시간 처리 :  데이터가 발생하는 즉시처리 -> 티켓예매
 * 배치(Batch) 처리 : 데이터를 모두 수집하고 수집이 완료 되었을때 처리 -> 급여계산, 인구통계 
 *
 * 
 * 
 * 정수형 배열 10개를 nums 이름으로 선언하고
 * 51~ 100까지의 램덤수를 생성하여 각 요소에 저장
 * 각 요소에 저장된 값중에서 소수(prime) 만 consloe 출력
 * prime()method 를 선언하여 실행
 */

public class ArrayF {
	public static void main(String[] args) {
		
		int[] nums = new int[10];
		for (int i = 0; i < 10; i++) {
			nums[i] = (int) (Math.random() * 50) + 51; // 정수형  랜덤수로 만들고 nums에 각 요소를 저장
		}
		
		for(int i = 0 ;  i <10; i++) {
			if(prime(nums[i])> 0) {
				System.out.println(nums[i] + "는 소수");
			}
		}
	}
/*
 * prime () method 에게 정수값 1개를 전달하고
 * 그 정수값이 소수인지 아닌지 알려줘 하고 하는 요청
 */
	public static int prime( int num) {
		int i ;
		for(  i = 2 ; i < num ; i++) {                 // num 보다 작은 i로  num을 나눴을때 0이 아니면 소수
			if (num % i == 0) {                       
				return 0;                                // num % i == 0 일때는 소수가 아님
			}
		} 
			return num;
	}
}
