class ParentAdder{
	public int add(int a, int b) {
		return a+b;
	}
}
class ChildAdder extends ParentAdder{
	@Override
	/*
	//부모는 int인데 상속받는거는 double이면 값은 출력되지만 오버라이드 x @Override 써주면 오류가된다
	
	public double add(double a, double b) {
		System.out.println("덧셈");
		return a+b;
	}
	*/
	public int add(int a, int b) {
		System.out.println("덧셈");
		return a+b;
	}
	
}
public class OverrideMistake {
	public static void main(String[] args) {
		ParentAdder adder = new ChildAdder();
		System.out.println(adder.add(3, 4));
	}
}
