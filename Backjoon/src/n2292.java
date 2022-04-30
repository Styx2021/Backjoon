import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2292 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int count = 1;
		int table = 1;
		int idx = 0;

		do {
			if (n == 1)
				break;
			table += (idx += 6);
			count++;
		} while (n > table);

		System.out.println(count);
	}

}
