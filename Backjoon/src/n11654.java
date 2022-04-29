import java.util.Scanner;

public class n11654 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Scanner 객체는 char 형을 입력 받는 함수가 없으므로 next() 반환 값인 String을 char형으로 형 변환
		char in = sc.next().charAt(0);

		System.out.println((int) in);

		sc.close();
	}

}
