package ex04;

import java.util.Scanner;

import lombok.extern.log4j.Log4j;

@Log4j
public class Solution {

	static int B = 0;
	static int H = 0;
	static boolean result;
	
	static {
		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
		sc.close();
		
		if((B>=-100) && (B<=100) && (H>=-100) && (H<=100)) {
			if((B>0) && (H>0)) {
				result = true;
			} else {
				log.info("java.lang.Exception: Breadth and height must be positive");
			} // if-else
		} else {
			log.info("java.lang.Exception: Breadth and height must be positive");
		} // outer if
		
	} // static initializer 
	
	
	public static void main(String[] args) {
		if(result) {
			log.info(B * H);
		} // if
	} // main
	
} // end class