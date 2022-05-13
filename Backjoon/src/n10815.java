import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n10815 {

	public static int num(int[] A, int B) {

		for (int left = 0, right = A.length - 1; left <= right;) {
			int mid = (left + right) / 2;
			if (A[mid] > B)
				right = mid - 1;
			else if (A[mid] < B)
				left = mid + 1;
			else if (A[mid] == B)
				return 1;
		}
		return 0;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int A[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; ++i) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);

		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < m; ++i) {
			bw.write(num(A, Integer.parseInt(st.nextToken())) + " ");
		}

		bw.flush();
		bw.close();
	}

}
