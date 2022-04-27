import java.util.Scanner;

public class n3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int list[] = new int[10];
		int result[] = new int[10];

		for (int i = 0; i < 10; ++i) {
			list[i] = sc.nextInt();
			result[i] = list[i] % 42;
		}

		int count = 0;

		int i, j = 0;

		for (i = 0; i < 10; ++i) {
			for (j = i + 1; j < 10; ++j) {
				if (result[i] == result[j])
					break;
			}
			if (j == 10)
				count++;
		}

		System.out.println(count);

	}

}
