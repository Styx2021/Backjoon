import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1712 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String price[] = new String[3];

		price = br.readLine().split(" ");

		int A = Integer.parseInt(price[0]);
		int B = Integer.parseInt(price[1]);
		int C = Integer.parseInt(price[2]);

		if (B >= C)
			System.out.println(-1);
		else
			System.out.println(A / (C - B) + 1);

	}

}