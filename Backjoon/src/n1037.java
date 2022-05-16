import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1037 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i) {
			int t = Integer.parseInt(st.nextToken());
			if (max < t)
				max = t;
			if (min > t)
				min = t;
		}

		System.out.println(max * min);

	}

}
