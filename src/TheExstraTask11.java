import java.util.Scanner;

public class TheExstraTask11 {

	public static void main(String[] args) {
		// некоторые файлы(не все) неверно отображают русский язык в комментариях
		// ïîãóãëèë è óçíàë, ÷òî óæå åñòü âñòðîåííûå ìåòîäû êîíâåðòàöèè.
		// íå óâåðåí, ÷òî öåëü çàäàíèÿ áûëà íàéòè èõ.
		// åñëè öåëü, âñå òàêè ïðèäóìàòü ñâîå ðåøåíèå, òî âîò îíî:
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

		// à òóò òî, ÷òî íàøåë:
		// а тут то, что нашел:
		int i = 1243678;
		System.out.println(Integer.toBinaryString(i)); // äâîè÷íàÿ //двоичная
		System.out.println(Integer.toOctalString(i)); // âîñüìèðè÷íàÿ //восьмеричная
		System.out.println(Integer.toHexString(i)); // øåñòíàäöàòèðè÷íàÿ //шестнадцатиричная
		System.out.println(Integer.parseInt("1010101110100", 2)); // èç äâîè÷íîé â äåñÿòè÷íóþ //иэ двоичной в дестятичную

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

//êàê èç äâîè÷íîé â äåñÿòè÷íóþ ïîêà íå ïðèäóìàë.
//как из двоичной в десятичную пока не придумал.
//
// некоторые файлы(не все) неверно отображают русский язык в комментариях
//
