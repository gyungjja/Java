package weeek2;

public class kumhoTire extends Tire {
	// �ʵ�
	// ������
	public kumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// �޼ҵ�
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire ����: " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire ��ũ ***");
			return false;
		}
	}
}
