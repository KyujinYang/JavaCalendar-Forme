package calendar_20201122_Starbucks;

import java.util.Scanner;

public class Repeatitive_while_if {
	// step3. �ݺ�Ƚ��
	// step4. �ݺ�����
	// �Լ��� ������ش�! public int maxDaysOfMonth(int month) {
	private static final int[] MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getmaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public static void main(String[] args) {

		// ���ڸ� �Է¹޾� �ش��ϴ� �޿� �ִ� �ϼ��� ����ϴ� ���α׷�

		String PROMPT = "cal> ";
		// step4. 1. PROMPT���1
		Scanner scan = new Scanner(System.in);
		Repeatitive_while_if cal = new Repeatitive_while_if();

		// step3. int repeat = scan.nextInt();

		// step3,4. Ƚ���� �� �˶��� for, Ƚ���� �� ���� ���� ���� while ����.

		int month = 3;
		// step4-1.(����)month�� ���Ϸ��ߴµ� ���� ������ �ƹ� �� (-1����) 1�� �־��־���.
		// step4. ���� ��
		while (true) {
			// step4-1.(����)while (month != -1) {
			// step3. n�� �ݺ��ϴ� �ڵ�! ������ for�� �� ���� �̷��� ���־��Ŵ�.
			// step4. for ���� while�� ��
			System.out.println("���� �Է��ϼ���");
			System.out.print(PROMPT);
			month = scan.nextInt();
			// step4. 2.PROMPT �־���
			if (month == -1) {
				break;
			}
			// step4. -1�̸� �� ���ѷ����� �������Ͷ�
			if (month > 12) {
				continue;
			}

			System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�. \n", month, cal.getmaxDaysOfMonth(month));
		}

		System.out.printf("-1�̴� Bye~");
		scan.close();
	}

	public void printCalendar(int i, int month) {
		
		
	
		
	}
}
