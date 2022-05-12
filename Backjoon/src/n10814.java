import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class n10814 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String list[][] = new String[n][2];
		StringTokenizer st;

		for (int i = 0; i < n; ++i) {
			st = new StringTokenizer(br.readLine());
			list[i][0] = st.nextToken();
			list[i][1] = st.nextToken();
		}

		Arrays.sort(list, new Comparator<String[]>() {
			public int compare(String e1[], String e2[]) {
				if (Integer.parseInt(e1[0]) == Integer.parseInt(e2[0]))
					return 0;
				else
					return Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]);
			}
		});

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; ++i) {
			sb.append(list[i][0] + " " + list[i][1] + "\n");
		}
		System.out.println(sb.toString());
	}

}
