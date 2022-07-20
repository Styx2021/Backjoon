import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n12015 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] A = new int[N];
		int[] LIS = new int[N];

		for (int i = 0; i < N; ++i) {

			A[i] = Integer.parseInt(st.nextToken());

		}

		LIS[0] = A[0];
		int lengthOfLIS = 1;

		for (int i = 1; i < N; ++i) {

			int key = A[i];

			if (LIS[lengthOfLIS - 1] < key) {

				LIS[lengthOfLIS] = key;
				lengthOfLIS++;

			} else {

				int left = 0;
				int right = lengthOfLIS;

				while (left < right) {

					int mid = (left + right) / 2;

					if (LIS[mid] < key) {

						left = mid + 1;

					} else {

						right = mid;

					}
				}

				LIS[left] = key;

			}

		}

		System.out.println(lengthOfLIS);

	}

}
