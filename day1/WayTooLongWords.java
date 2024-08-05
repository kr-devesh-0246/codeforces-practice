import java.util.Scanner;

public class WayTooLongWords {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();	
		for (int i = 0; i < n; i++) {
                        String word = sc.next();
			if (word.length() <= 10) {
				System.out.println(word);
				continue;
			}
                        int len = word.length()-2;
                        System.out.println(Character.toString(word.charAt(0)) + len + Character.toString(word.charAt(word.length()-1)));
                }
        }
}
