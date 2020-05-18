interface Printable{
	void doPrint(String doc);
}
class Printer implements Printable{
	@Override
	public void doPrint(String doc) {
		System.out.println(doc);
	}
}
public class PrintableInterface {
	public PrintableInterface() {
		Printer print = new Printer();
		print.doPrint("Hello Interface");
		Printable pt = new Printer();
//		Printable pt2 = (String doc)->{};
		pt.doPrint("Bye Interface");

	}
	public static void main(String[] args) {
		new PrintableInterface();
	}
}
