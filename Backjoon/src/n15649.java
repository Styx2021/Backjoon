import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n15649 {

	public static void dfs(int depth) {

		if (depth == M) {
			for (int i : list) {
				System.out.print(i + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 0; i < N; ++i) {

			if (visit[i] == false) {
				visit[i] = true;
				list[depth] = i + 1;
				dfs(depth + 1);

				visit[i] = false;
			}
		}

		return;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		visit = new boolean[N];
		list = new int[M];

		for (int i = 0; i < N; ++i) {
			visit[i] = false;
		}
		dfs(0);

	}

	public static int N;
	public static int M;
	public static boolean visit[];
	public static int list[];
}
