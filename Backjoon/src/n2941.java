import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2941 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String in = br.readLine();
		int count = 0;

		for (int i = 0; i < in.length();) {
			if (i < in.length() - 1) {
				if (in.charAt(i) == 'c') {
					if (in.charAt(i + 1) == '=' || in.charAt(i + 1) == '-') {
						count++;
						i += 2;
					} else {
						count++;
						i += 1;
					}
				} else if (in.charAt(i) == 'd') {
					if (in.charAt(i + 1) == '-') {
						count++;
						i += 2;
					} else if (i < in.length() - 2) {
						if (in.charAt(i + 1) == 'z' && in.charAt(i + 2) == '=') {
							count++;
							i += 3;
						} else {
							count++;
							i += 1;
						}
					} else {
						count++;
						i += 1;
					}
				} else if (in.charAt(i) == 'l' && in.charAt(i + 1) == 'j') {
					count++;
					i += 2;
				} else if (in.charAt(i) == 'n' && in.charAt(i + 1) == 'j') {
					count++;
					i += 2;
				} else if (in.charAt(i) == 's' && in.charAt(i + 1) == '=') {
					count++;
					i += 2;
				} else if (in.charAt(i) == 'z' && in.charAt(i + 1) == '=') {
					count++;
					i += 2;
				} else {
					count++;
					i += 1;
				}
			} else {
				count++;
				break;
			}
		}

		System.out.println(count);
	}

}
