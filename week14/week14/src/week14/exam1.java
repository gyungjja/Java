/*
 1. Ű����κ��� ���ڸ� �Է� �޾� FileOutputStream�� �̿��Ͽ� 
 out_a.txt�� �����ϴ� ���α׷��� �ۼ������ �����ϰ� �ҽ��� �ϼ��Ͻÿ�
 (���ڴ� �ݺ� �Է�, �� ��q���� �Է¹����� �����Է� ����).
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
			File file = new File("C:\\Users\\Administrator\\Desktop\\�Ѹ���\\4-1�б�\\�ڹ�2\\week14/out_a.txt");
			FileOutputStream fos = new FileOutputStream(file);
			while(true) {
				System.out.println("���� �Է�:");
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