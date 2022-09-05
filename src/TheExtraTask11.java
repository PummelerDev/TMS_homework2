
import java.util.Scanner;

	public class TheExtraTask11 {

		public static void main(String[] args) {
			//погуглил и узнал, что уже есть встроенные методы конвертации.
			//неуверен, что цель задания была найти именно их.
			//если цель все-таки придумать свое решение, то вот оно:

			System.out.println("enter a nuber you need to convert from decimal to binary ");
			Scanner scan = new Scanner(System.in);
			if (scan.hasNextInt()) {
				convertToBinary(scan.nextInt());
			} else {
				System.out.println("incorrect data");
			}
			scan.close();

			//а тут то, что нашел:
			int i = -1243678;
			//двоичная
			System.out.println(Integer.toBinaryString(i));
			
			//восьмиричная
			System.out.println(Integer.toOctalString(i));
			
			//шестнадцатиричная
			System.out.println(Integer.toHexString(i));
			
			//из двоичной в десятичную
			System.out.println(Integer.parseInt("1010101110100", 2));

		}

		public static void convertToBinary(int d) {
			String result = "";
			do {
				result += d % 2;
				d /= 2;
			} while (d > 0);
			StringBuffer resultFinal = new StringBuffer(result);
			resultFinal.reverse();
			System.out.println("Result is " + resultFinal);
		}

	}

	//как и из двоичной в десятичную пока не придумал.
	//
	//


