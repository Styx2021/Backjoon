import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Gomgom_B {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String list[] = new String[n];
		int cnt = 0;

		for (int i = 0; i < n; ++i) {
			String t = br.readLine();
			if (t.equals("ENTER"))
				list = new String[n];
			else if (!Arrays.toString(list).contains(t)) {
				cnt++;
				list[i] = t;
			}
		}

		System.out.println(cnt);
	}

}
