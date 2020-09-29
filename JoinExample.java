package ex04;

import lombok.extern.log4j.Log4j;


@Log4j
public class JoinExample {

	
	public static void main(String[] args) 
		throws InterruptedException {
		
		Thread mainThread = Thread.currentThread();
		SumThread sumThread = new SumThread(mainThread);
		
		sumThread.start();
		
		// 지정된 스레드가 종료될때까지는 기다려라 (일시정지상태)
		sumThread.join(); // <----- ****
		
		
		log.info("1~100 합: " + sumThread.getSum());
		} // main
	
	} // end class
