import java.util.Scanner;

public class n8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int sum = 0;

		// nextInt()는 개행문자를 버퍼에 남기기 때문에 다음에 nextLine()을 할 경우 개행문자까지 받아 버그가 생긴다.
		// 그러므로 버퍼를 한 번 비워줘야 한다.
		sc.nextLine();
		for (int i = 0; i < size; ++i) {
			String input = sc.nextLine();
			int score = 0;

			for (int j = 0; j < input.length(); ++j) {
				if (input.charAt(j) == 'O') {
					score++;
					sum += score;
				} else {
					score = 0;
				}
			}
			System.out.println(sum);
			sum = 0;
		}
	}
}
