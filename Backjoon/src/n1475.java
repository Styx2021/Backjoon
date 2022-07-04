import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1475 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String N = br.readLine();

		int[] list = new int[10];

		for (int i = 0; i < N.length(); i++) {

			list[Character.getNumericValue(N.charAt(i))]++;

		}

		list[6] = (int) Math.round((list[6] + list[9]) / 2.0);
		list[9] = list[6];

		int result = 0;

		for (int i : list) {

			if (result < i)
				result = i;

		}

		System.out.println(result);

	}

}
