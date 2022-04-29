import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2675 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());

		for (int i = 0; i < size; ++i) {
			String in = br.readLine();
			String s[] = in.split(" ");

			for (int j = 0; j < s[1].length(); ++j) {
				for (int k = 0; k < Integer.parseInt(s[0]); ++k) {
					System.out.print(s[1].charAt(j));
				}
			}
			System.out.println();
		}
		br.close();
	}
}
