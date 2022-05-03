import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n4948 {

	public static boolean isPrime(int n) {
		for (int i = 2; i * i <= n; ++i) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		while (n != 0) {
			int cnt = 0;
			for (int i = n + 1; i <= (2 * n); ++i) {
				if (isPrime(i)) {
					cnt++;
				}
			}

			System.out.println(cnt);
			n = Integer.parseInt(br.readLine());
		}

	}

}
