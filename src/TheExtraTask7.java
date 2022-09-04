import java.util.Scanner;

public class TheExtraTask7 {

	public static void main(String[] args) {
//first version		
		double n = 23.5d;
		System.out.println(n < 0 ? (int) (n - 0.5) : (int) (n + 0.5));

//second version
		System.out.println("enter a number(use a comma. not a dot): ");
		Scanner scan = new Scanner(System.in);
		if (scan.hasNextDouble()) {
			double d = scan.nextDouble();
			double s = d % (int) d;
			System.out.println(s < 0.5 ? (int) d : (int) (d + 0.5));
		} else {
			System.out.println("incorrect data");
		}
		scan.close();
	}
}
