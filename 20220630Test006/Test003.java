/*====================================
  ■■■ 자바의 개요 및 특징 ■■■
  - 변수와 자료형
====================================*/

public class Test003
{
	// ⓐ

	public static void main(String[] args)
	{
		// ⓑ

		// 변수 선언
		int a;

		// 변수 a 에 10 대입(변수 초기화)
		a = 10;
		
		// 변수 선언 및 초기화(선언과 대입을 한 번에 처리)
		int b = 20;
		
		//다시 선언하면서 이용하는 것이므로 이미 위에서 선언했기 때문에 안된다.
		//int a = 30;

		// 변수 선언
		int c;

		// 테스트
		//System.out.println(c);
		//--==>> 에러 발생(컴파일 에러)

		// 연산 및 처리
		c = a + b;
		//-- c = 10 + 20;
		//-- c = 30;
		//-- 변수 c 에 30 대입해라.

		// 결과 출력
		System.out.println(c);
		//--==>> 30

		// 결과 출력
		//System.out.println(a b c);
		//--==>> 에러 발생(컴파일 에러)


		// ※ 덧셈 연산자(+)
		//    피연산자 중 어느 하나라도 문자열 형태의 데이터가 존재한다면
		//    산술연산자로써의 기능을 수행하는 것이 아니라
		//    문자열 결합 연산자로써의 기능을 수행하게 된다.


		//결과 출력 - 연결이 되면서 하나의 단일 값, 문자열이 되어버린다. ( "10 20 30" );
		System.out.println(a + " " + b + " " + c);
		//--==>> 10 20 30
		
		//결과 출력
		System.out.println("a의 값은 " + a + "입니다.");
		System.out.println("b의 값은 " + b + "입니다.");
		System.out.println("c의 값은 " + c + "입니다.");
		//-- 『+』 연산자를 사용하는 과정에서
		//    피연산자 중 문자열이 포함되어 있을 경우
		//    문자열 결합 연산자로 활용되며
		//    처리의 최종 결과는 문자열의 형태로 반환된다.
		//--==>>
		/*
			a의 값은 10입니다.
			b의 값은 20입니다.
			c의 값은 30입니다.
		*/

		System.out.println(1 + 2);      // 산술연산자 +
		System.out.println("1" + 2);    // 문자열 결합 연산자 +, 최종 결과값의 형태는 문자열
		System.out.println(1 + "2");    // 문자열 결합 연산자 +
		System.out.println("1" + "2");  // 문자열 결합 연산자 +


	}
}



// 실행 결과
/*
30
10 20 30
a의 값은 10입니다.
b의 값은 20입니다.
c의 값은 30입니다.
3
12
12
12
계속하려면 아무 키나 누르십시오 . . .
*/