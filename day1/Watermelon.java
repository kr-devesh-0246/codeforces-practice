import java.util.Scanner;

public class Watermelon {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		sc.close();

		int[] arr = new int[w/2];
		int count = 0;
		for (int i = 2; i < w; i+= 2) {
			arr[count++] = i;
		}
		
		// two pointers
		for (int i = 0; i < count; i++) {
			for (int j = i; j < count; j++) {
				if (arr[i] + arr[j] == w) {
					System.out.println("YES");
					return;
				}
			}
		}
		System.out.println("NO");
	}
}
