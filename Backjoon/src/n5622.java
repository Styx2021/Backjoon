import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n5622 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String in = br.readLine();

		int mapping[] = new int[26];
		int count = 3;
		int result = 0;

		for (int i = 0; i < 26;) {
			if ((char) (i + 65) == 'P' || (char) (i + 65) == 'W') {
				for (int j = 0; j < 4; ++j) {
					if (i + j >= 26)
						break;
					mapping[i + j] = count;
				}
				i += 4;
				count++;
			} else {
				for (int j = 0; j < 3; ++j) {
					if (i + j >= 26)
						break;
					mapping[i + j] = count;
				}
				i += 3;
				count++;
			}
		}

		for (int i = 0; i < in.length(); ++i) {
			result += mapping[in.charAt(i) - 65];
		}

		System.out.println(result);
	}

}
