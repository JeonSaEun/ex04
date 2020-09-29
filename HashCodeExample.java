package ex04;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
public class HashCodeExample {

	
	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		
		log.info(s1.hashCode());
		log.info(Objects.hashCode(s2)); // s2.hashCode()와 같음
	} // main
	
	//--------------------------//
	
	@AllArgsConstructor
	static class Student {
		int sno;
		String name;
	
		@Override
		public int hashCode() {
			// Object가 물려주는 hashCode() 메소드를 재정의하여,
			// 비즈니스 로직에 맞는 객체의 식별자를 반환하도록 함
			return Objects.hash(sno, name);
		} // hashCode
	
	} // end inner class
	
} // end outer class