import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n10816 {

	public static int lowerBound(int[] A, int B) {
		int lo = 0;
		int hi = A.length;

		// lo와 hi가 같아질 때 까지 반복
		while (lo < hi) {
			int mid = (lo + hi) / 2;

			if (B <= A[mid])
				hi = mid;
			else
				lo = mid + 1;

		}
		return lo;
	}

	public static int upperBound(int[] A, int B) {
		int lo = 0;
		int hi = A.length;

		// lo와 hi가 같아질 때 까지 반복
		while (lo < hi) {
			int mid = (lo + hi) / 2;

			if (B < A[mid])
				hi = mid;
			else
				lo = mid + 1;
		}
		return lo;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		int A[] = new int[n];
		for (int i = 0; i < n; ++i) {
			A[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(A);
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; ++i) {
			int key = Integer.parseInt(st.nextToken());
			sb.append(upperBound(A, key) - lowerBound(A, key) + " ");
		}

		System.out.println(sb.toString());
	}

}
