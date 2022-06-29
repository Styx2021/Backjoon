import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n11047 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] list = new int[N];
		int result = 0;

		for (int i = 0; i < N; i++) {
			list[i] = Integer.parseInt(br.readLine());
		}

		for (int i = list.length - 1; i >= 0; i--) {
			if (K / list[i] > 0) {
				result += K / list[i];
				K %= list[i];
			}
		}

		System.out.println(result);
	}

}
