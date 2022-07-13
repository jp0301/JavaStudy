/*============================
      ���� �迭 ����
    - �迭�� ����� �ʱ�ȭ
	- �迭�� �⺻�� Ȱ��
  ============================*/

// ����ڷκ��� �ο����� �Է¹ް�
// �Է¹��� �ο� �� ��ŭ�� �л� �̸��� ��ȭ��ȣ�� �Է¹ް�
// �̷��� �Է¹��� �����͸� �̸� �迭�� ��ȭ��ȣ �迭�� �����Ͽ�
// ����� ����� �� �ִ� ���α׷��� �����Ѵ�.

// ���� ��)
// �Է� ó���� �л� �� �Է�(��, 1~10) : 27
// �Է� ó���� �л� �� �Է�(��, 1~10) : -5
// �Է� ó���� �л� �� �Է�(��, 1~10) : 3
// �̸� ��ȭ��ȣ �Է�[1](���� ����) : ���̰� 010-1111-1111
// �̸� ��ȭ��ȣ �Է�[2](���� ����) : ������ 010-2222-2222
// �̸� ��ȭ��ȣ �Է�[3](���� ����) : �ֳ��� 010-3333-3333


import java.util.Scanner;

public class Test082
{
	public static void main(String[] args)
	{
		/* �� Ǯ�� -----------------------------------------------------
		Scanner sc = new Scanner(System.in);
		int nStu;

		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
			nStu = sc.nextInt();
		}
		while (nStu < 1 || nStu > 10);



		String[] name = new String[nStu];
		String[] call = new String[nStu];



		for(int i=0; i < nStu; i++)
		{
			System.out.print("�̸� ��ȭ��ȣ �Է�[1](���� ����) : ");
			name[i] = sc.next();
			call[i] = sc.next();
		}


		System.out.println("--------------------");
		System.out.println("��ü �л� �� : " + nStu);
		System.out.println("--------------------");
		
		for(int i=0; i < nStu; i++)
		{
			System.out.println(name[i] + " " + call[i]);
		}
		System.out.println("--------------------");
		*/





		// �Բ��� Ǯ�� -----------------------------------------------------
		
		//Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// ����ڰ� �Է��ϴ� �л� ���� ��Ƴ� ����
		int memberCount = 0;


		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
			memberCount = sc.nextInt();
		}
		while (memberCount < 1 || memberCount > 100);
		
		// �׽�Ʈ(Ȯ��)
		// System.out.println("����ڰ� �Է��� �ο� �� : " + memberCount);
		//--==>> ����ڰ� �Է��� �ο� �� : 5

		// ����ڰ� �Է��� �ο� ���� ����
		// �̸� �迭�� ��ȭ��ȣ �迭�� �����ؾ� �Ѵ�.

		// �ο� �� ��ŭ�� �̸� ���� �迭 ����
		String[] names = new String[memberCount];

		// �ο� �� ��ŭ�� ��ȭ��ȣ ���� �迭 ����
		//String[] tels = new String[memberCount];        
		String[] tels = new String[names.length];

		// �ο� �� ��ŭ�� �ȳ� �޼��� ��� 
		// for(int i=0; i < names.length; i++)
		// for(int i=0; i < tels.length; i++)
		for(int i=0; i < memberCount; i++)
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) : ", (i+1));
			names[i] = sc.next();
			tels[i] = sc.next();
		}

		// ���� ���(�̸�, ��ȭ��ȣ) ���
		System.out.println("----------------------");
		System.out.println("��ü �л� �� : " + memberCount + "��");
		// memberCount == names.length = tels.length

		System.out.println("----------------------");
		System.out.println("�̸�    ��ȭ��ȣ");
		
		// �л� ����Ʈ �ݺ� ���
		for(int i=0; i < memberCount; i++)
		{
			System.out.printf("%3s %14s\n",names[i], tels[i]);
		}
		System.out.println("----------------------");

	}
}

// ������
/*
�Է� ó���� �л� �� �Է�(��, 1~10) : 3
�̸� ��ȭ��ȣ �Է�[1](���� ����) : ��â�� 010-1111-1111
�̸� ��ȭ��ȣ �Է�[2](���� ����) : ��ȿ�� 010-2222-2222
�̸� ��ȭ��ȣ �Է�[3](���� ����) : ����� 010-3333-3333
----------------------
��ü �л� �� : 3��
----------------------
�̸�    ��ȭ��ȣ
��â��  010-1111-1111
��ȿ��  010-2222-2222
�����  010-3333-3333
----------------------
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/