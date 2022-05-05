import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n11729 {

	public static int cnt = 0;

	// from에서 to 로 보내야 하는 hanoi탑 문제
	public static void hanoi(int n, int from, int other, int to, StringBuilder sb) {
		if (n == 0)
			return;
		// n-1개의 탑은 일단 2번째로 보내야 목표인 3번째로 보낼 수 있다.
		hanoi(n - 1, from, to, other, sb);
		// 그리고 맨 아래 원반을 목적지로 이동시키고
		sb.append(from + " " + to + "\n");
		// 다시 n-1개의 탑을 목적지로 이동시키면 된다.
		hanoi(n - 1, other, from, to, sb);
		cnt++;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		hanoi(n, 1, 2, 3, sb);

		System.out.println(cnt);
		System.out.println(sb.toString());
	}

}
