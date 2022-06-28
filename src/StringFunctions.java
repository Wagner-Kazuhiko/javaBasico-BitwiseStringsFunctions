import java.util.Locale;
import java.util.Scanner;

public class StringFunctions {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("G");
		int j = original.lastIndexOf("c");
		
		System.out.println(original + "- lowercase - " + s01);
		System.out.println(original + "- upper - " + s02);
		System.out.println(original + "- trim - " + s03);
		System.out.println(original + "- substring - " + s04);
		System.out.println(original + "- substring - " + s05);
		System.out.println(original + "- replace - " + s06);
		System.out.println(original + "- replace - " + s07);
		System.out.println(original + "- indexof - " + i);
		System.out.println(original + "- lastindexof - " + j);
		
	}

}
