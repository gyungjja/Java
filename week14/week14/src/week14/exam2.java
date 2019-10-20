package week14;

import java.io.*;

public class exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\한림대\\4-1학기\\자바2\\week14/out_a.txt");
			int data;
			while((data = fis.read()) != -1) {
				System.out.print((char)data + " ");
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) {
					fis.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("파일의 모든 내용을 읽었습니다.");
		}
		
		/*catch(FileNotFoundException e) {
		e.printStackTrace();
		} */
		
		/*
		try {
			FileInputStream fis = new FileInputStream("C:/Users/hallym/Desktop/20185264/week14/out_a.txt");
			int data;
			while((data = fis.read())!=-1) {
				System.out.println(data);
			}fis.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		*/

	}

}