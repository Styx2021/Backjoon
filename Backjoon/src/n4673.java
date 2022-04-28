
public class n4673 {

	public static int d(int n) {
		int index = 0;
		index += n;

		for (int i = 10000; i >= 1; i = i / 10) {
			index += n / i;
			n %= i;
		}
		return index;
	}

	public static void main(String[] args) {

		int result[] = new int[1000000];

		for (int i = 0; i < 10000; ++i) {
			result[d(i + 1)]++;
		}

		for (int i = 0; i < 10000; ++i) {
			if (result[i + 1] == 0)
				System.out.println(i + 1);
		}
	}
}
