package calendar_20201122_Starbucks;

import java.util.Scanner;

public class Repeatitive_while_if {
	// step3. 반복횟수
	// step4. 반복조건
	// 함수를 만들어준다! public int maxDaysOfMonth(int month) {
	private static final int[] MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getmaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public static void main(String[] args) {

		// 숫자를 입력받아 해당하는 달에 최대 일수를 출력하는 프로그램

		String PROMPT = "cal> ";
		// step4. 1. PROMPT사용1
		Scanner scan = new Scanner(System.in);
		Repeatitive_while_if cal = new Repeatitive_while_if();

		// step3. int repeat = scan.nextInt();

		// step3,4. 횟수를 잘 알때는 for, 횟수를 잘 알지 못할 때는 while 쓴다.

		int month = 3;
		// step4-1.(기존)month를 비교하려했는데 값이 없으니 아무 값 (-1제외) 1을 넣어주었다.
		// step4. 에러 후
		while (true) {
			// step4-1.(기존)while (month != -1) {
			// step3. n번 반복하는 코드! 앞으로 for문 쓸 경우는 이렇게 자주쓸거다.
			// step4. for 말고 while문 이
			System.out.println("달을 입력하세요");
			System.out.print(PROMPT);
			month = scan.nextInt();
			// step4. 2.PROMPT 넣어줌
			if (month == -1) {
				break;
			}
			// step4. -1이면 이 무한루프를 빠져나와라
			if (month > 12) {
				continue;
			}

			System.out.printf("%d월은 %d일까지 있습니다. \n", month, cal.getmaxDaysOfMonth(month));
		}

		System.out.printf("-1이니 Bye~");
		scan.close();
	}

	public void printCalendar(int i, int month) {
		
		
	
		
	}
}
