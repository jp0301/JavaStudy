/*==========================================
  ■■■ 자바의 개요 및 특징 ■■■
  - 변수와 자료형
  - 변수와 자료형 실습 및 테스트 : char
==========================================*/

public class Test008
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		char ch1, ch2, ch3;
		int a;			//-- check~!!!

		// 연산 및 처리
		ch1 = 'A';
		ch2 = '\n';		// 개행 문자, 역슬래시는 별도의 문자로 취급하는 것이 아니라 \n을 하나의 문자로 취급 중, \\ 역슬래시 2번써야 문자로 역슬래시문자출력가능
		ch3 = '대';     // ㄷ + ㅐ  따로 보지 않는다. 하나의 문자로 인식하고 처리한다.
		
		//a = ch1;		//-- check~!!! 1, 아스키코드 2, 자동 형 변환 규칙
		a = (int)ch1;	//-- check~!!! 
		//-- 명시적 형 변환(강제 형 변환)   1. 자동 형 변환 규칙에 위배되지만 해야될 때 2, 의도적으로 발생지점을 표시하기 위해서


		//System.out.printf("%d, %d, %d, %d%n", ch1, ch2, ch3, a);
		//--==>> 에러 발생(런타임 에러)
		System.out.printf("%c, %c, %c, %d%n", ch1, ch2, ch3, a);


		// 결과 출력
		System.out.println("ch1 : " + ch1);
		//--==> ch1 : A

		System.out.println("ch2 : " + ch2);
		//--==>> ch2 : (개행)

		System.out.println("ch3 : " + ch3);
		//--==>> ch3 : 대

		System.out.println("a : "+ a);
		//--==>> a : 65

	}
}

//실행 결과

/*
A,
, 대, 65
ch1 : A
ch2 :

ch3 : 대
a : 65
계속하려면 아무 키나 누르십시오 . . .
*/
