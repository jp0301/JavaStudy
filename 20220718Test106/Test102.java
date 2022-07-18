/*=======================================
      ���� Ŭ������ �ν��Ͻ� ����
	  - Ŭ������ �ν��Ͻ� Ȱ��
  ======================================*/

// 1 ~ 3 ������ ������ �߻����Ѽ�
// ����, ����, �� ���� ���α׷��� �����Ѵ�.
// ��, Ŭ������ ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ����, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ���������� RpsGame Ŭ������ �ϼ��� �� �ֵ��� �Ѵ�.

// �� ���� ������ �� 1: ����, 2: ����, 3: ��

// ���� ��)
// 1: ����, 2: ����, 3:�� �� �Է�(1~3) : 4
// 1: ����, 2: ����, 3:�� �� �Է�(1~3) : 4
// 1: ����, 2: ����, 3:�� �� �Է�(1~3) : 4

// - ����   : ����
// - ��ǻ�� : ��

// >> �º� ���� ��� : ��ǻ�Ͱ� �̰���ϴ�~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...


import java.util.Random;
import java.util.Scanner;


class RpsGame
{
	private int user;
	private int computer;


	// ��ǻ�� 1~3 ���� �߻� �޼ҵ�
	public void randomNum()
	{
		Random rd = new Random();
		computer = rd.nextInt(3)+1; // 0 1 2 �� +1 �� 1 2 3
	}


	// �Է� �޼ҵ�
	public void input()
	{
		// ������ ���������� �ϱ� ����... ��ǻ��(������) ���� ����������
		randomNum();

		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1: ����, 2: ����, 3: �� �� �Է�(1~3) : ");
			user = sc.nextInt();
		}
		while (user < 1 || user > 3);
	}



	// �߰� ��� ���
	public void middleCalc()
	{
		String[] str = {"����", "����", "��"};

		System.out.println();
		System.out.println(" - ����   : " + str[user-1]);
		System.out.println(" - ��ǻ�� : " + str[computer-1]);
		System.out.println();
	}


	// �ºο� ���� ���� ��� ����
	public String resultCalc()
	{
		String result = "���º� �Դϴ�~!!!";
		
		// ������ �̱�� ��Ȳ
		// ����=="����" && ��=="��"   || ���� =="����" && ��=="����" || ����=="��" && ��=="����"
		if(user == 1 && computer == 3 || user == 2 && computer == 1 || user == 3 && computer == 2)
			result = "������ �̰���ϴ�~!!!";

		// ��ǻ�Ͱ� �̱�� ��Ȳ
		// ���� && ���� || ���� && �� || �� && ����
		else if(user == 1 && computer == 2 || user == 2 && computer == 3 || user == 3 && computer == 1)
			result = "��ǻ�Ͱ� �̰���ϴ�~!!!";

		return result;
	}

	// ��� ��� �޼ҵ�
	public void print(String str)
	{
		System.out.println(">> �º� ���� ��� : " + str);
	}
}

public class Test102
{
	public static void main(String[] args)
	{
		RpsGame ob = new RpsGame();

		ob.randomNum();
		ob.input();
		ob.middleCalc();

		String result = ob.resultCalc();

		ob.print(result);
	}
}



// ���� ���
/*
1: ����, 2: ����, 3: �� �� �Է�(1~3) : 4
1: ����, 2: ����, 3: �� �� �Է�(1~3) : -2
1: ����, 2: ����, 3: �� �� �Է�(1~3) : 2

 - ����   : ����
 - ��ǻ�� : ����

>> �º� ���� ��� : ������ �̰���ϴ�~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/


/*
1: ����, 2: ����, 3: �� �� �Է�(1~3) : 2

 - ���� : ����
 - ��ǻ�� : ��

>> �º� ���� ��� : ��ǻ�Ͱ� �̰���ϴ�~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/


/*
1: ����, 2: ����, 3: �� �� �Է�(1~3) : 3

 - ���� : ��
 - ��ǻ�� : ��

>> �º� ���� ��� : ���º� �Դϴ�~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/




