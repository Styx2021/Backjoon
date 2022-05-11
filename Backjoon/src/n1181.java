import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class n1181 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String list[] = new String[n];

		for (int i = 0; i < n; ++i) {
			list[i] = br.readLine();
		}

		Arrays.sort(list, new Comparator<String>() {

			@Override
			public int compare(String e1, String e2) {
				if (e1.length() < e2.length()) {
					return -1;
				} else if (e1.length() == e2.length()) {
					return e1.compareTo(e2);
				} else
					return 1;
			}
		});

		StringBuilder sb = new StringBuilder();
		sb.append(list[0]).append("\n");

		for (int i = 1; i < n; ++i) {
			if (list[i].equals(list[i - 1]) == false) {
				sb.append(list[i]).append("\n");
			}
		}

		System.out.println(sb.toString());
	}

}
