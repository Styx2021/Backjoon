import java.util.Scanner;

public class n11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();

		int result = 0;
		for (int i = 0; i < size; ++i) {
			// char형을 int형으로 형변환
			result += Character.getNumericValue(s.charAt(i));
		}
		System.out.println(result);
	}

}
