 /*=============================================
      ���� ���� �帧�� ��Ʈ��(���) ����
      - if��
	  - if ~ else �� �ǽ�
   ============================================*/

// ����ڷκ��� ������ ���� 5���� �Է¹޾�
// ¦����, Ȧ���� �հ踦 ����ϴ� ���α׷��� �����Ѵ�.
// ��, Scanner�� Ȱ���Ͽ� �����͸� �Է¹��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� 5�� �Է�(���� ����) : 1 2 3 4 5

// >> ¦���� ���� 6 �̰�, Ȧ���� ���� 9 �Դϴ�.

import java.util.Scanner;


public class Test038
{
	public static void main(String[] args)
	{
		/*
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, e;
		int even = 0;
		int odd = 0;

		System.out.print("������ ���� 5�� �Է�(���� ����) : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();


		if(a % 2 == 0)
			even += a;
		else if(a % 2 != 0)
			odd += a;


		if(b % 2 == 0)
			even += b;
		else if(b % 2 != 0)
			odd += b;


		if(c % 2 == 0)
			even += c;
		else if(c % 2 != 0)
			odd += c;


		if(d % 2 == 0)
			even += d;
		else if(d % 2 != 0)
			odd += d;


		if(e % 2 == 0)
			even += e;
		else if(e % 2 != 0)
			odd += e;

		System.out.printf(">> ¦���� ���� %d �̰�, Ȧ���� ���� %d �Դϴ�.\n", even, odd);
		
		*/





		// �Բ� �ذ��� Ǯ�� --------------------------------------------------------------------
		
		/*
		import java.util.Scanner;
		*/

		// �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);

		// check ~~!!!
		// �������� ��Ƴ� ���� �ʱ�ȭ
		int evenSum = 0;							//-- ¦���� ���� ��Ƴ� ���� ����(������)
		int oddSum = 0;								//-- Ȧ���� ���� ��Ƴ� ���� ����(������)
		int num1, num2, num3, num4, num5;
		//-- ����ڷκ��� �Է¹��� �ټ� ���� ������ ��Ƴ� ���� ����
		

		// ���� �� ó��
		System.out.print("������ ���� 5�� �Է�(���� ����) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		num5 = sc.nextInt();
        
		
		if(num1 % 2 == 0)						//-- num1�� ¦���� �� �� evenSum �� num1 ��ŭ ����
			evenSum += num1;
		else									//-- num1�� Ȧ���� �� �� oddSum �� num1 ��ŭ ����
			oddSum += num1;

		if(num2 % 2 == 0)						//-- num2�� ¦���� �� �� evenSum �� num2 ��ŭ ����
			evenSum += num2;
		else									//-- num2�� Ȧ���� �� �� oddSum �� num2 ��ŭ ����
			oddSum += num2;

		if(num3 % 2 == 0)						//-- num3�� ¦���� �� �� evenSum �� num3 ��ŭ ����
			evenSum += num3;
		else									//-- num3�� Ȧ���� �� �� oddSum �� num3 ��ŭ ����
			oddSum += num3;


		if(num4 % 2 == 0)						//-- num4�� ¦���� �� �� evenSum �� num4 ��ŭ ����
			evenSum += num4;
		else									//-- num4�� Ȧ���� �� �� oddSum �� num4 ��ŭ ����
			oddSum += num4;


		if(num5 % 2 == 0)						//-- num5�� ¦���� �� �� evenSum �� num5 ��ŭ ����
			evenSum += num5;
		else									//-- num5�� Ȧ���� �� �� oddSum �� num5 ��ŭ ����
			oddSum += num5;
	

		// ��� ���
		System.out.printf("\n>> ¦���� ���� %d �̰�, Ȧ���� ���� %d �Դϴ�.\n", evenSum, oddSum);



	}
}


// ���� ���

/*
������ ���� 5�� �Է�(���� ����) : 1 2 3 4 5

>> ¦���� ���� 6 �̰�, Ȧ���� ���� 9 �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ ���� 5�� �Է�(���� ����) : 2 4 6 8 10

>> ¦���� ���� 30 �̰�, Ȧ���� ���� 0 �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ ���� 5�� �Է�(���� ����) : 1 3 5 7 9

>> ¦���� ���� 0 �̰�, Ȧ���� ���� 25 �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/