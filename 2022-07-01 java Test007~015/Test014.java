/*============================================
  ���� �ڹ� �⺻ ���α׷��� ����
  - ������ �ڷ���
  - �ڹ� �⺻ ����� : BufferedReader Ŭ����
=============================================*/

// ����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
// �̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.


// ���� ��)
// �̸��� �Է��ϼ��� : �ڿ���
// ���� ���� �Է� : 90
// ���� ���� �Է� : 80
// ���� ���� �Է� : 70


// =====[���]=====
// �̸� : �ڿ���
// ���� : 240
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� ���� �ν� �� �м�
//    
//
//

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test014
{
	public static void main(String[] args) throws IOException
	{
		// �� Ǯ�� -----------------------------------------------------------------

		/*
		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;
		int korean, english, math, total;


		// ���� �� ó��
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = br.readLine();

		System.out.print("���� ���� �Է� : ");
		korean = Integer.parseInt(br.readLine());

		System.out.print("���� ���� �Է� : ");
		english = Integer.parseInt(br.readLine());
		
		System.out.print("���� ���� �Է� : ");
		math = Integer.parseInt(br.readLine());

		total = korean + english + math;

		// ��� ���
		System.out.println();
		System.out.println("=====[���]=====");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + total);
		*/



		// �Բ��� Ǯ�� -------------------------------------------------------------
		
		// BufferedReader �ν��Ͻ� ����
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		// InputStreamReader isr = new InputStreamReader(System.in);
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �ֿ� ���� ����
		String strName;         //-- �̸� ����
		int nKor, nEng, nMat;	//-- ����, ����, ���� ���� ����
		int nTot;				//-- ���� ����
		
		String strTemp;			//-- ���ڿ� �ӽ� ���� ����

		// ���� �� ó��
		// - ����ڿ��� �ȳ� �޼��� ���(�̸� �Է� �ȳ�)
		System.out.print("�̸��� �Է��ϼ��� : ");

		// - ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		// - IOExceotion�� ���۸��������� �ϳ��� ��Ű������ ����°� �ƴϴ�. ��� �������ߵǴµ�
		// - br.readLine() ������ IOException�� ����ϰ� �Ǵ� ���̴�.

		strName = br.readLine();

		// - ����ڿ��� �ȳ� �޼��� ���(�������� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");
		// - ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strTemp = br.readLine();
		// - ��Ƴ� �����͸� ��ȯ�� �� �ʿ��� ������ �ٽ� ���
		nKor = Integer.parseInt(strTemp);



		// - ����ڿ��� �ȳ� �޼��� ���(�������� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");
		// - ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strTemp = br.readLine();
		// - ��Ƴ� �����͸� ��ȯ�� �� �ʿ��� ������ �ٽ� ���
		nEng = Integer.parseInt(strTemp);
		


		// - ����ڿ��� �ȳ� �޼��� ���(�������� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");
		// - ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strTemp = br.readLine();
		// - ��Ƴ� �����͸� ��ȯ�� �� �ʿ��� ������ �ٽ� ���
		nMat = Integer.parseInt(strTemp);

		// - �� ���� ������ ����ִ� ������(����ڰ� �Է��� ������)����
		//   �����Ͽ� ������ �����ϰ� �� ����� ���� ������ ��Ƴ���
		nTot = nKor + nEng + nMat;
		

		// ��� ���
		System.out.println("\n=====[���]=====");
		//System.out.println("�̸� : " + strName);
		System.out.printf("�̸� : %s\n", strName);
		
		//System.out.println("���� : " + nTot);
		System.out.println("���� : %d\n", nTot);


	
	}

}

// ���� ���

/*
�̸��� �Է��ϼ��� : �ڿ���
���� ���� �Է� : 90
���� ���� �Է� : 80
���� ���� �Է� : 70

=====[���]=====
�̸� : �ڿ���
���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/