package ex04;

import lombok.extern.log4j.Log4j;

@Log4j
public class DaemonExample {

	
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread(); // NEW
		
		autoSaveThread.setDaemon(true);		// 데몬 스레드로 변경
		autoSaveThread.start();				// RUNNABLE
		
		try { Thread.sleep(3000); }			// TIMED_WAITING
		catch (InterruptedException e) {;;}
		
		log.info("메인 스레드 종료");
	} // main
	
} // end class
