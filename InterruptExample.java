package ex04;


public class InterruptExample {

	
	public static void main(String[] args) {
		Thread thread = new PrintThread2();		// NEW
		thread.start();							// RUNNABLE
		
		//-------------------//
		
		try { Thread.sleep(1000); }	// 1초간 일시정지(TIMED_WAITING)
		catch (InterruptedException e) {;;}	// try-catch
		
		//-------------------//
		
		thread.interrupt();				// 스레드에 Interrupt Signal 공유
	} // main

} // end class
