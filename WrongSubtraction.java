import java.util.Scanner;

public class WrongSubtraction {
	public static void main(String[] args) {
		int n, k;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		sc.close();

		for (int i = 0; i < k; i++) {
			int digit = n % 10;
			if (digit != 0) {
				n -= 1;
			} else {
				n /= 10;
			}
		}	
		
		System.out.println(n);
	}
}
