import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gomgom_A {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int chicken = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int coke = Integer.parseInt(st.nextToken());
		int beer = Integer.parseInt(st.nextToken());

		if (coke >= 2)
			coke = Math.round(coke / 2);
		else
			coke = 0;

		if (coke + beer >= chicken && chicken != 0)
			System.out.println(chicken);
		else if (coke + beer < chicken && chicken != 0)
			System.out.println(coke + beer);
		else
			System.out.println(0);
	}

}
