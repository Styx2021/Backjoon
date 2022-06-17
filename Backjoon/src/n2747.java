import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2747 {

	public static int fib(int N) {

		int[] fibo = new int[N + 1];

		if (N == 0)
			return 0;
		else if (N < 3)
			return 1;
		else {
			fibo[1] = 1;
			fibo[2] = 1;
			for (int i = 2; i++ < N;) {
				fibo[i] = fibo[i - 1] + fibo[i - 2];
			}
		}

		return fibo[N];
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		System.out.println(fib(N));
	}

}
