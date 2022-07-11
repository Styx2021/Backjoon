import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n5565 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int price = Integer.parseInt(br.readLine());

		for (int i = 0; i++ < 9;) {

			price -= Integer.parseInt(br.readLine());

		}

		System.out.println(price);
	}

}
