import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1929 {
	public static boolean isPrime(int p) {
		for (int i = 2; i * i <= p; ++i) {
			if (p % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		int list[] = new int[N + 1];

		for (int i = 2; i <= N; ++i) {
			list[i] = i;
		}

		for (int i = 2; i <= N; ++i) {
			if (isPrime(list[i])) {
				for (int j = i + i; j <= N; j += i) {
					list[j] = 0;
				}
			}
		}

		for (int i = M; i <= N; ++i) {
			if (list[i] != 0)
				System.out.println(list[i]);
		}
	}

}
