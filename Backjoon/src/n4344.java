import java.util.Scanner;

public class n4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		for (int i = 0; i < size; ++i) {
			int s_count = sc.nextInt();
			int list[] = new int[s_count];
			double sum = 0;
			double count = 0;

			for (int j = 0; j < s_count; ++j) {
				list[j] = sc.nextInt();
				sum += list[j];
			}

			for (int s : list) {
				if (s > (sum / s_count)) {
					count += 1;
				}
			}
			// 출력 서식을 지정한 경우 println을 사용할 수 없음
			System.out.printf("%.3f%s\n", (count / s_count) * 100, "%");
		}
		sc.close();
	}
}
