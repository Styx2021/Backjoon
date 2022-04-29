import java.util.Scanner;

public class n2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		if ((x == y) && (y == z)) {
			System.out.print(10000 + (x * 1000));
		} else if (((x == y) && (y != z)) || ((x == z) && (y != x)) || ((y == z) && (y != x))) {
			if ((x == y) && (y != z) || (x == z) && (y != x)) {
				System.out.print(1000 + (x * 100));
			} else {
				System.out.print(1000 + (y * 100));
			}
		} else if (x > y && x > z) {
			System.out.print(x * 100);
		} else if (y > x && y > z) {
			System.out.print(y * 100);
		} else {
			System.out.print(z * 100);
		}

		sc.close();
	}
}
