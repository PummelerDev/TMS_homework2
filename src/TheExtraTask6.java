import java.util.Scanner;

public class TheExtraTask6 {

	public static void main(String[] args) {
		System.out.println("Enter a number ");
		Scanner scan = new Scanner(System.in);
		int result = 0;
		int n = 0;
		while (scan.hasNextInt()) {
			n = scan.nextInt();
			while (n != 0) {
				result += n % 10;
				n /= 10;
			}
			System.out.print("the sum of the digits of your number is  ");
			System.out.println(result);
			result = 0;
		}
		System.out.println("You entered not a number");
		scan.close();
	}
}
