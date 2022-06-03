import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n14888 {

	public static void dfs(int depth) {

		if (N - 1 == depth) {
			int sum = list[0];
			for (int i = 1; i < list.length; ++i) {
				if (op_list[i - 1] == "+")
					sum += list[i];
				else if (op_list[i - 1] == "-")
					sum -= list[i];
				else if (op_list[i - 1] == "*")
					sum *= list[i];
				else
					sum /= list[i];
			}
			if (sum > MAX)
				MAX = sum;
			if (sum < MIN)
				MIN = sum;
//			for (String op : op_list) {
//				sb.append(op);
//			}
//			sb.append("\n");
			return;
		}

		for (int i = 0; i < operator.length; ++i) {

			if (visit[i] == false) {
				visit[i] = true;
				op_list[depth] = operator[i];
				dfs(depth + 1);

				visit[i] = false;
			}
		}
		return;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		list = new int[N];
		operator = new String[N - 1];
		op_list = new String[N - 1];
		visit = new boolean[N - 1];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; ++i) {
			list[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < N - 1; ++i) {
			visit[i] = false;
		}

		st = new StringTokenizer(br.readLine());
		int cnt = 0;

		for (int i = 0; i < 4; ++i) {
			int loop = Integer.parseInt(st.nextToken());
			for (int j = 0; j < loop; ++j) {
				if (i == 0)
					operator[cnt++] = "+";
				else if (i == 1)
					operator[cnt++] = "-";
				else if (i == 2)
					operator[cnt++] = "*";
				else
					operator[cnt++] = "/";
			}
		}

		dfs(0);

		System.out.println(MAX);
		System.out.println(MIN);
		System.out.println(sb.toString());
	}

	public static int N;
	public static int list[];
	public static String operator[];
	public static String op_list[];
	public static boolean visit[];
	public static int MAX = Integer.MIN_VALUE;
	public static int MIN = Integer.MAX_VALUE;
	public static StringBuilder sb = new StringBuilder();

}
