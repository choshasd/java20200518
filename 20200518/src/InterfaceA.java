interface A{
	public void doA();
}
interface B{
	public void doB();
}
// ��� implements
public class InterfaceA implements A,B {
	@Override
	public void doA() {
		System.out.println("doA �Լ��Դϴ�");
	}
	@Override
	public void doB() {
		System.out.println("doB �Լ��Դϴ�");
	}
	InterfaceA(){
		doA();
	}
	public static void main(String[] args) {
		new InterfaceA();
		System.out.println();
		InterfaceA ia = new InterfaceA();
		
		ia.doA();
		ia.doB();
	}
}
