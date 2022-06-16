import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n11721 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();

		int loop = s.length() / 10;

		int cnt = 0;

		StringBuilder sb = new StringBuilder();

		for (int i = 0; cnt <= loop; i = i + 10) {
			if (s.length() - i < 10) {
				sb.append(s.substring(i) + "\n");
			} else {
				sb.append(s.substring(i, i + 10) + "\n");
			}
			cnt++;
		}

		System.out.println(sb.toString());
	}

}
