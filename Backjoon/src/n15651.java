import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n15651 {

	public static void dfs(int depth) {

		if (depth == M) {
			for (int i : list) {
				sb.append(i + " ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 0; i < N; ++i) {
			list[depth] = i + 1;
			dfs(depth + 1);
		}
		return;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		list = new int[M];

		dfs(0);
		System.out.println(sb.toString());
	}

	public static int N;
	public static int M;
	public static int list[];
	public static StringBuilder sb = new StringBuilder();
}
