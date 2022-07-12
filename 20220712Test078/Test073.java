/*====================================
    ���� Ŭ������ �ν��Ͻ� ����
  ====================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� ������ �����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
// (Calculate Ŭ���� ����)

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 10 5
// ������ ������(+ - * /)         : +
// >> 10 + 5 = 15
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	int num1, num2;		//-- �� ���� ��Ƴ� ����
	char op;			//-- ������ ��Ƴ� ����


	// �޼ҵ� ����(��� : �Է�)
	void input() throws IOException
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		System.out.print("������ ������(+ - * /) : ");
		op = (char)System.in.read();
	}

	// �޼ҵ� ����(��� : ����) ������ ���굵 ���� ������� ó������
	int calculate()
	{
		//int cal = 0;
		int result = -1;
		/*
		if(op == '+')
			cal = num1 + num2;
		else if(op == '-')
			cal = num1 - num2;
		else if(op == '*')
			cal = num1 * num2;
		else if(op == '/')
			cal = num1 / num2;
		else
			System.out.println("������ ����");
		*/

		switch(op)
		{
			case '+': result = num1 + num2; break;
			case '-': result = num1 - num2; break;
			case '*': result = num1 * num2; break;
			case '/': result = num1 / num2; break;
			//default : result = -1;

		}
		return result;
	}

	// �޼ҵ� ����(��� : ���)
	void print(int result)
	{
		System.out.printf(">> %d %c %d = %d\n", num1, op, num2, result);
	}
}



public class Test073
{
	public static void main(String[] args) throws IOException
	{
		// Calculate �ν��Ͻ� ����
		Calculate ob = new Calculate();

		ob.input(); // ������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ��
		//ob.print(ob.calculate()); 
		int r = ob.calculate(); // ������ �ν��Ͻ��� ���� ���� �޼���ȣ��
		ob.print(r);
	}
}

// ���� ���
/*
������ �� ���� �Է�(���� ����) : 10 5
������ ������(+ - * /) : -
>> 10 - 5 = 5
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ �� ���� �Է�(���� ����) : 20 5
������ ������(+ - * /) : *
>> 20 * 5 = 100
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/