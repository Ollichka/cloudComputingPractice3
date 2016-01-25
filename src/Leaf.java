import java.util.Scanner;

public class Leaf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {


			int n = sc.nextInt();
			int l = 1;
			if (n >= 0 && n <= 1000) {
				for (int i = n; i > 0; i++) {
					l += (n - 1) * 2+1;
					System.out.println(l);
				}
				System.out.println(n);
			}
		}
	}
}
