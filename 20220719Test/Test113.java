/*===============================
      ���� Ŭ���� ��� ����
	  - ���(Inheritance)
  ===============================*/

// ������ ���� ���α׷��� �����Ѵ�.
// ��, ����� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 20 15
// ������ �Է�(+ - * /) : -
// >> 20 - 15 = 5
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;
import java.io.IOException;


class Aclass
{
	protected int x, y;
	protected char op;

	Aclass()
	{
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
}


// Aclass �� ��ӹ޴� Ŭ������ ����
class Bclass extends Aclass
{
	/* ��� ���� �͵�
	protected int x, y;
	protected char op;

	Bclass()
	{
		super();
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
	*/

	public void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		x = sc.nextInt();
		y = sc.nextInt();

		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();
	}


	void calc()
	{
		double result = 0.0;

		switch(op)
		{
			case '+': result=x+y; break;
			case '-': result=x-y; break;
            case '*': result=x*y; break;
            case '/': result=(double)x/y; break;
		}
		write(result);
	}

	/*
	@Override
	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
	*/
	
}


// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test113
{
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();
		ob.input();
		ob.calc();

	}
}

// ���� ���
/*
������ �� ���� �Է�(���� ����) : 11 6
������ �Է�(+ - * /) : *
>> 11 * 6 = 66.00
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/