import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1978 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());
		int list[] = new int[size];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0;

		for (int i = 0; i < size; ++i) {
			list[i] = Integer.parseInt(st.nextToken());
			int n = 0;
			for (int j = 1; j <= list[i]; ++j) {
				if (list[i] % j == 0)
					n++;
			}
			if (n == 2)
				cnt++;
		}

		System.out.println(cnt);

	}

}
