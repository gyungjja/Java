package week5;

public class OurclassTest {
	public static Person getMaximum(Person[] arr)
	{
		Person p = arr[0];//1�� ��ü ����
		//ūŰ �� �ݺ�
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i].compareTo(p) == 1)
				p = arr[i];
		}
		return p;


	}
	public static void main(String arg[]) {
		Person[] arr = new Person[3];
		
		arr[0] = new Person("ȫ�浿1",180.0);
		arr[1] = new Person("ȫ�浿2",190.0);
		arr[2] = new Person("ȫ�浿3",185.0);
		
		for(Person obj : arr)
			System.out.println(obj);
		
		//�޼��� ȣ��
		getMaximum(arr);
		System.out.println("���� Ű ū :" + getMaximum(arr));


	}
}

