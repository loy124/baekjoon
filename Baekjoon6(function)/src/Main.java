
// 15596번
// 정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
public class Main {
	long sum(int[] a) {
		long s = 0;
		for (int i = 0; i < a.length; i++) {
			s = s + a[i];
		}
		return s;
	}
}
