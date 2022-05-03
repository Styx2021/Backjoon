import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n9020 {

	public static boolean isPrime(int n) {
		for (int i = 2; i * i <= n; ++i) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());

		for (int i = 0; i < size; ++i) {
			int n = Integer.parseInt(br.readLine());
			int pivot = n / 2;

			// 입력한 값을 반으로 나누었을 때 소수이면 그 두개를 더한 값이 정답이다
			if (isPrime(pivot)) {
				System.out.printf("%d %d\n", pivot, pivot);
			} else {
				// 기준값이 소수가 아닐때까지 반복하는 반복문
				while (isPrime(pivot) == false) {
					pivot++;
					// 오른쪽으로 이동하여 소수를 만나면
					if (isPrime(pivot)) {
						// 입력한 값에서 만난 소수를 뺐을 때 그 값이 소수면 정답은 만난 소수와 입력한 값에서 만난 소수를 뺀 값이다.
						if (isPrime(n - pivot)) {
							System.out.printf("%d %d\n", (n - pivot), pivot);
						} else
							// 다음 반복문에서 나가지 않게 하기 위해 값을 증가시키고 반복문을 다시 만나야 한다.
							pivot++;
					}
				}
			}
		}
	}
}
