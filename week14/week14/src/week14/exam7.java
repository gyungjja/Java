package week14;

import java.util.Scanner;
import java.io.*;
public class exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a;
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		/*
		FileOutputStream fos = new FileOutputStream("C:/Users/hallym/Desktop/20185264/week14/out.data");
		DataOutputStream dos = new DataOutputStream(fos);
		*/
		try {
			fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\한림대\\4-1학기\\자바2\\week14/out.data");
			dos = new DataOutputStream(fos);
			
			System.out.println("실수 입력:");
			a = sc.nextDouble();
			dos.writeDouble(a);
			dos.writeInt(1);
			
			dos.flush();
			dos.close();
			fos.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}