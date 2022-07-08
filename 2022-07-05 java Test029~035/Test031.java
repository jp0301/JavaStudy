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

// ����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
// ������ ���� ���·� ����ϴ� ���α׷��� �ۼ��Ѵ�.
// ����� ��� ������ �������� ó���Ѵ�.

// 90�� �̻� : A
// 80�� �̻� 90�� �̸� : B
// 70�� �̻� 80�� �̸� : C
// 60�� �̻� 70�� �̸� : D
// 60�� �̸�           : F

// ��, BufferedReader �� Ȱ���� �����͸�  �Է¹��� �� �ֵ��� �ϸ�,
// printf() �޼ҵ带 ���� ����� �� �ֵ��� �Ѵ�.

// ���� ��)
// �̸� �Է� : �ڿ���
// ���� ���� : 90
// ���� ���� : 80
// ���� ���� : 70

// >> ����� �̸��� �ڿ����Դϴ�.
// >> ���� ������ 90,
// >> ���� ������ 80,
// >> ���� ������ 70,
// >> ������ 240�̰�, ����� 80�Դϴ�.
// >> ����� B �Դϴ�.
// ����Ϸ��� �ƹ� Ű�� ��������...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test031
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strKor, strEng, strMat;
		String strName;

		// 1. ����ڷκ��� �̸��� �Է¹޴´�.
		System.out.print("�̸� �Է� : ");
		strName = br.readLine();
		
		// 2. ����ڷκ��� ����, ����, ���� ������ �Է¹޴´�.
		System.out.print("���� ���� : ");
		strKor = br.readLine();

		System.out.print("���� ���� : ");
		strEng = br.readLine();

		System.out.print("���� ���� : ");
		strMat = br.readLine();

		// 3. ���ڿ� ���·� �Է¹��� ���� ������ ���� ���·� ��ȯ�Ѵ�.
		int nKor= Integer.parseInt(strKor);
		int nEng = Integer.parseInt(strEng);
		int nMat = Integer.parseInt(strMat);

		// 4. ��� ������ ���� ������ ����� �����Ѵ�.
		int nTot = nKor + nEng + nMat;
		double fAvg = nTot / 3.0;

		// 5. ��޿� ���� ���� �˻縦 �����Ѵ�.
		char grade = 'F';

		if (fAvg >= 90)
		{
			grade = 'A';
		}
		else if (fAvg >= 80)
		{
			grade = 'B';
		}
		else if (fAvg >= 70)
		{
			grade = 'C';
		}
		else if (fAvg >= 60)
		{
			grade = 'D';
		}
		else
		{
			grade = 'F';
		}

		// 6. ���� ��� ���
		System.out.printf(">> ����� �̸��� %s�Դϴ�.%n", strName);
		System.out.printf(">> ���� ������ %s, %n", strKor);
		System.out.printf(">> ���� ������ %s, %n", strEng);
        System.out.printf(">> ���� ������ %s, %n", strMat);
		System.out.printf(">> ������ %d�̰�, ����� %.2f�Դϴ�.%n", nTot, fAvg);
		System.out.printf(">> ����� %c �Դϴ�.%n", grade);
        
	

	}
}

// ���� ���

/*
�̸� �Է� : �ڿ���
���� ���� : 90
���� ���� : 80
���� ���� : 70
>> ����� �̸��� �ڿ����Դϴ�.
>> ���� ������ 90,
>> ���� ������ 80,
>> ���� ������ 70,
>> ������ 240�̰�, ����� 80.00�Դϴ�.
>> ����� B �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/