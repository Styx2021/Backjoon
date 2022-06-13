import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n9461 {

	public static long padovan(int N) {
		long P[] = new long[N + 1];

		if (N < 6) {
			if (N <= 3)
				return 1;
			else
				return 2;
		} else {
			P[1] = 1;
			P[2] = 1;
			P[3] = 1;
			P[4] = 2;
			P[5] = 2;
			for (int i = 5; i++ < N;) {
				P[i] = P[i - 1] + P[i - 5];
			}
		}
		return P[N];
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i++ < T;) {
			int N = Integer.parseInt(br.readLine());
			System.out.println(padovan(N));
		}
	}

}
