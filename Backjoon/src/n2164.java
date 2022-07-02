import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class n2164 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		Deque<Integer> que = new LinkedList<>();

		for (int i = 1; i <= N; i++) {

			que.offer(i);

		}

		int peek;

		while (que.size() != 1) {

			que.poll();
			peek = que.poll();
			que.offer(peek);

		}

		System.out.println(que.peek());
	}

}
