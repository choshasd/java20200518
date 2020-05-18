class Cake {
	public String toString() {
		System.out.println(super.toString()); // ÁÖ¼Ò°ª? Cake@15db9742
		return "My Birthday Cake";
	}
}
class CheeseCake extends Cake{
	public String toString() {
		return "My Birthday CheeseCake";
	}
}
public class OverridingToString {
	public static void main(String[] args) {
		Cake c1 = new Cake();
		Cake c2 = new CheeseCake();
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
