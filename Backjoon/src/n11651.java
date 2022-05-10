import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n11651 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int list[][] = new int[n][2];
		StringTokenizer st;

		for (int i = 0; i < n; ++i) {
			st = new StringTokenizer(br.readLine());
			list[i][0] = Integer.parseInt(st.nextToken());
			list[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(list, (e1, e2) -> {
			if (e1[1] == e2[1]) {
				return e1[0] - e2[0];
			} else
				return e1[1] - e2[1];
		});

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; ++i) {
			sb.append(list[i][0] + " " + list[i][1] + "\n");
		}
		System.out.println(sb.toString());
	}

}
