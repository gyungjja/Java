package week10;

import java.util.Calendar;

public class smd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(cal.YEAR);
		int month = cal.get(cal.MONTH) + 1;
		int date = cal.get(cal.DATE);
		
		System.out.println("��="+year+"��="+month+"��="+date);
	}

}
