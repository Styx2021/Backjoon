import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n10757 {

	// 계산을 편하게 하기 위해 입력 배열을 뒤집는 메소드
	public static String[] reverse(String[] n) {
		for (int i = 0; i < n.length / 2; ++i) {
			String temp = n[i];
			n[i] = n[n.length - i - 1];
			n[n.length - i - 1] = temp;
		}
		return n;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		String A[] = st.nextToken().split("");
		String B[] = st.nextToken().split("");

		// 계산을 편하게 하기 위해 큰 수를 A배열로 사용한다.
		if (A.length < B.length) {
			String temp[] = B;
			B = A;
			A = temp;
		}

		A = reverse(A);
		B = reverse(B);

		int result[] = new int[A.length + 1];

		for (int i = 0; i < B.length; ++i) {
			int idx = Integer.parseInt(A[i]) + Integer.parseInt(B[i]) + result[i];
			if (idx >= 10) {
				result[i] = idx % 10;
				result[i + 1]++;
			} else {
				result[i] = idx;
			}
		}

		// 계산하고 B배열보다 큰 자리수의 A배열 값은 그대로 내려온다.
		for (int i = B.length; i < A.length; ++i) {
			int idx = Integer.parseInt(A[i]) + result[i];
			if (idx >= 10) {
				result[i] = idx % 10;
				result[i + 1]++;
			} else {
				result[i] = idx;
			}
		}

		// 마지막 자리수는 오름수가 0이 아닌 경우만 출력
		if (result[result.length - 1] != 0) {
			System.out.print(result[result.length - 1]);
		}

		// 거꾸로 된 결과를 바르게 출력한다.
		for (int i = result.length - 2; i >= 0; --i) {
			System.out.print(result[i]);
		}
	}

}
