import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n11051 {

	public static int[][] dp = new int[1001][1001];

	public static int combi(int n, int r) {

		if (dp[n][r] > 0) {
			return dp[n][r];
		}

		if (n == r || r == 0) {
			return dp[n][r] = 1;
		}

		// 모듈러 증명 이용 (a+b)%m = ((a%m)+(b%m))%m
		return dp[n][r] = (combi(n - 1, r - 1) + combi(n - 1, r)) % 10007;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());

		System.out.println(combi(n, r));

	}

}
