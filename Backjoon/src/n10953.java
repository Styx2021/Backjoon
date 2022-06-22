import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n10953 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		String[] arr = new String[2];

		for (int i = 0; i++ < T; System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]))) {
			arr = br.readLine().split(",");
		}

	}

}
