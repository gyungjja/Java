package week14;

import java.io.*;

class exam8 {

	public static void main(String args[]) {
		System.out.print("C:\\Users\\Administrator\\Desktop\\한림대\\4-1학기\\자바2\\week14/out.data" + " 파일에서 ");
		FileInputStream fis = null;
		DataInputStream dis = null;

		try {

			fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\한림대\\4-1학기\\자바2\\week14/out.data");
			dis = new DataInputStream(fis);
			double val = dis.readDouble();
			System.out.println("읽은 값은 " + val + " 입니다.");
		} catch (IOException ioe) {
			System.out.println("C:\\Users\\Administrator\\Desktop\\한림대\\4-1학기\\자바2\\week14/out.data" + "파일을 읽을 수 없습니다.");
		} finally {
			try {
				dis.close();
				fis.close();
			} catch (Exception e) {
			}

		}

	}

}
