package ex04;

import lombok.extern.log4j.Log4j;


@Log4j
public class SystemEnvExample {

	
	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME");
		
		log.info("[ JAVA_HOME ] " + javaHome);
	} // main
	
} // end class