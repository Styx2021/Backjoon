import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1309 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int MOD = 9901;

		// dp[i][j] : i번째 줄에 j번째 칸에 동물을 놓을 수 있는 경우의 수
		// j = 0 : 아무 동물도 놓지 않는다.
		// j = 1 : 첫 번째 칸에 동물을 놓는다.
		// J = 2 : 두 번째 칸에 동물을 놓는다.

		long[][] dp = new long[N + 1][3];
		dp[1][0] = 1;
		dp[1][1] = 1;
		dp[1][2] = 1;

		for (int i = 2; i <= N; ++i) {

			// i번째의 아무 동물도 놓지 않는 것은 i-1번째의 모든 경우의 수가 해당된다. 다 가능하기 때문
			dp[i][0] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % MOD;
			// i번째의 첫 번째 칸에 동물을 놓는 것은 i-1번째의 아무것도 놓지 않는 것과 2번째에 놓는 것만 허용된다.
			dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % MOD;
			// i번째의 두 번째 칸에 동물을 놓는 것은 i-1번째의 아무것도 놓지 않는 것과 1번째에 놓는 것만 허용된다.
			dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % MOD;

		}

		System.out.println((dp[N][0] + dp[N][1] + dp[N][2]) % MOD);

	}

}
