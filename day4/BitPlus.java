import java.util.Scanner;

public class BitPlus {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		bitOperation(n);
		sc.close();
	}

	private static void bitOperation(int n){
    	int sign = 1, X = 0;	
		for (int i = 0; i < n; i++) {
			Scanner sc = new Scanner(System.in);
			String expn = sc.next();
			if (expn.charAt(0) != 'X') {
				if (expn.charAt(0) == '+') {
					X = X + 1;
				} else {
					X = X - 1;
				}
				
			} else if (expn.charAt(0) == 'X') {
				if (expn.charAt(2) == '+') {
					X = X + 1;
				} else {
					X = X - 1;
				}
			}
		}
		System.out.println(X);
	}
}
