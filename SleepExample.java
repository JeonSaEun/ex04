package ex04;

import java.awt.Toolkit;


public class SleepExample {

	
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<10; i++) {
			toolkit.beep();
			
			try {
				// 3초간 자라 (TIMED_WAITING)
				Thread.sleep(3000);
			} catch(InterruptedException e) {;;}
		} // for
	} // main
	
} // end class