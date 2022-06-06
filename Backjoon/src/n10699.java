import java.text.SimpleDateFormat;
import java.util.Date;

public class n10699 {

	public static void main(String[] args) {
		Date nowDate = new Date();
		SimpleDateFormat nowFormat = new SimpleDateFormat("YYYY-MM-dd");
		String date = nowFormat.format(nowDate);
		System.out.println(date);

	}

}
