import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2839 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sugar = Integer.parseInt(br.readLine());

		// 5로 나누었을 때 나머지의 모든 경우의 수를 표로 계산해서 풀어보자.

		if (sugar == 4 || sugar == 7) {
			System.out.println(-1);
		} else if (sugar % 5 == 0) {
			System.out.println(sugar / 5);
		} else if (sugar % 5 == 1 || sugar % 5 == 3) {
			System.out.println((sugar / 5) + 1);
		} else if (sugar % 5 == 2 || sugar % 5 == 4) {
			System.out.println((sugar / 5) + 2);
		}
	}

}
