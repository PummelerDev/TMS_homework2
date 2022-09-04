import java.util.Scanner;

public class TheExtraTask4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.print("Sqare is  ");
		System.out.println(Math.sqrt(x * x + y * y));
		scan.close();
	}

}
