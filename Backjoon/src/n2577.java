import java.util.Scanner;

public class n2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		// int형을 String으로 형변환
		String sum = Integer.toString(a * b * c);

		int[] result = new int[10];

		for (int i = 0; i < sum.length(); ++i) {
			// .charAt() 문자열 요소를 하나의 문자로 반환, Char형을 int형으로 형변환
			result[Character.getNumericValue(sum.charAt(i))]++;
		}
		for (int i : result) {
			System.out.println(i);
		}
	}

}
