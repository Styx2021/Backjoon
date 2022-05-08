import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n10989 {

	public static int[] CountingSort(int[] list, int k) {
		int[] b = new int[list.length];
		int[] C = new int[k + 1];

		for (int i = 1; i < list.length; ++i) {
			C[list[i]]++;
		}

		for (int i = 2; i <= k; ++i) {
			C[i] = C[i - 1] + C[i];
		}

		for (int i = list.length - 1; i >= 1; --i) {
			b[C[list[i]]] = list[i];
			C[list[i]]--;
		}

		return b;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());
		int list[] = new int[size + 1];
		int k = 0;
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= size; ++i) {
			list[i] = Integer.parseInt(br.readLine());
			if (list[i] > k)
				k = list[i];
		}

		int b[] = CountingSort(list, k);

		for (int i = 1; i < b.length; ++i) {
			sb.append(b[i] + "\n");
		}

		System.out.println(sb.toString());
	}

}
