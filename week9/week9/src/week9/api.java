package week9;
import java.util.Scanner;
public class api {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String verb = "현실이 된다";
		System.out.println("2 + 3 = " + (2+3));
		System.out.println("2 + 3 = " + 2 + 3);
		String s = "ABCDEFG";
		//System.out.println(s.length());
		System.out.println(s.toLowerCase());
		
		String a = "javaprogramming";

		String b = a.substring(5);
		String c = a.substring(5,7);
			
		System.out.println(b);	
		System.out.println(c);

		char d = a.charAt(1);
		String e = a + d;
		System.out.println(e);
		
		String x = "abc";
		String y = x.replace('a', 'd');
			
		y = y + "xyz"; 
		System.out.println(y);

		x=y.toUpperCase(); 
		System.out.println(x);
		*/
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

}
