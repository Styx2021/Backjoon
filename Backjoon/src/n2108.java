import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2108 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());
		int list[] = new int[8001];
		double sum = 0;
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		int mid = 10000;
		int mode = 10000;

		for (int i = 0; i < size; ++i) {
			int value = Integer.parseInt(br.readLine());
			sum += value;
			list[value + 4000]++;

			if (value > max)
				max = value;
			if (value < min)
				min = value;
		}

		int count = 0;
		int mode_max = 0;

		boolean flag = false;

		for (int i = min + 4000; i <= max + 4000; ++i) {
			if (list[i] > 0) {
				if (count < (size + 1) / 2) {
					count += list[i];
					mid = i - 4000;
				}

				if (mode_max < list[i]) {
					mode_max = list[i];
					mode = i - 4000;
					flag = true;
				} else if (mode_max == list[i] && flag == true) {
					mode = i - 4000;
					flag = false;
				}
			}
		}

		System.out.println((int) Math.round(sum / size));
		System.out.println(mid);
		System.out.println(mode);
		System.out.println(max - min);

	}

}
