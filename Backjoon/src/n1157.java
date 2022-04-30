import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String in = br.readLine();

		int count[] = new int[26];
		for (int i = 0; i < in.length(); ++i) {
			if (in.charAt(i) >= 97) {
				count[in.charAt(i) - 97] += 1;
			} else
				count[in.charAt(i) - 65] += 1;
		}

		int max = 0;
		char result = '?';

		for (int j = 0; j < 26; ++j) {
			if (count[j] > max) {
				max = count[j];
				result = (char) ((char) 65 + j);
			} else if (count[j] == max)
				result = '?';
		}

		System.out.println(result);
	}
}
