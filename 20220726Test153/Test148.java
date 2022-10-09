/*==============================================
  ■■■ 예외 처리(Exception Handling) ■■■
===============================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test148
{
	
	private String[] data = new String[3];

	public void proc() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n = 0;
		
		System.out.println("이름 입력[종료:Ctrl+z] : ");
		while( (str = br.readLine() ) != null )
		{ // BufferedReader의 readLine에서 IOException을 던지고 있겠구나. 추측 가능.
			data[n++] = str;
			System.out.print("이름 입력[종료:Ctrl+z] : ");
		}

		System.out.println("입력된 내용...........");
		for(String s : data)
		{
			if( s != null)
			{
				System.out.println(s);
			}
		}

	}// end proc()
	
	public static void main(String[] args) throws IOException
	{
		Test148 ob = new Test148();
		ob.proc();

	}
}