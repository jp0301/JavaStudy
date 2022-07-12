/*====================================
    ���� Ŭ������ �ν��Ͻ� ����
  ====================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// 1���� �Է¹��� �� ������ ���� �����Ͽ�
// ������� ����ϴ� ���α׷��� �����Ѵ�.

// ��, ���ݱ���ó�� main() �޼ҵ忡 ��� ����� �����ϴ� ���� �ƴ϶�
// Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// (Hap Ŭ���� ����)
// ����, ������ �Է� ó�� �������� BufferedReader �� readLine() �� ����ϸ�,
// �ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է�(1~1000) : 1050
// ������ ���� �Է�(1~1000) : -45
// ������ ���� �Է�(1~1000) : 100
// >> 1 ~ 100 ������ �� : 5050
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap
{
	int num;

	// �Է� �޼ҵ�
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
			System.out.print("������ ���� �Է�(1~1000) : ");
			num = Integer.parseInt(br.readLine());
		}
		while (num < 1 || num > 1000);

	}

	// ������ �޼ҵ�
	// ������ �޼ҵ带 ������ �� ( int result = 0; return result; ) ���� ������ ���� �ڷ����� �ٷ� int!
	int calHap()
	{
		int result = 0;

		for(int i = 1; i <= num; i++)
		{
			result += i;
		}

		return result;
	}


	// ��� ��� �޼ҵ�
	void print(int sumResult)
	{
		System.out.printf(">> 1 ~ %d ������ �� : %d\n", num, sumResult);
	}
}


public class Test072
{
	public static void main(String[] args) throws IOException
	{
		// Hap �ν��Ͻ� ����
		Hap ob = new Hap();
		
		// ������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ�� �� input()
		// ----------------------
		//     �������� Ȱ��
		// Hap.input()�� �̹� ���� �������� ������ �������� Ȱ��
		ob.input();			//-- new Hap().input()

		// ������ �ν��Ͻ��� ���� ���� ó�� �޼ҵ� ȣ�� �� calculate()
		int sum = ob.calHap();
		
		// ������ �ν��Ͻ�(ob)�� ���� ��� �޼ҵ� ȣ�� �� print()
		ob.print(sum);
		// ob.print(ob.calHap());
	}
}

// ���� ���
/*
������ ���� �Է�(1~1000) : 1050
������ ���� �Է�(1~1000) : -45
������ ���� �Է�(1~1000) : 100
1 ~ 100 ������ �� : 5050
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ ���� �Է�(1~1000) : 5
1 ~ 5 ������ �� : 15
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/