import java.util.Scanner;

public class newMain7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int n, sum, count;
		double avg;
		int scores[] = new int[1000];

		for (int i = 0; i < c; ++i) {
			n = sc.nextInt();
			sum = 0;
			count = 0;
			for (int j = 0; j < n; ++j) {
				scores[j] = sc.nextInt();
				sum += scores[j];
			}
			avg = (double) sum / n;

			for (int j = 0; j < n; ++j) {
				if (scores[j] > avg) {
					count++;
				}
			}
			System.out.printf("%.3f", 100.0 * count / n);
			System.out.println("%");
		}
		sc.close();
	}

}
