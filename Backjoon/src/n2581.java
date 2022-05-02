import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2581 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int min = Integer.parseInt(br.readLine());
		int max = Integer.parseInt(br.readLine());

		int list[] = new int[max - min + 1];
		int cnt = 0;
		int sum = 0;

		for (int i = min; i <= max; ++i) {
			int n = 0;
			for (int j = 1; j <= i; ++j) {
				if (i % j == 0)
					n++;
			}
			if (n == 2) {
				list[cnt] = i;
				cnt++;
				sum += i;
			}
		}

		if (list[0] != 0) {
			System.out.println(sum);
			System.out.println(list[0]);
		} else
			System.out.println(-1);
	}

}
