package ex04;

import lombok.extern.log4j.Log4j;


@Log4j
public class GcExample {

	
	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1);		// 첫번째 사원객체 생성
		
		emp = null;					// GC의 대상이 되도록, 가비지 객체로 만듦
		
		emp = new Employee(2);		// 두번째 사원객체 생성
		emp = new Employee(3);		// 세번째 사원객체 생성
		
		log.info("emp가 최종적으로 참조하는 사원번호: ");
		log.info(emp.eno);
		
		//--------------------------//
		
		System.gc();				// 강제성이 없음
		
	} // main
	
} // end class