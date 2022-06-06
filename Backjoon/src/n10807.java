import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n10807 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int list[] = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; ++i) {
			list[i] = Integer.parseInt(st.nextToken());
		}

		int v = Integer.parseInt(br.readLine());
		Arrays.sort(list);
		int cnt = 0;
		for (int i : list) {
			if (v == i)
				cnt++;
			else if (i > v)
				break;
		}

		System.out.println(cnt);
	}

}
