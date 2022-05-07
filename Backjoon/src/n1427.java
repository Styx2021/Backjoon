import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class n1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String list[] = br.readLine().split("");
		Arrays.sort(list, Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < list.length; ++i) {
			sb.append(list[i]);
		}

		System.out.println(sb.toString());
	}

}
