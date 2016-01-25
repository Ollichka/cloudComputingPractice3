import java.io.PrintWriter;
import java.util.Scanner;

public class Rabbit {

	private static int p;

	// rabbits population

	public static int breed(int n, int k) {
		if (n == 0) {
			System.out.println("11");
			return 1;
		}
		if (n > 0 && n <= 100) {

			if (k >= 0 && k <= 10000) {

				if (p >= k) {
					p = p - k;
					System.out.println("12");
				}
				// if(p==0){
				// return p;
				// }
				p = pow(2, n);
				System.out.println("13");
				return p;
			}
		}
		return -1;
	}

	private static int pow(int j, int b) {
		if (b == 0)
			return 1;
		if (b == 1)
			return j;
		else {
			for (int i = 0; i <= j; i++) {
				b = b * b;
			}
			return b;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// PrintWriter out = new PrintWriter(System.out, true);
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			// number of months
			int k = sc.nextInt();
			// number of rabbits eaten
			System.out.println("Number of rabbits after " + n + " month(s) is "
					+ breed(n, k));
		}
	}
}
