/*=====================================
    ���� Ŭ������ �ν��Ͻ� ����
  =====================================*/

// �� CircleTest.java ���ϰ� ��Ʈ~!!!

import java.io.IOException;

public class Test071
{
	public static void main(String[] args) throws IOException
	{
		CircleTest ob = new CircleTest();
		
		ob.input();
		
		double area = ob.calArea();
		double length = ob.calLength();
        
		ob.print(area, length);
	}
}