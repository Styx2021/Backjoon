import java.util.Scanner;

public class n1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		double list[] = new double[size];

		double max = 0;

		for (int i = 0; i < size; ++i) {
			list[i] = sc.nextDouble();
			if (list[i] > max)
				max = list[i];
		}

		double sum = 0;
		for (int i = 0; i < size; ++i) {
			list[i] = (list[i] / max) * 100;
			sum += list[i];
		}
		System.out.println(sum / size);
	}

}
