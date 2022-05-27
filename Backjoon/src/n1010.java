import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1010 {

	public static int[][] dp = new int[30][30];

	public static int combi(int n, int r) {

		if (dp[n][r] > 0) {
			return dp[n][r];
		}

		if (n == r || r == 0) {
			return dp[n][r] = 1;
		}

		return dp[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt = Integer.parseInt(br.readLine());

		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < cnt; ++i) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			sb.append(combi(n, r) + "\n");
		}

		System.out.println(sb.toString());
	}

}
