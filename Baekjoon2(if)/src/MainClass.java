import java.util.Scanner;

public class MainClass {
//	A가 B보다 큰 경우에는 '>'를 출력한다.
//	A가 B보다 작은 경우에는 '<'를 출력한다.
//	A와 B가 같은 경우에는 '=='를 출력한다.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if(a > b) {
			System.out.println(">");
		} else if(a < b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
	}
}
