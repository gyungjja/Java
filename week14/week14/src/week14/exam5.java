package week14;

import java.io.*;
public class exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("C:\\Users\\Administrator\\Desktop\\한림대\\4-1학기\\자바2\\week14/out.txt");
			
			int readCharNo;
			char[] cbuf = new char[100];
			while((readCharNo = fr.read(cbuf)) != -1) {
				String data = new String(cbuf, 0 , readCharNo);
				System.out.println(data);
			}
			fr.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
	}

}

