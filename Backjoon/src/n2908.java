import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2908 {

	public static String[] reverse(String s[]) {
		for (int i = 0; i < (s.length / 2); ++i) {
			String temp = s[i];
			s[i] = s[s.length - i - 1];
			s[s.length - i - 1] = temp;
		}
		return s;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		String a[] = st.nextToken().split("");
		String b[] = st.nextToken().split("");

		reverse(a);
		reverse(b);

		int aResult = Integer.parseInt(String.join("", a));
		int bResult = Integer.parseInt(String.join("", b));

		if (aResult > bResult)
			System.out.println(aResult);
		else
			System.out.println(bResult);
	}
}
