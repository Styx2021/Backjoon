import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1002 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());

		for (int i = 0; i < size; ++i) {
			int turret[] = new int[6];
			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int j = 0; j < 6; ++j) {
				turret[j] = Integer.parseInt(st.nextToken());
			}

			// 두 좌표 사이의 거리는 피타고라스의 정리를 이용해 (x2-x1)^2 + (y2-y1)^2 = d^2를 그대로 거리로 사용한다.
			int d = (int) (Math.pow(turret[3] - turret[0], 2) + Math.pow(turret[4] - turret[1], 2));

			// 두 점의 위치가 같고 반 지름의 위치도 같을 경우 모든 점이 겹치므로 무한이다.
			if ((turret[0] == turret[3]) && (turret[1] == turret[4]) && (turret[2] == turret[5])) {
				System.out.println(-1);
				continue;
			}

			// 두 반지름을 더한 값
			double r_sum = Math.pow(turret[2] + turret[5], 2);
			// 두 반지름을 뺀 값
			double r_sub = Math.pow(turret[5] - turret[2], 2);

			// 두 점 사이의 거리가 두 반지름을 더한 값보다 작고, 두 반지름을 뺀 값보다 크면 두 점을 외접하고 있는 것이다.
			if (r_sum > d && d > r_sub)
				System.out.println(2);
			// 두 반지름을 더한 값이 두 점사이의 거리와 같거나
			// 큰 반지름에서 작은 반지름을 뺀 값이 두 점사이의 거리와 같으면 한 점을 접하고 있는 것이다.
			else if (r_sum == d || r_sub == d)
				System.out.println(1);
			// 두 반지름을 더해도 두 점 사이의 거리보다 작거나
			// 큰 반지름에서 작은 반지름을 뺀 값이 두 점사이의 거리보다 크다면 아무 점도 접하지 못한다.
			else if (r_sum < d || d < r_sub)
				System.out.println(0);

		}
	}

}
