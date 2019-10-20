/*
 1. 키보드로부터 문자를 입력 받아 FileOutputStream을 이용하여 
 out_a.txt에 저장하는 프로그램의 작성방법을 설명하고 소스를 완성하시오
 (문자는 반복 입력, 단 ‘q’를 입력받으면 문자입력 종료).
 */

package week14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
public class exam1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		char a;
		Scanner sc = new Scanner(System.in);
		try {
			File file = new File("C:\\Users\\Administrator\\Desktop\\한림대\\4-1학기\\자바2\\week14/out_a.txt");
			FileOutputStream fos = new FileOutputStream(file);
			while(true) {
				System.out.println("문자 입력:");
				a = sc.next().charAt(0);
				if(a == 'q') break;
				fos.write(a);
			}
			fos.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}