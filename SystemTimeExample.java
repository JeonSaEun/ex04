package ex04;

import lombok.extern.log4j.Log4j;


@Log4j
public class SystemTimeExample {

	
	public static void main(String[] args) {
//		long start = System.nanoTime();	// 시작시간 측정
		long start = System.currentTimeMillis();
		
			//------------------------------------//
			int sum = 0;
			for(int i=1; i<=100; i++) {
				sum += i;
			} // for
			//------------------------------------//
		
//		long end = System.nanoTime();		// 종료시간 측정
		long end = System.currentTimeMillis();
				
		log.info("1~1000000까지의 합: " + sum);
		log.info("계산에 " + (end-start)/Math.pow(10, 3) + " 밀리초가 소요되었습니다.");
	} // main
	
} // end class