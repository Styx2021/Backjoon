import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2744 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		String result = "";

		for (char i : s.toCharArray()) {
			if ((i - 0) > 90) {
				result = result.concat(Character.toString(i).toUpperCase());
			} else {
				result = result.concat(Character.toString(i).toLowerCase());
			}
		}

		System.out.println(result);
	}

}
