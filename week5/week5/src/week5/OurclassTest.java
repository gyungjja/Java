package week5;

public class OurclassTest {
	public static Person getMaximum(Person[] arr)
	{
		Person p = arr[0];//1번 객체 저장
		//큰키 비교 반복
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i].compareTo(p) == 1)
				p = arr[i];
		}
		return p;


	}
	public static void main(String arg[]) {
		Person[] arr = new Person[3];
		
		arr[0] = new Person("홍길동1",180.0);
		arr[1] = new Person("홍길동2",190.0);
		arr[2] = new Person("홍길동3",185.0);
		
		for(Person obj : arr)
			System.out.println(obj);
		
		//메서드 호출
		getMaximum(arr);
		System.out.println("가장 키 큰 :" + getMaximum(arr));


	}
}

