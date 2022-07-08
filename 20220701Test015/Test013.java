/*============================================
  ���� �ڹ� �⺻ ���α׷��� ����
  - ������ �ڷ���
  - �ڹ� �⺻ ����� : BufferedReader Ŭ����
=============================================*/

// �� ����
//    �ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾�
//    �� �ﰢ���� ���̸� ���ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �� �ﰢ�� ���� ���ϴ� ���α׷� ��
//  - �ﰢ���� �غ� �Է� : 
//  - �ﰢ���� ���� �Է� :

// >> �غ��� 3, ���̰� 5�� �ﰢ���� ���� : xxxx
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� ���� �ν� �� �м�
//    �ﰢ���� ���� = �غ� * ���� / 2
//    ����ڷκ��� �����͸� �Է¹޾� ó�� �� BufferedReader Ȱ��
//    BufferedReader �� ���� �� ���? �� �� ���?



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args) throws IOException
	{
		

		// �� Ǯ�� ---------------------------------------------------------------------------
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		// �ֿ� ���� ����
		int a, b;
		double area;



		// ���� �� ó��
		System.out.print("�ﰢ���� �غ� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�ﰢ���� ���� �Է� : ");
        b = Integer.parseInt(br.readLine());

		area = (double) a * b / 2;



		// ��� ���
		System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.2f%n", a, b, area);
		*/



		// �Բ��� Ǯ�� -----------------------------------------------------------------------

		// �ֿ� ���� ����

		//BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �غ� ���� ����
		int underLength, height;			//-- �غ��� ����
		double area;						//-- ����			check~!!!
		
		

		// ���� �� ó��
		// �� ����ڿ��� �ȳ� �޼��� ���
		System.out.println("�� �ﰢ�� ���� ���ϴ�  ���α׷� ��");
		System.out.print("- �ﰢ���� �غ� �Է� : ");
		
		// �� ����ڰ� �Է��� ������(���ڿ�)�� ���� ���·� ��ȯ�� ��
		//    ���� underLength�� ��Ƴ���
		underLength = Integer.parseInt(br.readLine());
		
		// �� �ٽ� ����ڿ��� �ȳ� �޼��� ���
		System.out.print("- �ﰢ���� ���� �Է� : ");
        
		// �� ����ڰ� �Է��� ������(���ڿ�)�� ���� ���·� ��ȯ�� ��
		//    ���� height�� ��Ƴ���
		height = Integer.parseInt(br.readLine());

		
		// �� �ﰢ���� ���� ���ϴ� ���� ó��
		//    �ﰢ���� ���� = �غ� * ���� / 2
		//area = underLength * height / 2;
		//                 ������     ������ / ������ �� ���� ��� ����
		//												 (��, ���� ���ϰ� �������� ����)
		area = underLength * height / 2.0;				//check~!!!
		//                 ������     ������ / �Ǽ��� �� �Ǽ� ��� ����

		// �� �Ǽ� �ڷ����� ��������� ������ ��������
		// �Ǽ� ����� ������ �ʿ��� ��Ȳ�̴�.
		// ������ ��2���� �ƴ�, �Ǽ������� ��2.0������ ������ ������ �����ϰ� �Ǹ�
		// �� ������ �Ǽ� ������� ó���ȴ�.


		// area = (double)(underLength * height / 2);		//--(X)
		// area = (double)underLength * height / 2;			//--(O)
		// area = underLength * (double)height / 2;			//--(O)
		// area = (double)(underLength * height) / 2;		//--(O)

		// ��� ���
		System.out.println();	// ����
		//System.out.print();	//-- ���� �߻�(������ ����)

		System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.2f%n", underLength, height, area);
		
		
		
	}
}

// ���� ���

/*
�� �ﰢ�� ���� ���ϴ�  ���α׷� ��
- �ﰢ���� �غ� �Է� : 3
- �ﰢ���� ���� �Է� : 5

>> �غ��� 3, ���̰� 5�� �ﰢ���� ���� : 7.50
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/