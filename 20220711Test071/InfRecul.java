/* ===================================
    ���� �޼ҵ��� ���ȣ�� ����
======================================*/


/*  ���⼭ �ڵ� ������ 2���� ��ġ �ٲٱ�
	public static void showHi(int cnt)
	{
		System.out.println("Hi~");
		showHi(cnt--);
		if(cnt==1)
			return;
	}

	�� ������
	1. showHi(cnt--)�� ���ǹ����� ���� ������ ������ �ʴ´�.
	   �� ���ǹ��� ���� �ø���.
	2. showHi(cnt--)�̱⿡ cnt���� ���� �� �ڿ� 1�� ���ҵȴ�.
	   �� showHi(--cnt);
*/


public class InfRecul
{
	public static void main(String[] args)
	{
		showHi(3);
	}

	// �ڵ� ������ 2���� ��ġ �ٲٱ�

	public static void showHi(int cnt)
	{
		System.out.println("Hi~");

		if(cnt==1)
			return;

		showHi(--cnt);
	}
}


// ��� �ݺ�
/*
	public static void showHi(3)
	{
		System.out.println("Hi~");  // ���

		if(3==1)
			return;					// (x)

		showHi(--3);				// showHi(2);
	}
*/

/*
	public static void showHi(2)
	{
		System.out.println("Hi~");  // ���

		if(2==1)
			return;					// (x)

		showHi(--2);				// showHi(1);
	}		
*/

/*
	public static void showHi(1)
	{
		System.out.println("Hi~");  // ���

		if(1==1)
			return;					// (o)

		showHi(--cnt);
	}
*/

// ���� ���
/*
Hi~
Hi~
Hi~
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/