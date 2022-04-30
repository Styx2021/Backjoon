import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1316 {
	public static int groupWord(String[] list) {
		int count = 0;
		String temp = "";

		for (int i = 0; i < list.length; ++i) {
			for (int j = 0; j < list[i].length(); ++j) {
				if (list[i].length() == 1) {
					count++;
					break;
				}
				temp = Character.toString(list[i].charAt(j));
				if (list[i].charAt(j) != list[i].charAt(j + 1)) {
					if (list[i].substring(j + 1).contains(temp))
						break;
				}
				if (j >= list[i].length() - 2) {
					count++;
					break;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());
		String list[] = new String[size];

		for (int i = 0; i < size; ++i) {
			list[i] = br.readLine();
		}

		System.out.println(groupWord(list));

	}

}
