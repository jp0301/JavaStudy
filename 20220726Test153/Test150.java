/*==============================================
  ■■■ 예외 처리(Exception Handling) ■■■
===============================================*/

// Test151.java 파일과 비교~!!!

class Demo
{
	private int value;

	public void setValue(int value)
	{
		if(value <= 0)
		{
			return;
		}
	}

	public int getValue()
	{
		return value;
	}
}


public class Test150
{
	public static void main(String[] args)
	{
		Demo ob = new Demo();
		ob.setValue(-3);
		int result = ob.getValue();
		System.out.println(result);
	}
}