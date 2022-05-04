import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1436 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String idx = "666";

		while (n != 0) {
			if (idx.contains("666")) {
				if (n == 1) {
					System.out.println(idx);
					break;
				} else {
					n--;
					idx = Integer.toString(Integer.parseInt(idx) + 1);
				}
			} else {
				idx = Integer.toString(Integer.parseInt(idx) + 1);
			}
		}

	}

}
