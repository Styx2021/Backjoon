import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n5532 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int L = Integer.parseInt(br.readLine());
		double A = Integer.parseInt(br.readLine());
		double B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());

		double guk = Math.ceil(A / C);
		double math = Math.ceil(B / D);

		System.out.println((int) (L - Math.max(guk, math)));
	}

}
