import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n3053 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double n = Double.parseDouble(br.readLine());

		System.out.println(Math.PI * Math.pow(n, 2));
		System.out.println(2 * Math.pow(n, 2));
	}

}
