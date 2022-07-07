import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class n11866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		Deque<Integer> que = new LinkedList<>();
		Deque<Integer> result = new LinkedList<>();

		for (int i = 0; i++ < N; que.offer(i))
			;

		while (!que.isEmpty()) {

			for (int i = 0; i++ < K - 1;) {

				int t = que.poll();
				que.offer(t);

			}

			result.offer(que.poll());

		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {

			if (i != N - 1)
				sb.append(result.poll() + ", ");
			else
				sb.append(result.poll() + ">");

		}

		System.out.println("<" + sb.toString());

	}

}
