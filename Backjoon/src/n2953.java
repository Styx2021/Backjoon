import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2953 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int w = 0;
		int score = 0;
		int sum;

		for (int i = 0; i++ < 5;) {

			sum = 0;
			st = new StringTokenizer(br.readLine());

			for (int j = 0; j++ < 4;) {

				sum += Integer.parseInt(st.nextToken());

			}

			if (sum > score) {

				score = sum;
				w = i;

			}

		}

		System.out.println(w + " " + score);

	}

}
