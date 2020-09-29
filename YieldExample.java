package ex04;


public class YieldExample {

	
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA(); // 스레드A 생성 (NEW)
		ThreadB threadB = new ThreadB(); // 스레드B 생성 (NEW)
		
		threadA.start(); // 스레드 A 구동 (NEW -> RUNNABLE)
		threadB.start(); // 스레드 B 구동 (NEW -> RUNNABLE)
		
		// main 스레드 상태제어: RUNNING -> TIMED_WAITING
		try { 
			Thread.sleep(3000); 
		} catch (InterruptedException e) {;;}
		// 다시 깨어나는 순간, main 스레드 상태변경: TIMED_WAITING -> RUNNABLE
		
		threadA.work = false; 	// 스레드A work flag 변경
		
		// main 스레드 상태제어: RUNNING -> TIMED_WAITING
		try { 
			Thread.sleep(3000); 
		} catch (InterruptedException e) {;;}
		// 다시 깨어나는 순간, main 스레드 상태변경: TIMED_WAITING -> RUNNABLE
		
		threadA.work = true; 	// 스레드A work flag 변경
		
		//------------------------------
		// main 스레드 상태제어: RUNNING -> TIMED_WAITING
		try { 
			Thread.sleep(3000); 
		} catch (InterruptedException e) {;;}
		// 다시 깨어나는 순간, main 스레드 상태변경: TIMED_WAITING -> RUNNABLE
		
		threadA.stop = true;	// 스레드A work flag 변경
		threadB.stop = true;	// 스레드B work flag 변경
	} // main
	
} // end class