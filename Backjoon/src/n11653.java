import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class n11653 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

//		int list[] = new int[N];
//		int idx = 0;

		for (int i = 2; i <= N; ++i) {
//			int cnt = 0;
//			for (int j = 1; j <= i; ++j)
//				if (i % j == 0) {
//					cnt++;
//				}
			if (N % i == 0) {
//				while (N % i == 0) {
				bw.write(Integer.toString(i) + "\n");
				bw.flush();
				N /= i;
				i--;
//				}
			}
		}
		bw.close();

//		idx = 0;

//		while (list[idx] != 0) {
//			if (N % list[idx] == 0) {
//				System.out.println(list[idx]);
//				N /= list[idx];
//			} else {
//				idx++;
//			}
//		}
	}

}
