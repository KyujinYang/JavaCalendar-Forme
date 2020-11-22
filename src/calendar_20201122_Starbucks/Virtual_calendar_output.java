package calendar_20201122_Starbucks;


public class Virtual_calendar_output {

	// 함수를 만들어준다! public int maxDaysOfMonth(int month) {
	private static final int[] MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getmaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}
	/*
	 * 월 입력을 하면 해당 월의 달력을 출력한다. 달력 모양은 1단계에서 작성한 모양으로 만든다. 1일은 일요일로 정해도 무방하다. -1을
	 * 입력받기 전까지 반복 입력받는다. 프롬프트를 출력한다.
	 */

	public void printCalendar(int year, int month) {
		System.out.printf("	<<%4d년%3d월>>\n", year, month);
		System.out.println("SU  MO  TU  WE  TH  FR  SA");
		System.out.println("--------------------------");

		int maxDay = getmaxDaysOfMonth(month);

		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 0)
				System.out.println();

			

		}

	}
}

// ctrl / 는 주석!