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

// ����ڷκ��� ������ ������ �Է¹޾�
// ������ ���� �Ǻ� ����� ����ϴ� ���α׷��� �����Ѵ�.

// 2�� ��� / 3�� ��� / 2�� 3�� ��� / 2�� 3�� ��� �ƴ�

// ���� ��)
// ������ ���� �Է� : 4
// 4 �� 2�� ���
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 9 
// 9 �� 3�� ���
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 12
// 12 �� 2�� 3�� ���
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 17
// 17 �� 2�� 3�� ��� �ƴ�
// ����Ϸ��� �ƹ� Ű�� ��������...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test034
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		
		// ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());


		// ��� ���
		if (n % 2 == 0 && n % 3 == 0)
		{
			System.out.printf("%d �� 2�� 3�� ���\n", n);
		}
		else if(n % 2 == 0)
		{
			System.out.printf("%d �� 2�� ���\n", n);
		}
		else if(n % 3 == 0)
		{
			System.out.printf("%d �� 3�� ���\n", n);
		}
		else if(n % 2 != 0 || n % 3 != 0)
		{
			System.out.printf("%d �� 2�� 3�� ��� �ƴ�\n", n);
		} // �̷� ���·� ���� ������ ������
		else
		{
			System.out.println(n + " �� ���� �Ұ�");
		}
		
	}
}


// ���� ���

/*
������ ���� �Է� : 20
20 �� 2�� ���
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ ���� �Է� : 17
17 �� 2�� 3�� ��� �ƴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/