package ex04;

import java.util.Objects;

import lombok.extern.log4j.Log4j;

@Log4j
public class ToStringExample {

	
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		log.info(Objects.toString(str1));
		log.info(Objects.toString(str2));
		log.info(Objects.toString(str2, "이름이 없습니다."));
	} // main
	
} // end class