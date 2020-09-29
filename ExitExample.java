package ex04;

import lombok.extern.log4j.Log4j;

@Log4j
public class ExitExample {

	
	public static void main(String[] args) {
		
		// 1. JVM 강제 종료
		// if 0: normal exit, not 0: abnormal exit
//		System.exit(7);
//		
//		log.info("Done.");
		
		// 보안 관리자 설정
//		System.setSecurityManager(new SecurityManager() {
//		
//			@Override
//			public void checkExit(int status) {
//				if(status != 5) {
//					throw new SecurityException();
//				} // if
//			} // checkExit
//			
//		});		// 익명 자식 객체 코딩기법
		
		System.setSecurityManager(new SecurityManager() {

			@Override
			public void checkExit(int status) {
				log.info("checkExit() invoked.");
				
				log.info("status: " + status);
				
				// 네트워크로, 관제시스템에 "이 프로그램이 비정상종료된다" 알려주는 로직
			} // checkExit
			
		});		// 익명 자식 객체 구현 코딩기법
		
		System.exit(7);
		
		
		//----------------------//
		
//		for(int i=0; i<10; i++) {
//			// i값 출력
//			log.info(i);
//			
//			try {
//				// JVM 종료 요청
//				System.exit(i);
//			} catch(SecurityException e) {
//				;;
//			} // try-catch
//		} // for
		
	} //end main
	
} // end class