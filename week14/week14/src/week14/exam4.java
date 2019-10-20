package week14;

import java.util.Scanner;
import java.io.*;
public class exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		Scanner sc = new Scanner(System.in);
		try {
			File file = new File("C:\\Users\\Administrator\\Desktop\\한림대\\4-1학기\\자바2\\week14/out.txt");
			FileWriter fw = new FileWriter(file, true);
			System.out.println("문자열 입력:");
			a = sc.next();
			fw.write(a);
			/*
			fw.write("FileWriter는 한글로된 "+ "\r\n");
			fw.write("문자열을 바로 출력할수 있다." + "\r\n");
			*/
			fw.flush();
			fw.close();
			System.out.println("파일에 저장되었습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}