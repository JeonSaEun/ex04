package ex04;

import lombok.extern.log4j.Log4j;


@Log4j
public class StringBufferExample {


	public static void main(String[] args) {
		
		String sql =
				new StringBuffer().
				append("SELECT ").
				append("	employee_id, ").
				append("	first_name, ").
				append("	last_name, ").
				append("	email, ").
				append("	phone_number, ").
				append("	hire_date ").
				append("FROM ").
				append("	employees ").
				append("WHERE ").
				append("	employee_id BETWEEN ? AND ? ").
				toString();
		
		log.info(sql);
		
	} // main
	
} // end class