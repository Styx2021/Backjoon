import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n24416 {

	public static int fib(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			cnt_re += 1;
			return (fib(n - 1) + fib(n - 2));
		}
	}

	public static int fibonacci(int n) {
		f[1] = 1;
		f[2] = 1;
		for (int i = 3; i <= n; ++i) {
			cnt_dp += 1;
			f[i] = f[i - 1] + f[i - 2];
		}
		return f[n];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		f = new int[N + 1];
		fib(N);
		fibonacci(N);
		System.out.println(cnt_re + 1 + " " + cnt_dp);

	}

	public static int cnt_re = 0;
	public static int cnt_dp = 0;
	public static int[] f;
}
