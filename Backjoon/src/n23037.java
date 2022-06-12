import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n23037 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		double sum = 0;

		for (int i = 10000; i >= 1; i /= 10) {
			sum += Math.pow(N / i, 5);
			N %= i;
		}

		System.out.printf("%.0f", sum);
	}

}
