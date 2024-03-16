package practice;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Dtaess {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		Date d=new Date();
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String format = sdf.format(d);
		System.out.println(format);
		
		
	}

}
