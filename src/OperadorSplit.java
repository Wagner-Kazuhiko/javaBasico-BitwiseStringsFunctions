import java.util.Locale;
import java.util.Scanner;

public class OperadorSplit {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String s = "Potato Apple Lemon";
		
		String[] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);

	}

}
