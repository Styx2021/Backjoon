import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n3034 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		double c = (a * a) + (b * b);
		c = Math.sqrt(c);

		for (int i = 0; i < n; ++i) {
			if (c >= Integer.parseInt(br.readLine()))
				System.out.println("DA");
			else
				System.out.println("NE");
		}
	}

}
