package calendar_20201122_Starbucks;

public class Virtual_calendar_output {

	// �Լ��� ������ش�! public int maxDaysOfMonth(int month) {
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			return true;
		else
			return false;
	}

	public int getmaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1];
		} else {
			return MAX_DAYS[month - 1];
		}
	}

	/*
	 * - �� �Է��� �ϸ� �ش� ���� �޷��� ����Ѵ�. 
	 * - �޷� ����� 1�ܰ迡�� �ۼ��� ������� �����. 
	 * - 1���� �Ͽ��Ϸ� ���ص� �����ϴ�. 
	 * - -1�� �Է¹ޱ� ������ �ݺ� �Է¹޴´�. 
	 * - ������Ʈ�� ����Ѵ�.
	 */

	public void printCalendar(int year, int month) {
		System.out.printf("	<<%4d��%3d��>>\n", year, month);
		System.out.println("SU  MO  TU  WE  TH  FR  SA");
		System.out.println("--------------------------");

		int maxDay = getmaxDaysOfMonth(year, month);

		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 0)
				System.out.println();

		}

	}
}

// ctrl / �� �ּ�!