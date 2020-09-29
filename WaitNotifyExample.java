package ex04;


public class WaitNotifyExample {

	
	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * 쓰레드간 협업을 위해서는, 조건을 지켜야 함
		 * (1) Object class의 wait(), notify(), notifyAll()은 반드시
		 * 객체락을 얻은 상태에서만 호출 가능하다 -->
		 * 반드시 동기화 메소드 또는 동기화 블록 내부에서만 호출 가능
		 * 
		 * (2) 각 스레드가 수행할 메소드(로직)를 반드시, 공유객체의 메소드를 집어넣고
		 * 동기화 처리해야 한다
		 * 
		 * (3) 공유객체의 각 스레드가 호출할 동기화 메소드 내에, 실제 각 스레드의
		 * 핵심 로직을 구현한다
		 */
		
		// 1. 스레드 간 공유되는 공유객체 생성
		WorkObject sharedObject = new WorkObject();
		
		// 2. 각 스레드 객체 생성 공유객체의 참조주소 전달
		ThreadA1 threadA = new ThreadA1(sharedObject);
		ThreadB1 threadB = new ThreadB1(sharedObject);
		
		// 3. 두 스레드 구동
		threadA.start();
		threadB.start();
	} // main
	
} // end class