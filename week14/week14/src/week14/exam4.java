package week14;

import java.util.Scanner;
import java.io.*;
public class exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		Scanner sc = new Scanner(System.in);
		try {
			File file = new File("C:\\Users\\Administrator\\Desktop\\�Ѹ���\\4-1�б�\\�ڹ�2\\week14/out.txt");
			FileWriter fw = new FileWriter(file, true);
			System.out.println("���ڿ� �Է�:");
			a = sc.next();
			fw.write(a);
			/*
			fw.write("FileWriter�� �ѱ۷ε� "+ "\r\n");
			fw.write("���ڿ��� �ٷ� ����Ҽ� �ִ�." + "\r\n");
			*/
			fw.flush();
			fw.close();
			System.out.println("���Ͽ� ����Ǿ����ϴ�.");
		} catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}