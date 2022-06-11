import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2738 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int list[][] = new int[N][M];

		for (int i = 0; i < N * 2; ++i) {
			st = new StringTokenizer(br.readLine());
			if (i >= N) {
				for (int j = 0; j < M; ++j) {
					list[i % N][j] += Integer.parseInt(st.nextToken());
				}
			} else {
				for (int j = 0; j < M; ++j) {
					list[i][j] = Integer.parseInt(st.nextToken());
				}
			}
		}

		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < M; ++j) {
				System.out.print(list[i][j] + " ");
			}
			System.out.println();
		}
	}

}
