package thienle.ifactory;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal=Calendar.getInstance();
		
		Date date = cal.getTime();
		System.out.println(date);
		
		String FormatFullDateTime = "dd.MM.yyyy HH:mm:ss";
		String FormatDateTimeNotSS = "dd.MM.yyyy HH:mm";
		String FormatFullDateTimeAM = "dd.MM.yyyy hh:mm:ss aaa";
		
		SimpleDateFormat sdf= new
				SimpleDateFormat (FormatFullDateTimeAM);
		
		
		
		System.out.println(sdf.format(date));
	}

}
