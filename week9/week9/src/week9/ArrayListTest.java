package week9;
import java.util.*;
public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		String name, phone;
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		
		/*
		//�л����� ������ ����.
		Student student;
		student = new Student("ȫ�浿1","010-7789-4567");
		list.add(student);
		*/
		//����Ʈ ����
		for(int i = 0; i < 10; i++) {
			
			/*
			Student student;
			student = new Student("ȫ�浿","010-7789-4567");
			list.add(student);
			*/
			System.out.println("�̸� �Է� : ");
			name = sc.next();
			System.out.println("��ȣ �Է� : ");
			phone = sc.next();
			
			list.add(new Student("�̸�:"+name, "��ȭ��ȣ:"+phone));
		}
		
		for(Student s : list)
			System.out.println(s);
		
		
		while(true) {
			System.out.println("1.�˻� 2.���� =");
			num = sc.nextInt();
			switch(num) {
			//����ڿ��� �̸��� �Է� �޾Ƽ� ��ȭ��ȣ �˻�
			case 1:
				System.out.print("�˻��̸�:");
				name = sc.next();
				for(Student s : list) {
					if(name.equals(name)) {
						System.out.println("�̸� :" + s.getName());
						System.out.println("��ȭ��ȣ: " + s.getPnumber());
					}
				}
				break;
			//����ڿ��� �̸��� �Է� �޾Ƽ� ���� remove	
			case 2:
				System.out.print("������ �̸�: ");
				name = sc.next();
				for(Student s : list) {
					if(name.equals(name)) {
						list.remove(s);
						break;
					}
				}
				
			}
		}
		
		
		
		
		
	}

}
