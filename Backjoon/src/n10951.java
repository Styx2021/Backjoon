import java.util.Scanner;

public class n10951 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// int형 숫자 하나를 공백, 탭, 줄바꿈 기준으로 입력 받음

		int size = sc.nextInt();
		int[] list = new int[size];

		int max = -1000000;
		int min = 1000000;

		for (int i = 0; i < size; ++i) {
			list[i] = sc.nextInt();
			if (list[i] > max)
				max = list[i];
			if (list[i] < min)
				min = list[i];
		}
		System.out.println(min + " " + max);
		sc.close();
	}
}