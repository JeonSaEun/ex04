package ex04;


public class TargetThread extends Thread {

	@Override
	public void run() {
		for(long i=0; i<1000000000; i++); // 10억번 loop 수행
		
		try { // **** 일시정지 상태
			// 1.5초간 일시정지
			Thread.sleep(1500);
		} catch(Exception e) {;;} // try-catch
		
		for(long i=0; i<1000000000; i++); // 10억번 loop 수행
	} // run
	
} // end class
