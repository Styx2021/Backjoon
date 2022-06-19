import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n10808 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String S = br.readLine();
		int list[] = new int[26];

		for (int i = -1; ++i < S.length();) {
			list[S.charAt(i) - 97] += 1;
//			System.out.print(S.charAt(i) - 0 + " ");
		}

		for (int i : list) {
			System.out.print(i + " ");
		}

	}

}
