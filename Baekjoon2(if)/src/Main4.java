import java.util.Scanner;

public class Main4 {
//	문제
//	세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
//
//	입력
//	첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)
//
//	출력
//	두 번째로 큰 정수를 출력한다.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num[] = new int[3];
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < num.length - 1; i++) {
			for(int j = i+1; j < num.length; j ++) {
				if(num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
			
		}
		System.out.println(num[1]);	
	}
}
