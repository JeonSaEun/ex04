package ex04;

import java.util.Objects;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;


@Log4j
public class SumThread extends Thread {
	@Getter @Setter private long sum;
	private Thread mainThread;
	
	
	public SumThread(Thread mainThread) {
		this.mainThread = mainThread;
	}
//	public long getSum() {
//		return sum;
//	} // getSum

//	public void setSum(long sum) {
//		this.sum = sum;
//	} // setSum
	
	@Override
	public void run() {
		Objects.requireNonNull(mainThread);
		
		log.info("- mainThread: " + mainThread.getState());
		
		for(int i=1; i<=100; i++) {
			sum+=i;
		} // for
	} // run
	
} // end class