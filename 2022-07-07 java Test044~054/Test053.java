/*=============================================
    ���� ���� �帧�� ��Ʈ��(�ݺ���) ����
	 - �ݺ��� (while��) �ǽ�
  ============================================*/

// �� ����
//    ����ڷκ��� ������ ������ �Է¹޾�
//    1���� �Է¹��� �� ����������
//    ��ü �հ�, ¦���� �հ�, Ȧ���� ����
//    ���� ��������� ����ϴ� ���α׷��� �����Ѵ�.


// ���� ��)
// ������ ���� �Է� : 284
// >> 1 ~ 284 ���� ������ �� : xxxx
// >> 1 ~ 284 ���� ¦���� �� : xxxx
// >> 1 ~ 284 ���� Ȧ���� �� : xxxx
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053
{
	public static void main(String[] args) throws IOException
	{

		// ���� ���� �� �ʱ�ȭ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = 1, num, nSum, evenSum, oddSum;
		nSum = evenSum = oddSum = 0;


		// �ֿ� ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());

		while(a <= num) //1���� �Է¹��� ������ ���� ���� �ݺ�
		{
			nSum += a; // ������ �� ���ϱ�
			
			if(a % 2 == 0) // ¦���� �� ���ϱ�
			{
				evenSum += a;
			}
			else if(a % 2 != 0) // Ȧ���� �� ���ϱ�
			{
				oddSum += a;	
			}

			a++; // a�� 1�� ����
		}

		// ��� ���
		System.out.printf("1 ~ %d ���� ������ �� : %d\n", num, nSum);
		System.out.printf("1 ~ %d ���� ¦���� �� : %d\n", num, evenSum);
		System.out.printf("1 ~ %d ���� Ȧ���� �� : %d\n", num, oddSum);
	}
}

//���� ���

/*
������ ���� �Է� : 284
1 ~ 284 ���� ������ �� : 40470
1 ~ 284 ���� ¦���� �� : 20306
1 ~ 284 ���� Ȧ���� �� : 20164
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ ���� �Է� : 10
1 ~ 10 ���� ������ �� : 55
1 ~ 10 ���� ¦���� �� : 30
1 ~ 10 ���� Ȧ���� �� : 25
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/