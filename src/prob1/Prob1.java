package prob1;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int chk = 3;

		while (chk > 0) {
			System.out.print("숫자를 입력하세요: ");

			int inputNumber = scanner.nextInt();
			int sum = 0, sum1 = 0;

			for (int i = 0; i <= inputNumber; i++) {
				if (i % 2 == 0) { // 짝수
					sum += i;
				} else { // 홀수
					sum1 += i;
				}
			}
			// ---
			if (inputNumber % 2 == 0)
				System.out.println("결과 값 :" + sum);
			else
				System.out.println("결과 값 :" + sum1);
			
			chk--;
		}

		scanner.close();
	}

}
