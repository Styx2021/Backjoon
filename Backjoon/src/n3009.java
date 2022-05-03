import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n3009 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x[] = new int[3];
		int y[] = new int[3];

		for (int i = 0; i < 3; ++i) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}

		int result_x;
		int result_y;

		if ((x[0] != x[1]) && (x[0] != x[2])) {
			result_x = x[0];
		} else if ((x[1] != x[0]) && (x[1] != x[2])) {
			result_x = x[1];
		} else {
			result_x = x[2];
		}

		if (y[0] != y[1] && y[0] != y[2]) {
			result_y = y[0];
		} else if (y[1] != y[0] && y[1] != y[2]) {
			result_y = y[1];
		} else {
			result_y = y[2];
		}

		System.out.println(result_x + " " + result_y);
	}

}
