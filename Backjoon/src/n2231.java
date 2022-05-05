import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2231 {

	public static int spwan(int n) {
		for (int i = 1; i <= n; ++i) {
			int len = Integer.toString(i).length();
			int result = 0;
			for (int j = 0; j < len; ++j) {
				result += Integer.toString(i).charAt(j) - '0';
			}
			if (n == (i + result)) {
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

//		int m = 198;
//		System.out.println(Integer.toString(m).length());

		System.out.println(spwan(n));

	}

}
