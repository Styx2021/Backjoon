import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class n9375 {

	public static int[][] dp = new int[100][100];

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
		HashMap<String, Integer> map = new HashMap<>();

		int N = Integer.parseInt(br.readLine());

		StringTokenizer st;

		for (int i = 0; i < N; ++i) {
			int n = Integer.parseInt(br.readLine());
			for (int j = 0; j < n; ++j) {
				st = new StringTokenizer(br.readLine());
				// 사실 value값은 필요가 없다.
				String value = st.nextToken();
				String key = st.nextToken();
				map.put(key, map.getOrDefault(key, 0) + 1);
			}
			Iterator<String> iter = map.keySet().iterator();
			int sum = 1;
			while (iter.hasNext()) {
				// 알몸인 상태도 고려해서 계산한다. +1
				sum *= combi(map.get(iter.next()) + 1, 1);
			}
			// 모든 의상을 다 입지 않는 알몸인 상태는 단 1개만 있으므로 -1
			System.out.println(sum - 1);
			map = new HashMap<String, Integer>();
			dp = new int[100][100];
		}
	}

}
