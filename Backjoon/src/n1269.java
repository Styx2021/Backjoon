import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class n1269 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TreeSet<Integer> set = new TreeSet<>();
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i) {
			int element = Integer.parseInt(st.nextToken());
			if (!set.add(element))
				set.remove(element);
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; ++i) {
			int element = Integer.parseInt(st.nextToken());
			if (!set.add(element))
				set.remove(element);
		}

		System.out.println(set.size());
	}

}
