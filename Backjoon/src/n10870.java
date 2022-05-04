import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n10870 {

	public static int fibo(int n) {
		if (n == 0)
			return 0;
		else if (n <= 2)
			return 1;
		return fibo(n - 1) + fibo(n - 2);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		System.out.println(fibo(n));
	}

}
