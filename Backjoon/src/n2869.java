import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2869 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int length = Integer.parseInt(st.nextToken());

//		int day = 0;
//		int count = 0;
//
//		while (day < length) {
//			day += up;
//			if (day >= length) {
//				count++;
//				break;
//			} else
//				count++;
//			day -= down;
//		}

//		System.out.println(count);

		// 목표에 도달하기 한 칸 전까지 걸리는 일수
		int day = (length - down) / (up - down);

		// 위 식대로 계산해서 (up-down)보다 작은 나머지 값이 존재하면 한 칸 더 올라가야 한다.
		if ((length - down) % (up - down) != 0) {
			day++;
		}
		System.out.println(day);
	}

}
