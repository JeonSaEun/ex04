package ex04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import lombok.extern.log4j.Log4j;

@Log4j
public class ExecuteVsSubmitExample {

	
	public static void main(String[] args) throws Exception {
		
		//------------------------------//
		ExecutorService executorService =
				Executors.newFixedThreadPool(2);	// 스레드풀 생성
		
		log.info("- executorService: " + executorService);
		
		//------------------------------//
		
		// 스레드풀을 이용하여, 10개의 Task를 생성하고
		// 이를 스레드풀의 JobQ에 넣어서, 수행시킴(위임)
		for(int i=0; i<10; i++) {
			
			Runnable task = new Runnable() {
				
				@Override
				public void run() {
					// 스레드 총 개수 및 작업 스레드 이름 출력
					// 실제 스레드 풀의 구현 클래스: ThreadPoolExecutor (**)
					ThreadPoolExecutor threadPoolExecutor =
							(ThreadPoolExecutor) executorService;
					
					// 현재 스레드 풀의 사이즈(크기)
					int poolSize = threadPoolExecutor.getPoolSize();
					
					// 현재의 코드를 수행시키는 Worker Thread의 이름 획득
					String threadName = Thread.currentThread().getName();
					
					log.info("[총 스레드 개수: " + poolSize +
							"] 작업 스레드 이름: " + threadName);
					
					// 의도적으로 예외 발생 시킴
					// NumberFormatException(실행예외)
					int value = Integer.parseInt("삼");
				} // run
				
			}; // 익명구현객체 코딩기법으로 Task 생성
			
			//------------------------------------//
//			executorService.execute(task);		// 스레드풀의 JobQ에 Task 제출
			executorService.submit(task);		// 스레드풀의 JobQ에 Task 제출
			
			Thread.sleep(10);					// TIMED_WAITING
		} // for
		
			//------------------------------------//
			executorService.shutdown();			// 스레드풀 종료(자원해제)
	} // main
	
} // end class