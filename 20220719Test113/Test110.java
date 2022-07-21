/*=========================================
      ���� ����(Sort) �˰��� ����
  =========================================*/


// �� ����
//    ����ڷκ��� ���� �л��� ���� �����͸� �Է¹޾�
//    ������ ���� �л����� ���� ������ ����� �ο��Ͽ�
//    ����� ����ϴ� ���α׷��� �����Ѵ�.
//    ��, �迭�� ���� �˰����� Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է� : 5
// �̸� ���� �Է�(1, ���� ����) : ������ 90
// �̸� ���� �Է�(2, ���� ����) : ���̰� 80
// �̸� ���� �Է�(3, ���� ����) : �ֵ��� 85
// �̸� ���� �Է�(4, ���� ����) : ������ 75
// �̸� ���� �Է�(5, ���� ����) : �ڿ��� 95
/*
--------------
1�� �ڿ��� 95
2�� ������ 90
3�� �ֵ��� 85
4�� ���̰� 80
5�� ������ 75
--------------
����Ϸ��� �ƹ� Ű�� ��������...
*/


import java.util.Scanner;

public class Test110
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n;
		
		System.out.print("�ο� �� �Է�: ");
		n = sc.nextInt();

		String[] name = new String[n];
		int[] score = new int[n];
		int[] rank = new int[n];


		for(int i=0; i < n; i++)
		{
			System.out.printf("�̸� ���� �Է�(%d, ���� ����) : ", i+1);
			name[i] = sc.next();
			score[i] = sc.nextInt();
		}

		boolean flag;
		String temp;
		int pass = 0;

		do
		{
			flag = false;
			pass++;

		//	for(int i = 1; i < n; i++)
			//{
				for(int j = 0; j < n-pass; j++)
				{
					if(score[j] < score[j+1])
					{
						score[j] = score[j]^score[j+1];
						score[j+1] = score[j+1]^score[j];
						score[j] = score[j]^score[j+1];


						temp = name[j];
						name[j] = name[j+1];
						name[j+1] = temp;

						flag = true;
					}
				}
			//}


		}
		while (flag);


		// ���
		for(int i = 0; i < n; i++) 
		{
			rank[i] = 1;

			for(int j = 0; j < n; j++)
			{
				if(score[i] < score[j])
					rank[i] += 1;
			}
		}


		System.out.println("--------------");
		for(int i=0; i < n; i++)
		{
			System.out.printf("%d�� %s %3d\n", i+1, name[i], score[i]);
		}
		System.out.println("--------------");


	}
}

// ���� ���
/*
�ο� �� �Է�: 5
�̸� ���� �Է�(1, ���� ����) : ȣ���� 90
�̸� ���� �Է�(2, ���� ����) : �̱⿵ 50
�̸� ���� �Է�(3, ���� ����) : �̱�ö 87
�̸� ���� �Է�(4, ���� ����) : �밡�� 30
�̸� ���� �Է�(5, ���� ����) : ��ͱ� 79
--------------
1�� ȣ����  90
2�� �̱�ö  87
3�� ��ͱ�  79
4�� �̱⿵  50
5�� �밡��  30
--------------
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/