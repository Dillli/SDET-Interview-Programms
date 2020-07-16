package javaProgram;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarClass {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.AM_PM));//0-AM 1-PM
		System.out.println(cal.get(Calendar.MINUTE));
	}

}
