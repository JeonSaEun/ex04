package ex04;

public class ThreadStateExample {

	
	public static void main(String[] args) {
		StatePrintThread statePrintThread =
			new StatePrintThread(
				new TargetThread()); //타겟스레드 객체 생성(NEW 상태)
		
		statePrintThread.start(); 	// 스레드 구동
	} // main
	
} // end class
