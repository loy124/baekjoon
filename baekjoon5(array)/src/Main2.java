import java.util.Scanner;

public class Main2 {
//	2920번
//	다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. c는 1로, d는 2로, ..., C를 8로 바꾼다.
//
//	1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.
//
//	연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에 8개 숫자가 주어진다. 이 숫자는 문제 설명에서 설명한 음이며, 1부터 8까지 숫자가 한 번씩 등장한다.
//
//	출력
//	첫째 줄에 ascending, descending, mixed 중 하나를 출력한다.
//
//	예제 입력 1 
//	1 2 3 4 5 6 7 8
//	예제 출력 1 
//	ascending
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 8;
		int numArray[] = new int[number];
		int ascending[] = new int[number];
		int descending[] = new int[number];
		
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = scanner.nextInt();
			ascending[i] = numArray[i];
			descending[i] = numArray[i];
		}
		
		int temp = 0;
		for (int i = 0; i < numArray.length - 1; i++) {
			for (int j = i + 1; j < numArray.length; j++) {
				if(numArray[i] > numArray[j]) {
					temp = ascending[i];
					ascending[i] = ascending[j];
					ascending[j] = temp;
				} 
				if (numArray[i] < numArray[j]) {
					temp = descending[i];
					descending[i] = descending[j];
					descending[j] = temp;
				} 
			}
		}
		String str = "";
		for (int i = 0; i < numArray.length; i++) {
			if(numArray[i] == ascending[i]) {
				str = "ascending";
			} else if(numArray[i] == descending[i]) {
				str = "descending";
			} else {
				str = "mixed";
			}
		}
		System.out.println(str);
		scanner.close();
		
	}
}















