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

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, if ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ���� ����� ���ǻ� ���� ������� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է�    : 10
// �� ��° ���� �Է�    : 3
// ������ �Է�[+ - * /] : +

// >> 10 + 3 = 13
// ����Ϸ��� �ƹ� Ű�� ��������...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{




		// �� Ǯ�� ---------------------------------------------------------------

		/*
		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n1, n2;
		char operator;
		int result = 0;


		// ���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		n1 = Integer.parseInt(br.readLine());

		System.out.print("ù ��° ���� �Է� : ");
		n2 = Integer.parseInt(br.readLine());
			
		System.out.print("������ �Է�[+ - * /] : ");
		//operator = (char)System.in.read();
		operator = (char)br.read();
		

		if(operator == '+')
		{
			result = n1 + n2;	
		}
		else if(operator == '-')
		{
			result = n1 - n2;
		}
		else if(operator == '*')
		{
			result = n1 * n2;
		}
		else if(operator == '/')
		{
			result = n1 / n2;
		}


		// ��� ���
		System.out.println(">> " + n1 + " " + operator + " " + n2 + " = " + result);
		*/








		// �Բ��� Ǯ�� --------------------------------------------------------------------------------------------
		/*
		// ��� ��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b;			//-- ù ��°, �� ��° ����
		char op;			//-- ������

		
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		// Integer.parseInt()
		// "1234" �� Integer.parseInt() �� 1234
		// "abcd" �� Integer.parseInt() �� (X : Number Format Exception Error!)
		// System.in.read()int ��ȯ
		// Integer.parseInt() int ��ȯ,  ���ڸ���� ���ڿ��� �ǳ��༭ int�� ��ȯ���ش�.
		
		System.out.print("������ �Է�[+ - * /] : ");
		op = (char)System.in.read();
			

		if(op == '+')													// ����ڰ� �Է��� �����ڰ� '+' ���
		{
			System.out.printf(">> %d + %d = %d\n", a, b, (a+b));	    // a �� b�� ���� ���� �����Ͽ� ���
		}
		else if(op == '-')												// ����ڰ� �Է��� �����ڰ� '-' ���
		{
			System.out.printf(">> %d - %d = %d\n", a, b, (a-b));        // a �� b�� ���� ���� �����Ͽ� ���
		}
		else if(op == '*')												// ����ڰ� �Է��� �����ڰ� '*' ���
		{
			System.out.printf(">> %d * %d = %d\n", a, b, (a*b));        // a �� b�� ���� ���� �����Ͽ� ���
		}
		else if(op == '/')												// ����ڰ� �Է��� �����ڰ� '/' ���
		{
			System.out.printf(">> %d / %d = %d\n", a, b, (a/b));        // a �� b�� ������ ���� �����Ͽ� ���
		}
		else
		{
			System.out.println("\n>> �Է� ������ ������ �����մϴ�.");
		}
		
		*/






		// ---------------------------------------------------------------------------------------------------------
		// ��� ��
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, op;													//-- ù ��°, �� ��° ����, ������ check~!!!
		
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		
		System.out.print("������ �Է�[+ - * /] : ");
		op = System.in.read();
			

		if(op == 43)													// ����ڰ� �Է��� �����ڰ� '+' ���
		{
			System.out.printf(">> %d + %d = %d\n", a, b, (a+b));	    // a �� b�� ���� ���� �����Ͽ� ���
		}
		else if(op == 45)												// ����ڰ� �Է��� �����ڰ� '-' ���
		{
			System.out.printf(">> %d - %d = %d\n", a, b, (a-b));        // a �� b�� ���� ���� �����Ͽ� ���
		}
		else if(op == 42)												// ����ڰ� �Է��� �����ڰ� '*' ���
		{
			System.out.printf(">> %d * %d = %d\n", a, b, (a*b));        // a �� b�� ���� ���� �����Ͽ� ���
		}
		else if(op == 47)												// ����ڰ� �Է��� �����ڰ� '/' ���
		{
			System.out.printf(">> %d / %d = %d\n", a, b, (a/b));        // a �� b�� ������ ���� �����Ͽ� ���
		}
		else
		{
			System.out.println("\n>> �Է� ������ ������ �����մϴ�.");
		}
		*/






		// ---------------------------------------------------------------------------------------------------------
		// ��� ��

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, result = 0;
		char op;
		
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		
		System.out.print("������ �Է�[+ - * /] : ");
		op = (char) System.in.read();
			

		if(op == '+')													
			result = a + b;	    
		else if(op == '-')												
			result = a - b;
		else if(op == '*')												
			result = a * b;
		else if(op == '/')											
			result = a / b;
		

		// ��� ���
		//System.out.println(">> " + a + " " + op + " " + b + " = " + result);	
		System.out.printf("\n>> %d %c %d = %d\n", a, op, b, result);





	}
}

// ���� ���

/*
ù ��° ���� �Է� : 10
ù ��° ���� �Է� : 3
������ �Է�[+ - * /] : +
>> 10 + 3 = 13
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
ù ��° ���� �Է� : 100
ù ��° ���� �Է� : 40
������ �Է�[+ - * /] : -
>> 100 - 40 = 60
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 2
������ �Է�[+ - * /] : [

>> �Է� ������ ������ �����մϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/