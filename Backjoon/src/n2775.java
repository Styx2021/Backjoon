import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2775 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());

		int apt[][] = new int[15][15];

		for (int i = 0; i < 15; ++i) {
			apt[0][i] = i; // 0층 i호에 사는 사람들은 i값을 가진다.
			apt[i][1] = 1; // i층 1호에 사는 사람들은 1값을 가진다.
		}

		// 내 층 전 호수의 사람 수 + 내 아래층 호수의 사람 수 = 내 사람 수
		for (int i = 1; i < 15; ++i) {
			for (int j = 1; j < 15; ++j) {
				apt[i][j] = apt[i - 1][j] + apt[i][j - 1];
			}
		}

		for (int i = 0; i < size; ++i) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			System.out.println(apt[k][n]);
		}
	}

}