package strikeGame;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] q = new int[3];

		while (true) { // 난수배열 설정
			for (int i = 0; i < q.length; i++) {
				int r = (int) (Math.random() * 10);
				q[i] = r;
			}
			if (q[0] != q[1] && q[1] != q[2] && q[2] != q[0]) {
				break; // 중복 방지
			}
		}

      for (int i = 0; i < q.length; i++) {
         System.out.print(q[i] + " "); // 난수 출력
      }
      System.out.println();

		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		int s = 0; // 스트라이크 변수 선언
		int b = 0; // 볼 변수 선언

		while (true) {
			System.out.printf("숫자를 입력하세요.>");

			for (int i = 0; i < a.length; i++) { // 정답 입력
				a[i] = sc.nextInt();
			}

			if (q[0] == a[0]) { // 스트라이크 카운트
				s = s + 1;
			}
			if (q[1] == a[1]) {
				s = s + 1;
			}
			if (q[2] == a[2]) {
				s = s + 1;
			}

			if (a[0] == q[1] || a[0] == q[2]) { // 볼 카운트
				b = b + 1;
			}
			if (a[1] == q[0] || a[1] == q[2]) {
				b = b + 1;
			}
			if (a[2] == q[0] || a[2] == q[1]) {
				b = b + 1;
			}

			if (s == 3) { // 결과 입력
				System.out.print("정답입니다. 게임을 종료합니다.");
				break;
			} else if (s != 0 && b != 0) {
				System.out.printf("%d Strike %d Ball !!\n", s, b);
			} else if (s != 0 && b == 0) {
				System.out.printf("%d Strike !!\n", s);
			} else if (s == 0 && b != 0) {
				System.out.printf("%d Ball !!\n", b);
			} else if (s == 0 && b == 0) {
				System.out.printf("Out !!\n");
			}

			s = 0; // 스트라이크 카운트 초기화
			b = 0; // 볼 카운트 초기화
		}
		sc.close();
	}
}