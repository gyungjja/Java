package week4;

public abstract class Animal {	//AnimalŬ������ ��ü ������ ���� �ʰڴ�.
	String reaction(Animal ani) {
		//instanceof ���
		if(ani instanceof Cat) {
			return "_����������";
		}
		else {
			return "_�����ø���";
		}
	}
	
	public abstract void sound();

}
