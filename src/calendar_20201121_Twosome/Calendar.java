package calendar_20201121_Twosome;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		System.out.println("Hello,Calendar");
		
		//���ڸ� �Է¹޾� �ش��ϴ� ���� �ִ� �ϼ��� ����ϴ� ���α׷�
		//scanner �ڵ����� ������� ��ɾ� Ctrl+shift+m => import java.util.scanner
		// ��ĳ�� Ŭ������ �̿��Ͽ� ����ڿ��� �Է¹޴´�.

		// import java.util.Scanner; ����ó�� Ŭ������ ����Ʈ �Ͽ� ����Ѵ�.
		// 1. ��ĳ�� Ŭ���� ����
		Scanner scan = new Scanner(System.in);
		// 2. �� �Է� �޽��� ���
		System.out.println("���� �Է��ϼ���");
		// 3. ��ĳ�ʸ� ���� ����ڷκ��� �ֿܼ� �� �Է�
		int month = scan.nextInt();
		System.out.println("�Է¹��� ���� : " + month);
		scan.close();
		int[] maxDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�. \n", month, maxDays[month]);
		
		
		
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		int month = Scanner.nextInt();				// =>>>>>>>>>>> ��ĳ�� Ŭ���� �������� ȣ���Ͽ� ���
													// Scanner. �� ���´� �߸� ����� �����̴�.
		Scanner.close();
		
		int[] maxDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�. \n, month, maxDays[month]");
		1) %d��   <= ���⼭ %d�� ������ ��Ÿ���� ��ȣ�� int month �� �����Ͽ� ����ó�� �Ѱ���.
		2) %d��   <= ���������� maxDays[month] �� ����.
	 
	===> "%d���� %d�ϱ��� �ֽ��ϴ�. \n, month, maxDays[month]" �̰Ծƴ϶�
	-==> "%d���� %d�ϱ��� �ֽ��ϴ�. \n", month, maxDays[month]

		
		*/
		

	}

}
