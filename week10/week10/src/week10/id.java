package week10;

import java.util.Scanner;

public class id {
	String id = "gico";

	public void compare() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ID�� �Է��ϼ���:");
		String str = sc.next();

		if (str.equalsIgnoreCase(id)) {
			System.out.println("id�� ��ġ");
		} else {
			System.out.println("id�� ����ġ");
		}
	}
}
