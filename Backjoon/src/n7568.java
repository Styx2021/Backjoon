import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n7568 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());
		int w[] = new int[size];
		int h[] = new int[size];
		int rank[] = new int[size];

		for (int i = 0; i < size; ++i) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			w[i] = Integer.parseInt(st.nextToken());
			h[i] = Integer.parseInt(st.nextToken());
			rank[i] = 1;
		}

		for (int i = 0; i < size - 1; ++i) {
			for (int j = i + 1; j < size; ++j) {
				if (w[i] > w[j] && h[i] > h[j]) {
					rank[j]++;
				} else if (w[i] < w[j] && h[i] < h[j]) {
					rank[i]++;
				}
			}
		}

		for (int i = 0; i < size; ++i) {
			System.out.print(rank[i] + " ");
		}
	}

}
