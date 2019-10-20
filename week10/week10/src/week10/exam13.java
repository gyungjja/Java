package week10;
import java.util.Arrays;
//import java.util.StringTokenizer;
public class exam13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] tmp = new String[args.length];
		System.arraycopy(args, 0, tmp, 0, args.length);
		for(int i = 0; i < tmp.length; i++) {
			System.out.print(tmp[i]);
		}
		System.out.println("tmp 배열에 저장된 내용은"+Arrays.toString(tmp)+"입니다.");
	}
	
	

}

public class id {
	 String id = "gico";

	 public void compare() {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("ID를 입력하세요:");
	  String str = sc.next();

	  if (str.equalsIgnoreCase(id)) {
	   System.out.println("id와 일치");
	  } else {
	   System.out.println("id와 불일치");
	  }
	 }
	}

	 

	public class idtest {

	 public static void main(String[] args) {
	  // TODO Auto-generated method stub
	  id id = new id();
	  id.compare();
	 }

	}

	 

	import java.util.Calendar;

	public class smd {

	 public static void main(String[] args) {
	  // TODO Auto-generated method stub
	  Calendar cal = Calendar.getInstance();
	  
	  int year = cal.get(cal.YEAR);
	  int month = cal.get(cal.MONTH) + 1;
	  int date = cal.get(cal.DATE);
	  
	  System.out.println("년="+year+"월="+month+"일="+date);
	 }

	}


	public class time {

	 public static void main(String[] args) {
	  // TODO Auto-generated method stub
	  for(int i=0; i<=10000; i++) {
	   System.out.println(".");
	  }
	 }

	}


	package week10;
	import java.util.Scanner;
	public class exam10 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub		Scanner args = new Scanner(System.in);
			for(int i = 0; i < args.length; i++)
				System.out.println("args["+ i + "]=" + args[i]);
			
			for(String val: args) {
				System.out.println("val=" + val);
			}
			
		}

	}

	package week10;

	public class exam11 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int sum = 0;
			/*
			for(int i =0; i < args.length; i++) {
				sum = args[i] + args[i+1];
				i++;
				
			}
			System.out.println(sum);
			*/
			for(String val : args) {
				System.out.println(val);
				sum = sum + Integer.parseInt(val);
			}
			System.out.println("sum=" + sum);

		}

	}


	package week10;

	public class exam12 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int count = 0;
			for(int i = 0; i < args[0].length(); i++) {
				if(args[0].charAt(i) >='0' && args[0].charAt(i) <= '9') {
					count++;
				}
			}
			System.out.println("숫자 ="+ count);
				
				

		}

	}


	package week10;
	import java.util.*;
	public class exam13 {
		public static void main(String args[]) {
			
			String[] tmp = Arrays.copyOf(args,);
			System.out.println("복사된 배열은 ="+tmp);
		}

	}
