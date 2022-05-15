import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n1269 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int A[] = new int[n];
		int B[] = new int[m];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; ++i) {
			A[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < m; ++i) {
			B[i] = Integer.parseInt(st.nextToken());
		}

		int cnt = 0;

		for (int j = 0; j < m; ++j) {
			if (Arrays.toString(A).contains(Integer.toString(B[j]))) {
				cnt++;
			}
		}

		for (int j = 0; j < n; ++j) {
			if (Arrays.toString(B).contains(Integer.toString(A[j]))) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}

}
