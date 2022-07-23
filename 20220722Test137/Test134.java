/*==============================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
  - Wrapper Ŭ����
===============================================*/


public class Test134
{

	/*
	static void print(Byte b) { ... }
	static void print(Integer i) { ... }
	...
	...
	*/

	//static void print(Object obj) { ... }
	// java.lang.Number Ŭ����(�߻� Ŭ����)��
	// ��� ������ Wrapper Ŭ������ �θ� Ŭ����
	// (���� Ŭ����, ���� Ŭ����)�̴�.
	// b2, i2 �ڷ����� Number �� �Ѿ���鼭
	// �� ĳ���� �� �Ͼ�� �ȴ�.
	static void print(Number n)
	{
		System.out.println(n);
		
		/*
		if(n instanceof Integer)
		{
			System.out.println(n.intValue());
		}
		else if (n instanceof Double)
		{
		}
		*/
	}

	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;
		long l = 123456789123456789L;
		short s = 2;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);
		Long l2 = new Long(l);
		Short s2 = new Short(s);

		//System.out.println(b2);
		//System.out.println(i2);
		//--==>> 3
		//       256

		print(b2);
		print(i2);
		print(l2);
		print(s2);
		
	}
}