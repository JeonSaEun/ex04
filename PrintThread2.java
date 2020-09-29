package ex04;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@NoArgsConstructor(access=lombok.AccessLevel.PUBLIC)
public class PrintThread2 extends Thread {

	@Override
	public void run() {
		//-------1st. method -------//
		
		try {
			
			while(true) {	// Infinite loop
				log.info("실행 중");
				
				Thread.sleep(1);
			} // while
		
		} catch(InterruptedException e) {;;}
			
			
		//-------2nd. method--------//
//		while(true) {	// Infinite loop
//			log.info("실행 중");
//			
//			// 이전에 이미 Interrupt Signal이 수신되었는지 확인
//			// if true, Interrupt Signal이 수신된 적이 있음을 의미
//			if(Thread.interrupted()) {
//				break;
//			} // if
//		} // while
//		
//		log.info("자원 정리");
//		log.info("실행 종료");
	} // run
	
} // end class