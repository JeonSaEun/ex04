package ex04;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@NoArgsConstructor(access=lombok.AccessLevel.PUBLIC)
@Log4j
// 멀티스레드 하에서, 스레드가 공유하는 공유객체를 만드는 클래스
public class WorkObject {
	

	// 동기화 메소드: 임계영역을 보장해주는 메소드
	public synchronized void methodA() {
		log.info("ThreadA1의 methodA() 작업 실행");

		// WAITING(일시정지 상태) 스레드를 1개만 깨우자!
		notify();
		
		try {
			wait(); 	// 누가 깨울때까지는, 스스로 잠자러 감!
		} catch(InterruptedException e) {;;}
	} // methodA

	// 동기화 메소드: 임계영역을 보장해주는 메소드
	public synchronized void methodB() {
		log.info("ThreadB1의 methodB() 작업 실행");
		
		// WAITING(일시정지 상태) 스레드를 1개만 깨우자!
		notify();
		
		try {
			wait();		// 누가 깨울때까지는, 스스로 잠자러 감!
		} catch(InterruptedException e) {;;}
	} // methodB
} // END Class