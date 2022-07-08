import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class n2161 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		Deque<Integer> que = new LinkedList<>();
		Deque<Integer> result = new LinkedList<>();

		for (int i = 1; i <= N; i++) {

			que.offer(i);

		}

		int re_peek;
		int peek;

		while (que.size() != 1) {

			re_peek = que.poll();
			peek = que.poll();
			que.offer(peek);

			result.offer(re_peek);

		}

		while (!result.isEmpty()) {
			System.out.print(result.poll() + " ");
		}
		System.out.println(que.peek());

	}

}
