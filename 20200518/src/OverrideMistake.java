class ParentAdder{
	public int add(int a, int b) {
		return a+b;
	}
}
class ChildAdder extends ParentAdder{
	@Override
	/*
	//�θ�� int�ε� ��ӹ޴°Ŵ� double�̸� ���� ��µ����� �������̵� x @Override ���ָ� �������ȴ�
	
	public double add(double a, double b) {
		System.out.println("����");
		return a+b;
	}
	*/
	public int add(int a, int b) {
		System.out.println("����");
		return a+b;
	}
	
}
public class OverrideMistake {
	public static void main(String[] args) {
		ParentAdder adder = new ChildAdder();
		System.out.println(adder.add(3, 4));
	}
}
