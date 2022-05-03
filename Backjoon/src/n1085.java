import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1085 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		int result = 0;

		if (x - 0 < w - x)
			result = (x - 0);
		else
			result = (w - x);

		if (y - 0 < h - y && y - 0 < result)
			result = (y - 0);
		else if (h - y < result)
			result = (h - y);

		System.out.println(result);

	}

}
