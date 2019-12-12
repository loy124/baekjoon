import java.util.Scanner;

public class Main7 {
//	대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
//	4344번
//	입력
//	첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
//
//	둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
//
//	출력
//	각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
//
//	예제 입력 1 
//	5
//	5 50 50 70 80 100
//	7 100 95 90 80 70 60 50
//	3 70 90 80
//	3 70 90 81
//	9 100 99 98 97 96 95 94 93 91
//	예제 출력 1 
//	40.000%
//	57.143%
//	33.333%
//	66.667%
//	55.556%
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int numArray[];
		int sum = 0;
		double avg = 0;
		double percent = 0;
		int person = 0;
		for (int i = 0; i < number; i++) {
			person = 0;
			percent = 0;
			sum = 0;
			int choice = scanner.nextInt();
			numArray= new int[choice];
			for (int j = 0; j < choice; j++) {
				numArray[j] = scanner.nextInt();
				sum = sum + numArray[j]; 
			}
			avg = sum/choice;
			for (int j = 0; j < choice; j++) {
				if(avg <= numArray[j]) {
					person++;
				}
			}
			percent = (double)person/choice * 100;
			System.out.println(Math.round(percent *1000)/1000.0 +"%");
			
		}
		scanner.close();
	}
}












