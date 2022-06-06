import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n5597 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result[] = new int[31];

		for (int i = 0; i < 28; ++i) {
			int t = Integer.parseInt(br.readLine());
			result[t] = 1;
		}

		for (int i = 1; i < 31; ++i) {
			if (result[i] == 0)
				System.out.println(i);
		}

	}

}
