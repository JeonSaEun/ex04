package ex04;


public class StopFlagExample {

	
	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1();	// NEW
		printThread.start();							// RUNNABLE
		
		//--------------------//
		
		try { Thread.sleep(1000); } // 1초간 일시정지(TIMED_WAITING)
		catch (InterruptedException e) {;;}	// try-catch
		
		//--------------------//
		
		// 스레드의 stop flag 변경
		printThread.setStop(true);
	} // run
	
} // end class
