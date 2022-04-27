import java.util.Scanner;
public class n18108 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int add_min = sc.nextInt();
		
		if(add_min == 0) {
			System.out.print(hour+" "+min);
		}else {
			min += add_min;
			hour += min/60;
			hour = hour%24;
			min = min % 60;
			System.out.print(hour+" "+min);
		}
	}

}
