/*=============================================
      ���� ���� �帧�� ��Ʈ��(���) ����
	  - switch �� �ǽ�
  ============================================*/

/*
  �� ���� ���ù��̶� �ϸ�, switch �� ������ ���� ���� ����
     ���� ������ ���� �������� �б��� �� ����ϴ� �����̴�.

  �� ���� �� ����
  	 switch(����)
	 {
		case ���1 : ���� 1; [break;]	 �� []: ������ �����ϴٶ�� �ǹ��̴�.
		case ���2 : ���� 2; [break;]
		    : 
	    [default  : ����n+1; [break;]
	 }

	 switch���� �����ġ��� case�� ���������
	 byte, short, int, long ���̾�� �Ѵ�.

	 case �� �ڿ� ��break;�� �� ���� ������ ���
	 ���� case ���� ������ ����ؼ�(�̾) �����ϰ� �ȴ�. (�� �⺻ ��)

	 ��break;���� ������ ���
	 �ش� �������������� ���� �� switch ���� ����������. (�� �Ϲ� ��)
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test041
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;				//-- �̸�
		int kor, eng, mat, tot;		//-- ����, ����, ����, ����
		double avg;					//-- ���
		char grade;					//-- ���

		System.out.print("�̸� �Է� : ");
		name = br.readLine();

		System.out.print("�������� �Է� : ");
		kor = Integer.parseInt(br.readLine());
	
		System.out.print("�������� �Է� : ");
		eng = Integer.parseInt(br.readLine());
	
		System.out.print("�������� �Է� : ");
		mat = Integer.parseInt(br.readLine());
	
		tot = kor + eng + mat;
		avg = tot / 3.0;

		if(avg >= 90)
			grade = 'A';
		else if(avg >= 80)
			grade = 'B';
		else if(avg >= 70)
			grade = 'C';
		else if(avg >= 60)
			grade = 'D';
		else
			grade='F';

		//��� ���
		System.out.println();
		System.out.printf(">> ����� �̸��� %s �Դϴ�.\n", name);
		System.out.printf(">> ������ %d, ����� %.2f �Դϴ�.\n", tot, avg);
		System.out.printf(">> ����� %c �Դϴ�.\n", grade);

	}
}


// ���� ���

/*

*/