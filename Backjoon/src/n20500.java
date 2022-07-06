import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n20500 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		long dp[][] = new long[3][N + 1];
		long mod = 1000000007L;

		if (N == 1) {
			System.out.println(0);
			return;
		}

		// 2자리 수 중 나머지가 0이되는 수는 15 하나 뿐이다.
		dp[0][2] = 1;
		// 2자리 수 중 나머지가 1이 되는 수는 55 하나 뿐이다.
		dp[1][2] = 1;
		// 2자리 수 중 나머지가 2가 되는 수는 없다.
		dp[2][2] = 0;

		for (int i = 3; i <= N; ++i) {

			// i 자리 수의 수 중 나머지가 0인것은, i-1 자리 수의 수 중 나머지가 1, 2를 더한 값이 3으로 나누어 떨어진다.
			dp[0][i] = (dp[1][i - 1] + dp[2][i - 1]) % mod;
			dp[1][i] = (dp[0][i - 1] + dp[2][i - 1]) % mod;
			dp[2][i] = (dp[0][i - 1] + dp[1][i - 1]) % mod;

		}

		System.out.println(dp[0][N]);

	}

}
