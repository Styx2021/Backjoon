import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class n18258 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> que = new LinkedList<>();

		int N = Integer.parseInt(br.readLine());

		String console;

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i++ < N;) {
			console = br.readLine();

			switch (console) {
			case "pop":

				if (que.isEmpty())
					sb.append(-1 + "\n");
				else
					sb.append(que.poll() + "\n");
				break;

			case "size":

				sb.append(que.size() + "\n");
				break;

			case "front":

				if (que.isEmpty())
					sb.append(-1 + "\n");
				else
					sb.append(que.peek() + "\n");
				break;

			case "back":

				if (que.isEmpty())
					sb.append(-1 + "\n");
				else
					sb.append(que.peekLast() + "\n");
				break;

			case "empty":

				if (que.isEmpty())
					sb.append(1 + "\n");
				else
					sb.append(0 + "\n");
				break;

			default:

				que.offer(Integer.parseInt(console.substring(5)));
				break;

			}
		}

		System.out.println(sb.toString());

	}

}
