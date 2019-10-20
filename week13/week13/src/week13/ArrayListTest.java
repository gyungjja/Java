package week13;

import java.util.*;
public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		String name, phone;
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		
		/*
		//학생들의 정보를 기입.
		Student student;
		student = new Student("홍길동1","010-7789-4567");
		list.add(student);
		*/
		//리스트 저장
		for(int i = 0; i < 10; i++) {
			
			/*
			Student student;
			student = new Student("홍길동","010-7789-4567");
			list.add(student);
			*/
			System.out.println("이름 입력 : ");
			name = sc.next();
			System.out.println("번호 입력 : ");
			phone = sc.next();
			
			list.add(new Student("이름:"+name, "전화번호:"+phone));
		}
		
		for(Student s : list)
			System.out.println(s);
		
		
		while(true) {
			System.out.println("1.검색 2.삭제 =");
			num = sc.nextInt();
			switch(num) {
			//사용자에게 이름을 입력 받아서 전화번호 검색
			case 1:
				System.out.print("검색이름:");
				name = sc.next();
				for(Student s : list) {
					if(s.name.equals(name)) {
						System.out.println("이름 :" + s.getName());
						System.out.println("전화번호: " + s.getPnumber());
					}
				}
				break;
			//사용자에게 이름을 입력 받아서 삭제 remove	
			case 2:
				System.out.print("삭제할 이름: ");
				name = sc.next();
				for(Student s : list) {
					if(s.name.equals(name)) {
						list.remove(s);
						break;
					}
				}
				
			}
		}
		
		
		
		
		
	}

}
