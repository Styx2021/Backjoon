import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class n1764 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TreeSet<String> set = new TreeSet<>();
		TreeSet<String> result = new TreeSet<>();
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		for (int i = 0; i < n; ++i) {
			set.add(br.readLine());
		}

		for (int i = 0; i < m; ++i) {
			String element = br.readLine();
			if (!set.add(element))
				result.add(element);
		}

		System.out.println(result.size());
		Iterator iter = result.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
