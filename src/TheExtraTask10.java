
public class TheExtraTask10 {
	public static void main(String[] args) {
		int[] arrayInt = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int sumInt = 0;
		for (int i = 0; i < arrayInt.length; i++)
			sumInt += arrayInt[i];
		System.out.println(sumInt / 10);

		double[] arrayDouble = new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		double sumDouble = 0;
		for (int i = 0; i < arrayDouble.length; i++)
			sumDouble += arrayDouble[i];
		System.out.println(sumDouble / 10);

	}
}

/*
 * тип данных integer всегда округляется в меньшую сторону. смысл задания в
 * этом?
 */