import java.util.Scanner;
import java.util.Arrays;

public class Team {
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0, solvable = 0;
		int[] counter = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				int x = sc.nextInt();
				if (x == 1) {
					count++;
				}
			}
			counter[i] = count;
			if (counter[i] >= 2) {
				solvable++;
				count = 0;
				continue;
			}
			count = 0;
		}
		
		System.out.println(solvable);
	
		sc.close(); 
	}
}
