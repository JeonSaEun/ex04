package ex04;

import java.io.IOException;
import java.util.Arrays;
import lombok.extern.log4j.Log4j;


@Log4j
public class StringEncodingDecoding {

	
	public static void main(String[] args)
			throws IOException {
		
		//---------------------------------------------//
		// 		Encoding(String > byte[]) : "UTP-8"
		//---------------------------------------------//
		byte[] bytes = new byte[50];
		
		int nbytes = System.in.read(bytes);	// 표준입력으로 읽기
		
		log.info("nbytes: " + nbytes);		// 읽어낸 바이트 개수
		log.info(Arrays.toString(bytes));	// 바이트배열 출력
		
		//---------------------------------------------//
		//		Decoding(byte[] > String) : "MS949"
		//---------------------------------------------//
//		String name = new String(bytes);
//		String name = new String(bytes, "UTF-8"); // ok
//		String name = new String(bytes, "UTF8"); // ok
//		String name = new String(bytes, "utf-8"); // ok
		String name = new String(bytes, "utf8"); // ok
		log.info(name);
		
	} // main
	
} // end class