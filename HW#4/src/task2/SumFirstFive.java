package task2;
import java.util.Arrays;

public class SumFirstFive {

	public static void main(String[] args) {

		int[] tenNum = {-1, 222, 3, 4, 5, 1, 2, 31, 4, 5 };
		int[] newArray = Arrays.copyOfRange(tenNum, 5, tenNum.length);
		int[] newArray2 = Arrays.copyOfRange(tenNum, 0, 6);

		int summ = 0;
		int prod = 1;

		for (int i = 0; i < newArray2.length; i++) {
			if ((newArray2[i] >= 0) && (i < 5)) {
				summ = summ + newArray2[i];

			} else {
				for (int j = 0; j < newArray.length; j++) {
					prod = prod * newArray[j];
				}
				break;
			}

		}
		if (summ > 0) {
			System.out.println("Summ of first 5 int: " + summ);
		} else {
			System.out.println("Product of last 5 int: " + prod);
		}

	}

}
