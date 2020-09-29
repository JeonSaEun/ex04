package ex04;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
public class StatePrintThread extends Thread {

	private Thread targetThread;
	
	@Override
	public void run() {
		
		while(true) { // 무한루프
			Thread.State state = targetThread.getState();
			log.info("타겟 스레드 상태: " + state);
			
			if(state == Thread.State.NEW) {		// NEW 상태라면
				targetThread.start();
			} // if
			
			// 무한루프의 탈출조건
			if(state == Thread.State.TERMINATED) {	// 종료 상태라면
				break;
			} // if
			
			try {	// 0.5초간 일시 정지
				Thread.sleep(100);
			} catch(Exception e) {;;}
		} // while
		
	} // run
	
} // end class