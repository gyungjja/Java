package week14;

import java.io.*;

public class exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			int c;
			in = new FileInputStream("C:\\Users\\Administrator\\Desktop\\한림대\\4-1학기\\자바2\\week14/out_a.txt");
			out = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\한림대\\4-1학기\\자바2\\week14/ out_b.txt", false);

			while ((c = in.read()) != -1) {
				System.out.println((char) c + "를 읽어서");
				out.write(c);
				System.out.println("out_b.txt에 썼습니다.");

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null)
					in.close();
				if (out != null)
					out.close();
				System.out.println("작업이 끝났으니 파일을 열어 확인해 보세요.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

