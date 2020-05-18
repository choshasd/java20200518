interface Phone{
	public void call();
	
}
class SamsungPhone implements Phone{
	@Override
	public void call() {
		System.out.println("Galaxy S");
	}
}
class ApplePhone implements Phone{
	@Override
	public void call() {
		System.out.println("IPhone");
	}
}
public class PhoneMain {
	public static void main(String[] args) {
		Phone p1 = new SamsungPhone();
		p1.call();
		
		Phone p2 = new ApplePhone();
		p2.call();
	}
}
