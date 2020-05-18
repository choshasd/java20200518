interface A{
	public void doA();
}
interface B{
	public void doB();
}
// 상속 implements
public class InterfaceA implements A,B {
	@Override
	public void doA() {
		System.out.println("doA 함수입니다");
	}
	@Override
	public void doB() {
		System.out.println("doB 함수입니다");
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
