/*=============================================
    ���� ���� �帧�� ��Ʈ��(�ݺ���) ����
	 - �ݺ��� (while��) �ǽ�
  ============================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �Ҽ����� �ƴ����� �Ǻ��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// �� �Ҽ� : 1 �Ǵ� �ڱ� �ڽ��� �� �̿ܿ� � ���ε�
//	         ������ �������� �ʴ� ��
//			 ��, 1�� �Ҽ��� �ƴϴ�.

// ���� ��)
// ������ ���� �Է� : 10
// 10 �� �Ҽ� �ƴ�
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 11
// 11 �� �Ҽ�
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test051
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		int a;
		int n = 1;

		String result = "���Է�";

		System.out.print("������ ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		while(n <= a) // n�� 1���� 1�� �����ϸ鼭 �Է¹��� a �� ���� �ݺ��Ѵ�.
		{
			n++;	   // n�� 2���� ����

			if(a == 1) // a�� 1�� �Է¹��� ��, 1�� �Ҽ��� �ƴ� ��
			{
				result = "1�� �Ҽ��� �ƴϴ�.";
				break;
			}
			
			if(a == n) // n�� a�� ������ �� �� '�Ҽ�' �� break�� Ż��
			{		   // �ڱ� �ڽ�...
				result = "�Ҽ�";
				break;
			}

			if(a % n == 0) // a�� n�� �����ϸ鼭 �������� ���� ���� ���� �����
			{			   // �Ҽ����� �Ǵ��ϰ� '�Ҽ��ƴ�' �� break�� Ż��
				result = "�Ҽ��ƴ�";
				break;
			}
		}
	
		
		//��� ���
		System.out.println(a + " �� " + result);
		*/


		/* ������ �� -------------------------------------------------------------

		int i, n=1, count=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ ���� �Է� : ");
		i = Integer.parseInt(br.readLine());
		
		while(n<=i)
		{
			
			if(i % n == 0)
			count++;

			n++;
		}

		if (count == 2)
		System.out.printf("%d -> �Ҽ�%n",i);
		else
		System.out.printf("%d -> �Ҽ��ƴ�%n",i);
		*/


		/* ������ �� -------------------------------------------------------------
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0, n = 2, result = 0;

		System.out.printf("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());

		while(n < num)
		{
			if((num % n) == 0 )
			{
				result = 1;
				break;	
			}
			n++;
		}

		if(result == 1)
		{ 
			System.out.printf("%d -> �Ҽ��ƴ�\n",num);
		}
		else
		{
			System.out.printf("%d -> �Ҽ�\n",num);
		}

		*/


		// �Բ��� Ǯ�� -----------------------------------------------------------
		//�ֿ� ���� ���� �� �ʱ�ȭ
		int num;					//-- ������� �Է� ���� ���� ����
		int n = 2;					//-- �Է� ���� ������� ������ ������ ������ ����
									//   2���� �����ؼ� 1�� ����
									//   ex) �Է°� 27 �� n:2 3 4 5 6 7 8 ... 26

		// ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());

		// � ���� �Է¹��� �������� �� �� ������
		// �� �Է� ���� �Ҽ���� �����Ѵ�.
		//String result = "�Ҽ�";
		boolean flag = true;		// num(����� �Է°�)�� �Ҽ��� ���̴�~!!!

		while(n<num)
		{

			// �׽�Ʈ
			//System.out.println("�ݺ��� ����");

			// Ȯ�� ����
			//-- n���� num�� ������ ���������� Ȯ��
			if (num % n == 0) // ��, ������ �������� ��Ȳ
			{
				flag = false;
				break;		  //-- ����� (+ �׸��� ����������.)
							  //   �� break �� ���δ� ���� ����� �ݺ���
			}

			n++;

		}
		

		// ��� ��� ( ��� ���� �����ؾ� �� �߰� Ȯ�� �� 1���� �ƴ����� ���� �߰� ����)
		if (flag && num != 1) // true�̰� num�� 1�� �ƴϸ� �Ҽ��̴�.
		{
			System.out.printf("%d�� �Ҽ�\n", num);
		}		
		else
		{
			System.out.printf("%d �� �Ҽ� �ƴ�\n", num);
		}
		
	}
}

// ���� ���

/*
������ ���� �Է� : 10
10 �� �Ҽ��ƴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/


/*
������ ���� �Է� : 83
83 �� �Ҽ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ ���� �Է� : 1
1 �� �Ҽ� �ƴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/