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

// ����ڷκ��� ������ ������ �� ���� �Է¹޾Ƽ�
// ���� ������ ū �� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 753
// �� ��° ���� �Է� : 42
// �� ��° ���� �Է� : 127

// >> ���� ��� : 42 127 753
// ����Ϸ��� �ƹ� Ű�� ��������...


/*
	8   20   75
	------
	---      ---
	    --------
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test037
{
	public static void main(String[] args) throws IOException
	{

		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n1, n2, n3, temp;

		System.out.print("ù ��° ���� �Է� : ");
		n1 = Integer.parseInt(br.readLine());
		
		
		System.out.print("�� ��° ���� �Է� : ");
		n2 = Integer.parseInt(br.readLine());

		
		System.out.print("�� ��° ���� �Է� : ");
		n3 = Integer.parseInt(br.readLine());

		if(n1 > n2) 
		{
			temp = n1;
			n1 = n2; 
			n2 = temp;  

		}
		
		if(n1 > n3)
		{
			temp = n1;
			n1 = n3; 
			n3 = temp;  
		}


		if(n2 > n3)
		{
			temp = n2;
			n2 = n3; 
			n3 = temp;  
		}

		
		System.out.printf("%d %d %d\n", n1, n2, n3); 

		*/




		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, c;	 //-- ����ڰ� �Է��ϴ� ������ ����
		
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("�� ��° ���� �Է� : ");
		c = Integer.parseInt(br.readLine());
		


		// �� ù ��° ���� vs �� ��° ���� ũ�� ��
		//    �� ù ��° ������ �� ��° �������� Ŭ ��� ... �ڸ� �ٲ�

		// �� ù ��° ���� vs �� ��° ���� ũ�� ��
		//    �� ù ��° ������ �� ��° �������� Ŭ ��� ... �ڸ� �ٲ�

		// �� �� ��° ���� vs �� ��° ���� ũ�� ��
		//    �� �� ��° ������ �� ��° �������� Ŭ ��� ... �ڸ� �ٲ�

		if(a > b)
		{
			a = a^b;
			b = b^a;
			a = a^b;
		}

		
		if(a > c)
		{
			a = a^c;
			c = c^a;
			a = a^c;
		}

		if(b > c)
		{
			b = b^c;
			c = c^b;
			b = b^c;
		}

	

		System.out.printf("\n>> ���� ��� : %d %d %d\n", a, b, c); 
		
	}
}

//���� ���

/*
ù ��° ���� �Է� : 23
�� ��° ���� �Է� : 45
�� ��° ���� �Է� : 7
7 23 45
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
ù ��° ���� �Է� : 20
�� ��° ���� �Է� : 3
�� ��° ���� �Է� : 3
3 3 20
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/