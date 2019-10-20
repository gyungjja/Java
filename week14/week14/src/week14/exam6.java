package week14;

import java.util.Scanner;

import java.io.*;

class Test {

	public static void main(String args[]) throws java.io.IOException {

		int inval;

		FileReader fr;

		FileWriter fw;

		try {

			fr = new FileReader("C:\\Users\\Administrator\\Desktop\\한림대\\4-1학기\\자바2\\week14/out.txt");

			fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\한림대\\4-1학기\\자바2\\week14/in.txt");

			System.out.println("out.txt 파일에 저장된 문자열을 읽습니다 ");

			while ((inval = fr.read()) != -1)

				fw.write((char) inval);

			System.out.println("in.txt 파일로 출력했습니다");

			fw.close();

			fr.close();

		}

		catch (IOException ioe) {

			System.out.println("파일을 읽을 수 없습니다.");

		}

	}

}
