import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n14425 {

	public static int StringConfirm(String[] S, String t) {

		for (int left = 0, right = S.length - 1; left <= right;) {
			int mid = (left + right) / 2;
			if (S[mid].equals(t))
				return 1;
			else if (S[mid].compareTo(t) > 0)
				right = mid - 1;
			else if (S[mid].compareTo(t) < 0)
				left = mid + 1;
		}
		return 0;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		String S[] = new String[n];

		for (int i = 0; i < n; ++i) {
			S[i] = br.readLine();
		}

		Arrays.sort(S);
		int cnt = 0;

		for (int i = 0; i < m; ++i) {
			cnt += StringConfirm(S, br.readLine());
		}

		System.out.println(cnt);
	}

}
