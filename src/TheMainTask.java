import java.util.Scanner;

public class TheMainTask {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name: ");
		System.out.println("Hello " + scan.nextLine());
		scan.close();
	}
}
