package ex04;

import lombok.extern.log4j.Log4j;


@Log4j
public class StringBuilderExample {

	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Program Study");
		log.info(sb.toString());
		
		//---------------------//
		
		sb.insert(4, "2");
		log.info(sb.toString());
		
		//---------------------//
		
		sb.setCharAt(4, '6');
		log.info(sb.toString());
		
		//---------------------//
		
		sb.replace(6, 13, "Book");		// (6, 13] half-open: 6은 포함, 13은 미포함
		log.info(sb.toString());
		
		//---------------------//
		
		sb.delete(4, 5);
		log.info(sb.toString());
		
		//---------------------//
		
		int length = sb.length();
		log.info("문자열 길이 " + length);
		
		//---------------------//
		
		String result = sb.toString();
		
		log.info(result);
	} // main
	
} // end class