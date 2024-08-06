import java.util.Scanner;

public class TheatreSquare {
	public static void main(String[] args) {
		int n, m, a;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		a = sc.nextInt();	
		System.out.println(theatreSquare(n, m, a));
		sc.close();
	}

	private static int theatreSquare(long n, long m, long a) {
		int flagstonesLength = (n + a - 1) / a;
		int flagstonesWidth = (m + a - 1) / a;

		int totalFlagstones = flagstonesLength * flagstonesWidth;
		return totalFlagstones; 	
	}
}
