import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int list[] = new int[n];

		for (int i = 0; i < n; ++i) {
			list[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(list);
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; ++i) {
			sb.append(list[i] + "\n");
		}

		System.out.println(sb.toString());

	}
}
