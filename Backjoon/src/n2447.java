import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2447 {
	// 못푼 문제

	public static void star(char[][] s, int n) {
		if (n == 0)
			return;

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		char s[][] = new char[n][n];

		star(s, n);
	}

}
