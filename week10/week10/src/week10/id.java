package week10;

import java.util.Scanner;

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
