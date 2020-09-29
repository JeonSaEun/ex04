package ex04;

import java.util.Comparator;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
public class CompareExample {

	
	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		
		int result = Objects.compare(s1, s2, new StudentComparator());
		log.info(result);
		
		result = Objects.compare(s1, s3, new StudentComparator());
		log.info(result);
	} // main
	
	//----------------------------//
	
	// Nested class --> 중첩클래스
	@AllArgsConstructor
	static class Student {
		int sno;
		
//		Student(int sno) {
//			this.sno = sno;
//		} // Constructor
		
	} // end class
	
	//---------------------------//
	
	static class StudentComparator
		implements Comparator {
		
		@Override
		public int compare(Object a,Object b) {
//			if(a.sno<b.sno) return -1;
//			else if(a.sno == b.sno) return 0;
//			else return 1;
			
			Student s1 = (Student) a;
			Student s2 = (Student) b;
			
			
			// 비교자(Comparator)의 반환값:
			// (1) 기준객체가 비교객체와 같으면 --> return 0;
			// (2) 기준객체가 비교객체보다 크면 --> return 1;
			// (3) 기준객체가 비교객체보다 작으면 --> return -1;
			return Integer.compare(s1.sno, s2.sno); // compare문 활용
			
//			if(s1.sno == s2.sno) {
//				return 0;
//			} else if(s1.sno < s2.sno) {
//				return -1;	
//			} else {
//				return +1;
//			} // 다중 if문으로 대체
			
//			return
//					(s1.sno < s2.sno) ?
//							-1 : ((s1.sno == s2.sno) ? 0 : 1);
			// 삼항연산자로 대체
		} // compare
		
	} // end class
	
} // end class