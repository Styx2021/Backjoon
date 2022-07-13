import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2631 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[] student = new int[N];
		int[] dp = new int[N];

		for (int i = 0; i < N; ++i) {

			student[i] = Integer.parseInt(br.readLine());

		}

		// LIS 알고리즘
		for (int i = 0; i < N; ++i) {

			dp[i] = 1;

			for (int j = 0; j < i; ++j) {

				if (student[j] < student[i] && dp[i] < dp[j] + 1) {

					dp[i] = dp[j] + 1;

				}

			}
		}

		int max = 0;
		for (int IS : dp)
			if (max < IS)
				max = IS;

		System.out.println(N - max);

	}

}
