import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n10250 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());

		for (int i = 0; i < size; ++i) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());

			for (int c = 0; c < w; ++c) {
				for (int l = 0; l < h; ++l) {
					n--;
					if (n == 0) {
						System.out.printf("%d%02d\n", l + 1, c + 1);
						break;
					}
				}
				if (n == 0)
					break;
			}
		}

	}

}
