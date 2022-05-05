import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2750 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());
		int list[] = new int[size];
		int temp = 0;

		for (int i = 0; i < size; ++i) {
			list[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 0; i < list.length; ++i) {
			for (int j = 0; j < list.length - 1 - i; ++j) {
				if (list[j] > list[j + 1]) {
					temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < list.length; ++i) {
			System.out.println(list[i]);
		}

	}

}
