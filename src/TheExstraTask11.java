import java.util.Scanner;

public class TheExstraTask11 {

	public static void main(String[] args) {
		// погуглил и узнал, что уже есть встроенные методы конвертации.
		// не уверен, что цель задания была найти их.
		// если цель, все таки придумать свое решение, то вот оно:

		System.out.println("enter a nuber you need to convert from decimal to binary ");
		Scanner scan = new Scanner(System.in);
		if (scan.hasNextInt()) {
			convertToBinary(scan.nextInt());
		} else {
			System.out.println("incorrect data");
		}
		scan.close();

// а тут то, что нашел:
		int i = 1243678;
		System.out.println(Integer.toBinaryString(i)); // двоичная
		System.out.println(Integer.toOctalString(i)); // восьмиричная
		System.out.println(Integer.toHexString(i)); // шестнадцатиричная
		System.out.println(Integer.parseInt("1010101110100", 2)); // из двоичной в десятичную

	}

	public static void convertToBinary(int d) {
		String result = "";
		while (d > 0) {
			result += d % 2;
			d /= 2;
		}
		StringBuffer resultFinal = new StringBuffer(result);
		resultFinal.reverse();
		System.out.println("Result is " + resultFinal);
	}

}

// как из двоичной в десятичную пока не придумал.
//
//
//

