/*==============================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - 자바에서 기본적으로 제공하는 주요 클래스들
  - Wrapper 클래스
===============================================*/

import java.math.BigInteger;

public class Test132
{
	public static void main(String[] args)
	{
		// 불가능
		//int a1 = 123456789123456789;
		//System.out.println(a1);
		
		// 불가능
		//long b1 = 123456789123456789;
		//System.out.println(b1);
		
		// 가능
		//long c1 = 123456789123456789L;
		//System.out.println(c1);

		// 불가능
		//long d1 = 123456789123456789123456789L;
		//System.out.println(d1);

		BigInteger a = new BigInteger("12345789123546789");
		BigInteger b = new BigInteger("12345789123546789");

		//BigInteger c = a + b;
		//System.out.println(c);
		

		// 더하기
		BigInteger c = a.add(b);
		System.out.println("덧셈 결과 : " + c);
		//--==>> 덧셈 결과 : 24691578247093578

		// 빼기
		BigInteger d = a.subtract(b);
		System.out.println("뺄셈 결과 : " + d);
		//--==>> 뺄셈 결과 : 0

		// 곱하기
		BigInteger e = a.multiply(b);
		System.out.println("곱셈 결과 : " + e);
		//--==>> 곱셈 결과 : 152418509083086192506851072210521

		// 나눗셈
		BigInteger f = a.divide(b);
		System.out.println("나눗셈 결과 : " + f);
		//--==>> 뺄셈 결과 : 1


		// 지수승
		BigInteger g = new BigInteger("2");
		System.out.println("2의 3승 : " + g.pow(3));
		//--==>> 2의 3승 : 8


	}
}

// 실행 결과
/*
덧셈 결과 : 24691578247093578
뺄셈 결과 : 0
곱셈 결과 : 152418509083086192506851072210521
나눗셈 결과 : 1
2의 3승 : 8
계속하려면 아무 키나 누르십시오 . . .
*/