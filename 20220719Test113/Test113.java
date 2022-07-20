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

//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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

	// �����ڴ� ����� ��󿡼� ����

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
	*/

	Bclass()
	{
		// super();
	}

	// �����͸� �Է¹޾ƿ��� �޼ҵ�
	boolean input() throws IOException
	{
		/*
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		x = sc.nextInt();
		y = sc.nextInt();

		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ �� ���� �Է�(���� ����) : ");	// "20 15"
		String temp = br.readLine();

		// �� ���ڿ�.split("������");
		//    ���ڿ�.split("\\s");		//-- ������ �� ����
		//    ex) "10 20 30 40 50".split("\\s");
		//         �� ��ȯ �� {"10", "20", "30", "40", "50"}
		//    ex) "010-1234-4567".split("-");
		//         �� ��ȯ �� {"010", "1234", "4567"}
		
		String[] strArr = temp.split("\\s");

		if(strArr.length != 2)
			return false;
		//-- false �� ��ȯ�ϸ� input() �޼ҵ� ����
		//   �� ������ �����Ͽ� if ���� �����ϰ� �� ���...
		//   �Ʒ� �����ؾ� �� �ڵ尡 �����ִ���
		//   �����(false)�� ��ȯ�ϸ� �޼ҵ�� ����ȴ�.

		x = Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);
		
		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();
		
		/*
		if(op != '+' && op != '-' && op != '*' && op != '/')
			return false;
		*/

		//���� - ������ ���ǽ��� ����� �� �غ����Ѵ�.
		
		if(op == '+' || op == '-' || op == '*' || op == '/')
			return true;
		
		return false;

	} // close input()


	double calc()
	{
		double result = 0.0;

		switch(op)
		{
			case '+': result = x + y; break;
			case '-': result = x - y; break;
            case '*': result = x * y; break;
            case '/': result = (double)x / y; //break;
		}

		return result;

	} // end calc()

	/*
	@Override
	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
	*/
	
} // close class Bclass


// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test113
{
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();

		// ob.input();

		if (!ob.input())
		{
			System.out.println("Error...");
			return;
		}

		double result = ob.calc();

		ob.write(result);

	}
}

// ���� ���
/*
������ �� ���� �Է�(���� ����) : 11 6
������ �Է�(+ - * /) : *
>> 11 * 6 = 66.00
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ �� ���� �Է�(���� ����) : 22 6
������ �Է�(+ - * /) : /
>> 22 / 6 = 3.67
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/