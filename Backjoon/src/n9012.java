import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class n9012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<String> stack = new Stack<>();
		int T = Integer.parseInt(br.readLine());

		String PS;
		boolean flag = false;
		for (int i = 0; i++ < T;) {
			PS = br.readLine();
			for (int j = 0; j < PS.length(); j++) {
				if (Character.toString(PS.charAt(j)).equals("(")) {
					stack.push("(");
				} else {
					if (stack.empty()) {
						flag = true;
						break;
					} else
						stack.pop();
				}
			}
			if (stack.empty() && flag == false) {
				System.out.println("YES");
				stack.clear();
			} else {
				System.out.println("NO");
				flag = false;
				stack.clear();
			}
		}
	}

}
