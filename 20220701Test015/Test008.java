/*==========================================
  ���� �ڹ��� ���� �� Ư¡ ����
  - ������ �ڷ���
  - ������ �ڷ��� �ǽ� �� �׽�Ʈ : char
==========================================*/

public class Test008
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ����
		char ch1, ch2, ch3;
		int a;			//-- check~!!!

		// ���� �� ó��
		ch1 = 'A';
		ch2 = '\n';		// ���� ����, �������ô� ������ ���ڷ� ����ϴ� ���� �ƴ϶� \n�� �ϳ��� ���ڷ� ��� ��, \\ �������� 2����� ���ڷ� �������ù�����°���
		ch3 = '��';     // �� + ��  ���� ���� �ʴ´�. �ϳ��� ���ڷ� �ν��ϰ� ó���Ѵ�.
		
		//a = ch1;		//-- check~!!! 1, �ƽ�Ű�ڵ� 2, �ڵ� �� ��ȯ ��Ģ
		a = (int)ch1;	//-- check~!!! 
		//-- ������ �� ��ȯ(���� �� ��ȯ)   1. �ڵ� �� ��ȯ ��Ģ�� ��������� �ؾߵ� �� 2, �ǵ������� �߻������� ǥ���ϱ� ���ؼ�


		//System.out.printf("%d, %d, %d, %d%n", ch1, ch2, ch3, a);
		//--==>> ���� �߻�(��Ÿ�� ����)
		System.out.printf("%c, %c, %c, %d%n", ch1, ch2, ch3, a);


		// ��� ���
		System.out.println("ch1 : " + ch1);
		//--==> ch1 : A

		System.out.println("ch2 : " + ch2);
		//--==>> ch2 : (����)

		System.out.println("ch3 : " + ch3);
		//--==>> ch3 : ��

		System.out.println("a : "+ a);
		//--==>> a : 65

	}
}

//���� ���

/*
A,
, ��, 65
ch1 : A
ch2 :

ch3 : ��
a : 65
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/