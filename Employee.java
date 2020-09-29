package ex04;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;


@AllArgsConstructor
@Log4j
// POJO : Plain Old Java Object (아주 평범한 자바 객체)
public class Employee {
	public int eno;
	
	
	@Override
	public void finalize() {
		log.info("Employee(" + eno + ") 이 메모리에서 제거됨");
	} // finalize (소멸자)
	
} // end class
