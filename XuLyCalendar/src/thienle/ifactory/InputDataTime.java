package thienle.ifactory;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class InputDataTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println
		("Mày nhập ngày tháng đi. Định dạng là 'yyyy - MM - dd'");
		Scanner sc = new Scanner(System.in);
		String date = sc.next();
		LocalDate dateInput = LocalDate.parse(date);
		Calendar cal = Calendar.getInstance();
		int CurrentYear = cal.get(Calendar.YEAR);
		int Tuoi = CurrentYear - dateInput.getYear();
		
		
		System.out.println("Tuổi của mày là " + Tuoi);
	}

}
