import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class n10828 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i++ < N;) {
			String s = br.readLine();
			if (s.contains("push")) {
				stack.push(Integer.parseInt(s.substring(5)));
			} else {
				switch (s) {
				case "top":
					if (!stack.empty())
						System.out.println(stack.peek());
					else
						System.out.println(-1);
					break;
				case "pop":
					if (!stack.empty()) {
						System.out.println(stack.peek());
						stack.pop();
					} else
						System.out.println(-1);
					break;
				case "size":
					System.out.println(stack.size());
					break;
				case "empty":
					if (stack.empty())
						System.out.println(1);
					else
						System.out.println(0);
					break;
				default:
					break;
				}
			}
		}
	}

}
