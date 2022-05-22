import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Gomgom_B {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		TreeSet<String> set = new TreeSet<>();

		int cnt = 0;
		for (int i = 0; i < n; ++i) {
			String element = br.readLine();
			if (element.equals("ENTER")) {
				set.clear();
			} else if (set.add(element))
				cnt++;
		}
		System.out.println(cnt);
	}

}
