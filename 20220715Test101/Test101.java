/*=======================================
      ���� Ŭ������ �ν��Ͻ� ����
	  - Ŭ������ �ν��Ͻ� Ȱ��
  ======================================*/

// �л����� ��������, ��������, ���������� �Է¹޾�
// ����, ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
// ����, �� �������� �迭�� ���������� Ȱ���� �� �ֵ��� �Ѵ�.
// Ŭ���� ����� ������ ���̵���ο� ���� ������ �� �ֵ��� �Ѵ�.

// [���̵����]
// ���α׷��� �����ϴ� Ŭ����
// 1. Record Ŭ����
//    - �Ӽ��� �����ϴ� Ŭ������ ������ ��~!!!

// 2. Sungjuk Ŭ����
//    - �ο� ���� �Է¹޾�, �Է¹��� �ο� �� ��ŭ
//      �̸�, ��������, ��������,  ���������� �Է¹ް�
//      ������ ����� �����ϴ� Ŭ������ ������ ��
//      ���Ӽ� : �ο���, Record Ÿ���� �迭                    (Record[] recArr;)
//      ����� : �ο��� �Է�, �� ������ �Է�, ���� �� ��� ����, ��� ���


// 3. Test101 Ŭ����
//    - main() �޼ҵ尡 �����ϴ� �ܺ� Ŭ������ ������ ��~!!!

// ���� ��)
// �ο� �� �Է�(1~100) : 102
// �ο� �� �Է�(1~100) : -10
// �ο� �� �Է�(1~100) : 3

// 1��° �л��� �̸� �Է� : �ڹڹ�
// ���� ���� : 90
// ���� ���� : 80
// ���� ���� : 70

// 2��° �л��� �̸� �Է� : ����
// ���� ���� : 92
// ���� ���� : 82
// ���� ���� : 72

// 3��° �л��� �̸� �Է� : ������
// ���� ���� : 82
// ���� ���� : 72
// ���� ���� : 62

// �ڹڹ� 90 80 70  240 80.00    2
// ���� 92 82 72  246 82.00    1
// ������ 82 72 62  216 72.00    3

// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;

class Sungjuk
{

	int su;
	Record[] recArr;

	// �ο� �� �Է�
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("�ο� �� �Է�(1~100) : ");
			su = sc.nextInt();
			
		}
		while (su < 1 || su > 100);

		recArr = new Record[su];
	}




	// ���� �Է�
	public void score()
	{
		Scanner sc = new Scanner(System.in);
		String[] strName = {"����", "����", "����"};
		
		for(int i=0; i < su; i++)
		{
			recArr[i] = new Record();
			System.out.printf("%d��° �л��� �̸� �Է� : ", (i+1));
			recArr[i].name = sc.next();
			
			for(int j=0; j < strName.length; j++)
			{
				System.out.print(strName[j] + " ���� : ");
				recArr[i].score[j] = sc.nextInt();

				recArr[i].tot += recArr[i].score[j]; // ���� �Է�
			}

			recArr[i].avg = recArr[i].tot / 3.0; //��� �Է�
		}
	}

	// score() �޼ҵ� �׽�Ʈ
	/*
		2�� for������ (0+1)��° �л� �̸� �Է� �ް� �� ��,��,�� ���� : �Է�, ���� recArr[0].tot += recArr[0].score[0]
																			                    += recArr[0].score[1]
																			         		    += recArr[0].score[2]

													�� recArr[0].avg =  recArr[0].tot / 3.0 
													    0���� ���   =   ���� ������  / 3.0
					  (1+1)��° �л� �̸� �Է� �ް� �� ��,��,�� ���� : �Է�, ���� recArr[1].tot += recArr[1].score[0]
																			                    += recArr[1].score[1]
																			         		    += recArr[1].score[2]
													�� recArr[1].avg =  recArr[1].tot / 3.0
													
					  (2+1)��° �л� �̸� �Է� �ް� �� ��,��,�� ���� : �Է�, ���� recArr[2].tot += recArr[2].score[0]
																			                    += recArr[2].score[1]
																			         		    += recArr[2].score[2]
													�� recArr[2].avg =  recArr[2].tot / 3.0
	*/


	public void rank()
	{
		for(int i = 0; i < su; i++)
		{ 
			recArr[i].rank = 1;
			for(int j = 0; j < su; j++)
			{
				if(recArr[i].avg < recArr[j].avg)
				{
					recArr[i].rank += 1;
				}
			}
		}
	}

	// rank() �޼ҵ� �׽�Ʈ
	/*
		���� ������ �Է��ؼ� ���� ����� �������
		recArr[0].avg = 80
		recArr[1].avg = 82
		recArr[2].avg = 72

		i = 0�� ��
		// recArr[0].rank = 1
		   j < su (j < 3)
		   - j = 0 �� (recArr[0].avg < recArr[0].avg) �� (80 < 80) �̶�� �� (X)
		   - j = 1 �� (recArr[0].avg < recArr[1].avg) �� (80 < 82) �̶�� �� (X)
		   - j = 2 �� (recArr[0].avg < recArr[2].avg) �� (80 < 72) �̶�� �� recArr[0].rank�� 1 ���� �� recArr[0].rank = 2;

		// recArr[1].rank = 1
		   j < su (j < 3)
		   - j = 0 �� (recArr[1].avg < recArr[0].avg) �� (82 < 80) �̶�� �� (X)
		   - j = 1 �� (recArr[1].avg < recArr[1].avg) �� (82 < 82) �̶�� �� (X)
		   - j = 2 �� (recArr[1].avg < recArr[2].avg) �� (82 < 72) �̶�� �� (X)

		// recArr[2].rank = 1
		   j < su (j < 3)
		   - j = 0 �� (recArr[2].avg < recArr[0].avg) �� (72 < 80) �̶�� �� recArr[2].rank�� 1 ���� �� recArr[2].rank = 2;
		   - j = 1 �� (recArr[2].avg < recArr[1].avg) �� (72 < 82) �̶�� �� recArr[2].rank�� 1 ���� �� recArr[2].rank = 3;
		   - j = 2 �� (recArr[2].avg < recArr[2].avg) �� (72 < 72) �̶�� �� (X)

		����������
		recArr[0].rank = 2
		recArr[1].rank = 1
		recArr[2].rank = 3
	*/



	public void print()
	{
		System.out.println(); // ����


		for(int i=0; i < su; i++)
		{
			// �̸�
			System.out.printf("%5s", recArr[i].name);

			// ����
			for(int j=0; j < 3; j++)
				System.out.printf("%4d", recArr[i].score[j]);

			// ����
			System.out.printf("%5d", recArr[i].tot);

			// ���
			System.out.printf("%8.2f", recArr[i].avg);

			// ����
			System.out.printf("%5d", recArr[i].rank);

			System.out.println(); // ����
		}
	}

}

public class Test101
{
	public static void main(String[] args)
	{
		Sungjuk sj = new Sungjuk();
		sj.input();
		sj.score();
		sj.rank();
		sj.print();

	}
}
// ���� ���
/*
�ο� �� �Է�(1~100) : 5
1��° �л��� �̸� �Է� : ��¯��
���� ���� : 87
���� ���� : 40
���� ���� : 70
2��° �л��� �̸� �Է� : ��ö��
���� ���� : 80
���� ���� : 68
���� ���� : 86
3��° �л��� �̸� �Է� : ������
���� ���� : 35
���� ���� : 66
���� ���� : 89
4��° �л��� �̸� �Է� : ������
���� ���� : 55
���� ���� : 72
���� ���� : 94
5��° �л��� �̸� �Է� : �ͱ�
���� ���� : 77
���� ���� : 88
���� ���� : 99

  ��¯��  87  40  70  197   65.67    4
  ��ö��  80  68  86  234   78.00    2
  ������  35  66  89  190   63.33    5
  ������  55  72  94  221   73.67    3
   �ͱ�  77  88  99  264   88.00    1
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/