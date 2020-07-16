package javaProgram;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy G");
		System.out.println(sdf.format(d));
		SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss");
		System.out.println(sdf2.format(d));
		//formats https://www.tutorialspoint.com/java_i18n/java_i18n_dateformat_patterns.htm
	}

}
