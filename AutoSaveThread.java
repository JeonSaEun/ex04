package ex04;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@NoArgsConstructor(access=lombok.AccessLevel.PUBLIC)
public class AutoSaveThread extends Thread {

	
	public void save() {
		log.info("작업 내용을 저장함");
	} // save
	
	@Override
	public void run() {
		
		while(true) {	// Infinite loop
			
			try { Thread.sleep(1000); }			// TIMED_WAITING
			catch (InterruptedException e) {
				log.info(this.getName() + " interrupted");
				
				break;		// Interrupt Signal을 받으면 예외발생 -> 빠져나감
			} // try-catch
			
			save(); // 작업내용저장
			
		} // while
		
	} // run
	
} // end class