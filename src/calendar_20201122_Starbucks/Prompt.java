//step6. PROMPT �̿� ���Ѱ� ����~ ��ٲ�\n, ����

package calendar_20201122_Starbucks;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";
	// �빮�ڴ� ���� ������� ��!! PROMPT(����ȵǴ°� private final)

	public void runPrompt() {
		Scanner scan = new Scanner(System.in);
		// Repeatitive_while_if cal = new Repeatitive_while_if();
		Virtual_calendar_output cal = new Virtual_calendar_output();

		int year = 5;
		int month = 3;

		// step6. �⵵�� �Էµǰ� ���!
		while (true) {
			System.out.println("\n�⵵�� �Է��ϼ���");
			System.out.print("YEAR>  ");
			
			year = scan.nextInt();
			System.out.println("���� �Է��ϼ���");
			System.out.print("MONTH>  ");
			month = scan.nextInt() ;

			
			// -1 �̸� ������ ������Ű�� �޽����� ����Ѵ�.
			if (month == -1) {
				System.out.printf("�̸� �����ڽ��ϴ�~������");
				
				break;
			}
			// step4. -1�̸� �� ���ѷ����� �������Ͷ�
			if (month > 12) {
				continue;
			}

			cal.printCalendar(year, month);

		}

		scan.close();
	}

	public static void main(String[] args) {

		// �� ����
		Prompt P = new Prompt();
		P.runPrompt();

	}
}
