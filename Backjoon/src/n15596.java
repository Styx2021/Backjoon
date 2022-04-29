import java.util.Scanner;

public class n15596 {

	public static long sum(int a[]) {
		long result = 0;
		for (int i = 0; i < a.length; ++i)
			result += a[i];
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int a[] = new int[size];

		for (int i = 0; i < size; ++i) {
			a[i] = sc.nextInt();
		}
		System.out.println(sum(a));

		sc.close();
	}

}
