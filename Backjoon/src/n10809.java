import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n10809 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String in = br.readLine();

		int list[] = new int[26];

		for (int i = 0; i < 26; ++i)
			list[i] = -1;

		for (int i = 0; i < in.length(); ++i) {
			// char형은 int형과 연산할 때 아스키코드값으로 연산됨
			if (list[in.charAt(i) - 97] == -1) {
				list[in.charAt(i) - 97] = i;
			}
		}

		for (int i : list)
			System.out.print(i + " ");
	}

}
