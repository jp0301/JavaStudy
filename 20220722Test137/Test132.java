/*==============================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
  - Wrapper Ŭ����
===============================================*/

import java.math.BigInteger;

public class Test132
{
	public static void main(String[] args)
	{
		// �Ұ���
		//int a1 = 123456789123456789;
		//System.out.println(a1);
		
		// �Ұ���
		//long b1 = 123456789123456789;
		//System.out.println(b1);
		
		// ����
		//long c1 = 123456789123456789L;
		//System.out.println(c1);

		// �Ұ���
		//long d1 = 123456789123456789123456789L;
		//System.out.println(d1);

		BigInteger a = new BigInteger("12345789123546789");
		BigInteger b = new BigInteger("12345789123546789");

		//BigInteger c = a + b;
		//System.out.println(c);
		

		// ���ϱ�
		BigInteger c = a.add(b);
		System.out.println("���� ��� : " + c);
		//--==>> ���� ��� : 24691578247093578

		// ����
		BigInteger d = a.subtract(b);
		System.out.println("���� ��� : " + d);
		//--==>> ���� ��� : 0

		// ���ϱ�
		BigInteger e = a.multiply(b);
		System.out.println("���� ��� : " + e);
		//--==>> ���� ��� : 152418509083086192506851072210521

		// ������
		BigInteger f = a.divide(b);
		System.out.println("������ ��� : " + f);
		//--==>> ���� ��� : 1


		// ������
		BigInteger g = new BigInteger("2");
		System.out.println("2�� 3�� : " + g.pow(3));
		//--==>> 2�� 3�� : 8


	}
}

// ���� ���
/*
���� ��� : 24691578247093578
���� ��� : 0
���� ��� : 152418509083086192506851072210521
������ ��� : 1
2�� 3�� : 8
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/