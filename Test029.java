 /*====================================
      ���� ������(Operator) ����
      - ���� ������ == ���� ������
   ====================================*/

// ����ڷκ��� ������ ���� �ϳ��� �Է¹޾Ƽ�
// �빮���̸� �ҹ��ڷ�, �ҹ����̸� �빮�ڷ�
// ���ĺ��� �ƴ� ��Ÿ �����̸� �� ���� �״�� ����ϴ�
// ���α׷��� �����Ѵ�.

// ���� ��)
// �� ���� �Է� : A
// A �� a
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� ���� �Է� : b
// b �� B
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� ���� �Է� : 7
// 7 �� 7
// ����Ϸ��� �ƹ� Ű�� ��������...

/*

ch

���ĺ��빮�� ? ���ĺ��ҹ��ڷκ�ȯ : (���ĺ��ҹ��� ? ���ĺ��빮�ڷκ�ȯ : �ִ±״�� );

result

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test029
{
	public static void main(String[] args) throws IOException
	{

		// �� �ذ�Ǯ�� -------------------------------------------------------------------------------------------------------
		
		/*
		char ch;
		char numResult;

		System.out.print("�� ���� �Է� : ");
		ch = System.in.read();
		
		numResult = ((ch >= 65) && (ch <= 90)) ? (char)(ch + 32) : ((ch >= 97) && (ch <=122)) ? (char)(ch - 32) : (char)ch;
		
		System.out.printf("%c ��%c\n", ch, numResult);
		*/


		// �Բ��� Ǯ�� -------------------------------------------------------------------------------------------------------
		
		/*
		char temp;

		System.out.print("�� ���� �Է�: ");
		temp = (char)System.in.read();

		//System.out.println("�Է¹��� �� Ȯ�� : " + temp);

		//�빮��? �빮�ھƴ�?
		
		String result = temp >= 65 && temp <= 90 ? "�빮��": "�빮�ھƴ�";
		System.out.println("��� : " + result);
		
		String result = temp >= 'A' && temp <= 'Z' ? "�빮��": "�빮�ھƴ�";
		System.out.println("��� : " + result);
		*/

		
		// �빮�� �� �ҹ���
		//'A'(65) �� 'a'(97) ==> +32
		//'B'(66) �� 'b'(98) ==> +32
		//        :


		// �ҹ��� �� �빮��
		//'a'(97) �� 'A'(65) ==> -32
		//'b'(98) �� 'B'(66) ==> -32
        //        :

		char ch, result;

		System.out.print("�� ���� �Է� : ");
		ch = (char)System.in.read();

		//result = () ? ( ) : (  );
		//result = (�Է°��빮��) ? (�ҹ��ڷκ�ȯ) : ((�Է°��ҹ��� ? �빮�ڷκ�ȯ : �״��));
		result = (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : (  (ch >= 97 && ch <= 122) ? (char)(ch - 32) : ch  );
		
		// Q (�� 81)
		// result = (81 >= 65 && ch <= 'Z') ? (char)(ch + 32) : (  (ch >= 97 && ch <= 122) ? (char)(ch - 32) : ch  );
		// result = (true && ch <= 'Z') ? (char)(ch + 32) : (  (ch >= 97 && ch <= 122) ? (char)(ch - 32) : ch  );
		// result = (true 65 && 81 <= 90) ? (char)(ch + 32) : (  (ch >= 97 && ch <= 122) ? (char)(ch - 32) : ch  );
		// result = (true && true) ? (char)(ch + 32) : (  (ch >= 97 && ch <= 122) ? (char)(ch - 32) : ch  );
		// result = true ? (char)(ch + 32) : (  (ch >= 97 && ch <= 122) ? (char)(ch - 32) : ch  );
		// result = true ? (char)(81 + 32) : (  (ch >= 97 && ch <= 122) ? (char)(ch - 32) : ch  );
		// result = true ? (char)(113) : (  (ch >= 97 && ch <= 122) ? (char)(ch - 32) : ch  );
		// result = true ? ('q') : (  (ch >= 97 && ch <= 122) ? (char)(ch - 32) : ch  );
		// result = 'q';


		System.out.printf("%c �� %c\n", ch, result);
	}
}


// ���� ���

/*
�� ���� �Է� : E
E �� e
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
�� ���� �Է� : a
a �� A
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
�� ���� �Է� : 9
9 �� 9
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/