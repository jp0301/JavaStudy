 /*=============================================
      ���� ���� �帧�� ��Ʈ��(���) ����
      - if��
	  - if ~ else �� �ǽ�
   ============================================*/

// 1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ����
//	  �б� ������ ���ϱ� ���� ����ϴ� �������
//    if ��, if ~ else ��, ���� ������, ���� if��(if�� ��ø)
//    , switch ���� �ִ�.

// 2. if���� if ������ ������ ���� ���
//    Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.

// Ȧ��, ¦�� �� ���� if ����

// Ȧ��, ¦��, �� �� if �� ��ø

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;

		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());
		
		/*
		if(n != 0)
		{
			if(n % 2 == 0)
			{
				System.out.printf(">> %d��(��) ¦���Դϴ�.\n", n);
			}

			if (n % 2 == 1)
			{
				System.out.printf(">> %d��(��) Ȧ���Դϴ�.\n", n);
			}
		
		}
		else 
		{
			System.out.printf(">> %d��(��) ���Դϴ�.\n", n);
		}
		*/

		/*
		if(n == 0)
		{
			System.out.printf(">> %d��(��) ���Դϴ�.\n", n);
		}
		else if(n%2 == 0)
		{
			System.out.printf(">> %d��(��) ¦���Դϴ�.\n", n);

		}
		else
		{
			System.out.printf(">> %d��(��) Ȧ���Դϴ�.\n", n);
		}
		*/

		/*
		if(n % 2 != 0)
		{
			System.out.printf(">> %d��(��) Ȧ���Դϴ�.\n", n);
		}
		else if(n == 0)
		{
			System.out.printf(">> %d��(��) ���Դϴ�.\n", n);

		}
		else if(n % 2 == 0)
		{
			System.out.printf(">> %d��(��) ¦���Դϴ�.\n", n);
		}
		*/

		String result = "���� �Ұ�";
		
		if(n==0)
		{
			result = "��";
		}
		else if (n %2 ==0)
		{	
			result = "¦��";
		}
		else if (n%2!=0)
		{
			result = "Ȧ��";
		}
		//else
		//{
		//	result = "���� �Ұ�";
		//}

		System.out.println( n + " �� " + result);


	}
}