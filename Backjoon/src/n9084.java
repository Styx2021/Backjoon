import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n9084 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		int N;
		int M;
		int[] dp;
		int[] coin;

		for (int i = 0; i < T; ++i) {

			N = Integer.parseInt(br.readLine());
			coin = new int[N];

			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; ++j) {
				coin[j] = Integer.parseInt(st.nextToken());
			}

			M = Integer.parseInt(br.readLine());
			dp = new int[M + 1];

			// 각 동전이 처음 자신을 만드는 경우의 수는 1이기 때문에 0을 1로 초기화
			// 이 1이 누적되기 때문에 이후
			// (이전 동전으로 만든 경우의 수) + (현재 경우의 수 - 현재 동전 금액)의 경우의 수를 해도 1이 추가되는 것이다.
			dp[0] = 1;

			for (int j = 0; j < N; ++j) {

				for (int k = coin[j]; k <= M; ++k) {

					// 현재 액수의 경우의 수는 (이전 동전으로 만든 경우의 수) + (현재 경우의 수 - 현재 동전 금액)의 경우의 수 이다.
					dp[k] += dp[k - coin[j]];
				}

			}

			System.out.println(dp[M]);
		}

	}

}
