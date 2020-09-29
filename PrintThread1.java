package ex04;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.extern.log4j.Log4j;

@Log4j
@NoArgsConstructor(access=lombok.AccessLevel.PUBLIC)
@Accessors(fluent=false, chain=false)
public class PrintThread1 extends Thread {

	@Setter(lombok.AccessLevel.PUBLIC)
	private boolean stop;				// stop(종료) flag
	
	@Override
	public void run() {
		// stop(종료) flag가 true가 될 때 까지는 계속 looping
		while(!stop) {
			log.info("실행 중");
		} // while
		
		log.info("자원 정리");
		log.info("실행 종료");
	} // run
	
} // end class