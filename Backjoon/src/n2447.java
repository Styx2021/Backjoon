import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2447 {
	// 못푼 문제
	public static void star(int n) {

		if (n != 0) {
			if (n % 3 == 1) {
				System.out.println("*");
				star(n - 1);
			}
		}
//			}else if (){
//				
//			}
//		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		star(n * n);
	}

}
