package ex04;

import java.util.Arrays;
import java.util.Objects;

import lombok.extern.log4j.Log4j;

@Log4j
public class EqualsAndDeepEqualsExample {

	
	public static void main(String[] args) {
		Integer o1 = 1000;
		Integer o2 = 1000;
		
//		log.info(Objects.equals(o1, o2));			// a.equals(b)
//		log.info(Objects.equals(o1, null));
//		log.info(Objects.equals(null, o2));
//		log.info(Objects.equals(null, null));
//		log.info(Objects.deepEquals(o1, o2)+"\n");
		
		//--------------------------//
		Integer[] arr1 = {1, 2};
		Integer[] arr2 = {1, 2};
		
		log.info(Objects.equals(arr1, arr2));	// a.equlas(b) 배열의 주소가 달라서 false!
		
		// 두 객체가 널이 아니고, 배열객체인 경우는, 배열의 원소를 비교한다
		log.info(Objects.deepEquals(arr1, arr2));
		log.info(Arrays.deepEquals(arr1, arr2));
		
		log.info(Objects.deepEquals(null, arr2)); // false
		log.info(Objects.equals(arr1, null));		// false
		log.info(Objects.equals(null, null));		// true
	} // main
	
} // end class