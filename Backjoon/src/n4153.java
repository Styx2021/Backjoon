import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n4153 {

	public static boolean isPythagoras(int a, int b, int c) {
		if ((a * a) + (b * b) == (c * c))
			return true;
		return false;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		while (a != 0 && b != 0 && c != 0) {
			if (a > b && a > c) {
				if (isPythagoras(b, c, a))
					System.out.println("right");
				else
					System.out.println("wrong");
			} else if (b > a && b > c) {
				if (isPythagoras(a, c, b))
					System.out.println("right");
				else
					System.out.println("wrong");
			} else {
				if (isPythagoras(a, b, c))
					System.out.println("right");
				else
					System.out.println("wrong");
			}
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
		}

	}

}
