/*============================
      ���� �迭 ����
    - �迭�� ����� �ʱ�ȭ
	- �迭�� �⺻�� Ȱ��
  ============================*/

// �� ����
//    ����ڷκ��� ������ �л� ���� �Է¹ް�
//    �׸�ŭ�� ����(���� ����)�� �Է¹޾�
//    ��ü �л� ������ ��, ���, ������ ���ؼ�
//    ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �л� �� �Է� : 5
// 1�� �л��� ���� �Է� : 90
// 2�� �л��� ���� �Է� : 82
// 3�� �л��� ���� �Է� : 64
// 4�� �л��� ���� �Է� : 36
// 5�� �л��� ���� �Է� : 98


// >> �� : 370
// >> ��� : 74.0
// >> ����
// 90 : -16.0
// 82 : -8.0
// 64 : 10.0
// 36 : 38.0
// 98 : -24.0
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;

public class Test084
{
	public static void main(String[] args)
	{
		// ���� ���� �� �ʱ�ȭ
		Scanner sc = new Scanner(System.in);
		int num, sum = 0;
		double avg = 0.0;
		
		// �л� �� �Է�
		System.out.print("�л� �� �Է� : ");
		num = sc.nextInt();
		
		// �Է¹��� �л� �� ��ŭ�� �迭
		int[] score = new int[num];

		// �Է¹��� �л� �� ��ŭ �ݺ������� ���� �Է¹ޱ�
		for(int i=0; i < num; i++)
		{
			System.out.printf("%d�� �л��� ���� �Է� : ", (i+1));
			score[i] = sc.nextInt();

			// �Է¹����鼭 �ٷ� �����ս�Ű��
			sum += score[i];
		}

		// ��� ���ϱ�
		avg = sum / score.length;

		// ��� ���
		System.out.println();
		System.out.println(">> �� : " + sum);
		System.out.println(">> ��� : " + avg);
        System.out.println(">> ����");

		// ���� ����ϱ�
		// ��տ��� �л� ���� ������ �� ��
		for(int i=0; i< num; i++)
		{
			System.out.printf("%d : %.1f\n", score[i], avg - score[i]);
		}

	}
}

//���� ���

/*
�л� �� �Է� : 5
1�� �л��� ���� �Է� : 90
2�� �л��� ���� �Է� : 82
3�� �л��� ���� �Է� : 64
4�� �л��� ���� �Է� : 36
5�� �л��� ���� �Է� : 98
>> �� : 370
>> ��� : 74.0
>> ����
90 : -16.0
82 : -8.0
64 : 10.0
36 : 38.0
98 : -24.0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/