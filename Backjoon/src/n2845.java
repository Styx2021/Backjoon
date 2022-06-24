import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2845 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int L = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i++ < 5;) {
			sb.append(Integer.parseInt(st.nextToken()) - L + " ");
		}

		System.out.println(sb.toString());

	}

}
