/*=====================================
    ■■■ 클래스와 인스턴스 ■■■
  =====================================*/

// ※ CircleTest.java 파일과 세트~!!!

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