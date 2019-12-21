import java.util.Scanner;

//어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
//
//입력
//첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
//
//출력
//첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.

//2자리 이하느 모든 값은 한수, 

public class Main2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int result = 0;
		for (int i = input; i > 0; i--) {
			String strInput = i + "";
			if(strInput.length() <= 2) {
				result+=1;
			}else {
				int num1 = strInput.charAt(1) - strInput.charAt(0);
				int num2 = strInput.charAt(2) - strInput.charAt(1);
				if(num1 == num2) {
					result+=1;
				}
			}
		}
		System.out.println(result);
		scanner.close();
	}
}
