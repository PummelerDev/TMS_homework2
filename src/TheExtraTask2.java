
public class TheExtraTask2 {

	public static void main(String[] args) {
		double priceProduct1 = 14;
		double priceProduct2 = 19;
		double priceSum = (priceProduct1 + priceProduct2) * 0.9;
		double finalSum = priceSum * 0.9;
		double Discount = (priceProduct1 + priceProduct2) - priceSum;
		System.out.println("prise "+ priceSum);
		System.out.println("final prise is " + finalSum);
		System.out.println("your discount is " + Discount);
	}

}
