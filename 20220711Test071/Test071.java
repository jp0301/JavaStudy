/*=====================================
    ���� Ŭ������ �ν��Ͻ� ����
  =====================================*/

// �� CircleTest.java ���ϰ� ��Ʈ~!!!

import java.io.IOException;

public class Test071
{
	// input() �޼ҵ忡�� throws IOException ����ó���� �ϸ�
	// input �޼ҵ� ������ �����鼭
	// main() �޼ҵ�� �������� ���̱� ������ �ٽ� �ѹ� ��������ϱ� ������
	// �ѹ� �� ����ó���� ���ش�.

	public static void main(String[] args) throws IOException
	{
		// CircleTest Ŭ���� ��� �ν��Ͻ� ����
		// CircleTest �ν��Ͻ� ����
		// CircleTest ��ü ����
		CircleTest ob = new CircleTest();
		

		ob.input();
		
		double area = ob.calArea();
		double length = ob.calLength();
        
		ob.print(area, length);
	}
}

// ���� ���

/*
������ �Է� : 25
>> �������� 25 �� ����
>> ���� : 1963.50
>> �ѷ� : 157.08
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/