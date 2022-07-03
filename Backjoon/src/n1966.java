import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class n1966 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Deque<Integer> que = new LinkedList<>();
		Deque<Integer> que_idx = new LinkedList<>();

		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		boolean flag = false;

		int[] list;

		for (int i = 0; i++ < T;) {

			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < N; j++) {

				que.offer(Integer.parseInt(st.nextToken()));
				que_idx.offer(j);

			}

			list = new int[N];
			int cnt = 0;

			while (!que.isEmpty()) {
				int peek = que.peek();

				for (int idx : que) {
					if (idx > peek)
						flag = true;
				}

				if (flag) {

					int temp = que.poll();
					que.offer(temp);
					flag = false;

					temp = que_idx.poll();
					que_idx.offer(temp);

				} else {

					que.poll();
					list[cnt++] = que_idx.poll();

				}
			}

			for (int j = 0; j < N; j++) {
				if (list[j] == M)
					System.out.println(j + 1);
			}
		}

	}

}
