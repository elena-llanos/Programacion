package com.ipartek.formacion.funciones;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Fechas {

	public static void main(String[] args) {

		Date now = new Date();
		System.out.println(now);
		
		Date courseBeginning = new Date(2023 - 1900, 6 - 1, 13, 8,15);
		System.out.println(courseBeginning);
		
		int year = courseBeginning.getYear() + 1900;
		int month = courseBeginning.getMonth() + (1);
		int day = courseBeginning.getDate();
		
		System.out.println(year + "-" + month + "-" + day );
		
		//Java1
		
		GregorianCalendar gc = new GregorianCalendar(2023, 6,13);
		
		year = gc.get(Calendar.YEAR);
		month = gc.get(Calendar.MONTH);
		day = gc.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(gc);
		System.out.println(year + "-" + month + "-" + day );
		
		//Java8
		
		LocalDate ld = LocalDate.of(2023,6,13);
		System.out.println(ld);
		
		System.out.println(ld.getYear() +"-" + ld.getMonthValue() + "-"+  ld.getDayOfMonth());
		
	}

}
