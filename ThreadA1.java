package ex04;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ThreadA1 extends Thread {
	private WorkObject workObject;	// 공유객체의 참조주소 저장필드
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			// 공유객체에 있는, 자신의 메소드 호출
			workObject.methodA();
		} // for
	} // run
	
} // end class
