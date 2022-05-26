import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n3036 {

	public static int GCD(int A, int B) {

		while (B != 0) {
			int r = A % B;
			A = B;
			B = r;
		}
		return A;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < n; ++i) {
			int B = Integer.parseInt(st.nextToken());
			sb.append(A / GCD(A, B) + "/" + B / GCD(A, B) + "\n");
		}

		System.out.println(sb.toString());
	}

}
