import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n9086 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String s;

		for (int i = 0; i < N; ++i) {
			s = br.readLine();
			System.out.println(s.substring(0, 1) + s.substring(s.length() - 1));
		}

	}

}
