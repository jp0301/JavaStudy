 /*=============================================
      ■■■ 실행 흐름의 컨트롤(제어문) ■■■
      - if문
	  - if ~ else 문 실습
   ============================================*/

// 1. 프로그램을 작성할 때 주어진 조건에 따라
//	  분기 방향을 정하기 위해 사용하는 제어문에는
//    if 문, if ~ else 문, 조건 연산자, 복합 if문(if문 중첩)
//    , switch 문이 있다.

// 2. if문은 if 다음의 조건이 참일 경우
//    특정 문장을 수행하고자 할 때 사용되는 구문이다.

// 홀수, 짝수 → 단일 if 구문

// 홀수, 짝수, 영 → if 문 중첩

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;

		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());
		
		/*
		if(n != 0)
		{
			if(n % 2 == 0)
			{
				System.out.printf(">> %d은(는) 짝수입니다.\n", n);
			}

			if (n % 2 == 1)
			{
				System.out.printf(">> %d은(는) 홀수입니다.\n", n);
			}
		
		}
		else 
		{
			System.out.printf(">> %d은(는) 영입니다.\n", n);
		}
		*/

		/*
		if(n == 0)
		{
			System.out.printf(">> %d은(는) 영입니다.\n", n);
		}
		else if(n%2 == 0)
		{
			System.out.printf(">> %d은(는) 짝수입니다.\n", n);

		}
		else
		{
			System.out.printf(">> %d은(는) 홀수입니다.\n", n);
		}
		*/

		/*
		if(n % 2 != 0)
		{
			System.out.printf(">> %d은(는) 홀수입니다.\n", n);
		}
		else if(n == 0)
		{
			System.out.printf(">> %d은(는) 영입니다.\n", n);

		}
		else if(n % 2 == 0)
		{
			System.out.printf(">> %d은(는) 짝수입니다.\n", n);
		}
		*/

		String result = "판정 불가";
		
		if(n==0)
		{
			result = "영";
		}
		else if (n %2 ==0)
		{	
			result = "짝수";
		}
		else if (n%2!=0)
		{
			result = "홀수";
		}
		//else
		//{
		//	result = "판정 불가";
		//}

		System.out.println( n + " → " + result);


	}
}