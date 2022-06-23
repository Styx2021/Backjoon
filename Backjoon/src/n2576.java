import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2576 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int idx = 0;
		int sum = 0;

		int min = Integer.MAX_VALUE;

		for (int i = 0; i++ < 7;) {
			idx = Integer.parseInt(br.readLine());

			if (idx % 2 != 0) {
				sum += idx;
				if (idx < min)
					min = idx;
			}
		}

		if (min != Integer.MAX_VALUE) {
			System.out.println(sum);
			System.out.println(min);
		} else
			System.out.println(-1);

	}

}
