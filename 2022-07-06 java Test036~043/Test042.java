/*=============================================
      ���� ���� �帧�� ��Ʈ��(���) ����
	  - switch �� �ǽ�
  ============================================*/

  // ����ڷκ��� 1���� 3������ ���� �� �ϳ��� �Է¹޾�
  // �Է¹��� ������ŭ�� ������(��)�� ��µǴ� ���α׷��� �ۼ��Ѵ�.
  // ��, �� ���� ������� ������ �� �ֵ��� �Ѵ�.

  // �� switch ���� �Ϲ� ���� ����Ͽ� �����Ѵ�.
  // �� switch ���� �⺻ ���� ����ϵ�,
  //    ��break���� �� �� ���� ����� �� �ֵ��� �����Ѵ�.

  // ���� ��)
  // ������ ���� �Է�(1~3) : 3
  // �ڡڡ�
  // ����Ϸ��� �ƹ� Ű��...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test042
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;

		System.out.print("������ ���� �Է�(1~3) : ");
		num = Integer.parseInt(br.readLine());

		/*
		// �� switch �Ϲ� ��
		switch(num)
		{
			case 3 :
				System.out.println("�ڡڡ�"); break;
			case 2 :
				System.out.println("�ڡ�"); break;
			case 1 :
				System.out.println("��"); break;
			default : 
				System.out.println("�Է¿���~!!!");
		}
		*/

		// �� switch �⺻ �� - break �� �� ���� ����
		switch(num)
		{
			case 3 : System.out.printf("��"); 
			case 2 : System.out.printf("��");
			case 1 : System.out.printf("��\n"); break;
			default : System.out.println("�Է¿���~!!!"); 
		}
	}
}