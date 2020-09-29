package ex04;

import lombok.extern.log4j.Log4j;


@Log4j
public class ThreadA extends Thread {

	// 쓰레드를 종료할까요? 말까요?를 지정
	public boolean stop = false;	// stop flag
	public boolean work = true;		// work flag
	
	
	@Override
	public void run() {
		while(!stop) { // 스레드를 종료하라!라고 하기 전까지는 무한반복
			// 작업을 수행하라! 라고 하기 전까지는 작업 수행
			if(work) {
				log.info("ThreadA 작업 내용");
				
				try { Thread.sleep(500); 
				} catch (InterruptedException e) {;;}
				
			} else { // 작업을 수행하지 말라! 라고 할때, 실행을 양보
				Thread.yield(); 	// <------ 실행을 양보
			} // if-else
		} // while
		
		log.info("ThreadA 종료");
	} // run
	
} // end class