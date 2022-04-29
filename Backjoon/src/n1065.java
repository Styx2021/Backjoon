import java.util.Scanner;

public class n1065 {

	public static boolean d(int n) {

		String s = Integer.toString(n);
		if (s.length() == 1)
			return true;

		int jump = Character.getNumericValue(s.charAt(0)) - Character.getNumericValue(s.charAt(1));

		for (int i = 1; i < s.length() - 1; ++i) {
			if (jump != Character.getNumericValue(s.charAt(i)) - Character.getNumericValue(s.charAt(i + 1)))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= input; ++i) {
			if (d(i) == true)
				count++;
		}

		System.out.println(count);

		sc.close();
	}

}
