package week14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class exam11 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Student std = new Student("giko","010-4489-6931");
		FileOutputStream in = new FileOutputStream("Student.obj");
		ObjectOutputStream dos = new ObjectOutputStream(in);
		dos.writeObject(std);
		
	}

}
