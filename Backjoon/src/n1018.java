import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1018 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		String ch[] = new String[n];

		for (int i = 0; i < n; ++i) {
			ch[i] = br.readLine();
		}
		int min = 32;
		int result = 0;

//		for (int i = 0; i < 8; ++i) {
//			if (Character.toString(ch_cp[i].charAt(0)).equals("B")) {
//				System.out.println(ch_cp[i].substring(0, 8).replace("BW", "").length());
//				System.out.println(ch_cp[i]);
//			} else
//				System.out.println(ch_cp[i].substring(0, 8).replace("WB", "").length());
//		}
		String B = "BWBWBWBW";
		String W = "WBWBWBWB";

		boolean flag = true;

		for (int i = 0; i <= (m - 8); ++i) {
			for (int j = 0; j <= (n - 8); ++j) {
				for (int l = j; l < (j + 8); ++l) {
					if (l == j && Character.toString(ch[l].charAt(i)).equals("W"))
						flag = false;
					if (flag) {
//						System.out.println(ch[l].substring(i, i + 8));
						int cnt = 0;
						for (int k = i; k < i + 8; ++k) {
							if (Character.toString(ch[l].charAt(k))
									.equals(Character.toString(B.charAt(k - i))) == false)
								cnt++;
						}
						result += cnt;
//						System.out.println(result);
						flag = false;
					} else {
//						System.out.println(ch[l].substring(i, i + 8));
						int cnt = 0;
						for (int k = i; k < i + 8; ++k) {
							if (Character.toString(ch[l].charAt(k))
									.equals(Character.toString(W.charAt(k - i))) == false)
								cnt++;
						}
						result += cnt;
//						System.out.println(result);
						flag = true;
					}
				}
//				System.out.println(result);
				result = Math.min(result, 64 - result);
				if (result < min)
					min = result;
				result = 0;
//				System.out.println(min);
			}
		}

		System.out.println(min);
	}

}
