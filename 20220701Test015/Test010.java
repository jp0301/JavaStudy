/*====================================
  ■■■ 자바의 개요 및 특징 ■■■
=====================================*/

// ○ 퀴즈
//    사전에 부여된 반지름 정보를 통해
//    원의 넓이와 둘레를 구하는 프로그램을 구현한다.
//	  → 반지름 : 10

// ※ 원의 넓이 = 반지름 * 반지름 * 3.141592
//    원의 둘레 = 반지름 * 2 * 3.141592


// 실행 예)
// 넓이 : xxxx
// 둘레 : xxxx
// 계속하려면 아무 키나 누르세요...

public class Test010
{
	public static void main(String[] args)
	{

		// 내가 풀이한 내용 -------------------
		
		/*
		int radius = 10;
		double pi = 3.141592;

		double a = radius * radius * pi;
		double b = radius * 2 * pi;

		System.out.println("넓이 : " + a);
		System.out.println("둘레 : " + b);
		*/
	
		// 함께 풀이한 내용 -------------------
		
	
		// 주요 변수 선언
		int r = 10;						//-- 반지름(r)
		//double pi = 3.141592;			//-- 원주율(π)
		final double PI = 3.141592;		//-- 원주율(π)
		//-- 『final』 키워드 : 변수의 상수화~!!! , 상수화시켜놓은 변수는 대문자로 쓰기로 한다는 개발자들의 약속
		
		/*
		RAINBOW_COLOR
		USER_NAME
		APPLE_PRICE
		*/

		double area, length;				//-- 원의 넓이, 원의 둘레


		// 연산 및 처리
		// ① 넓이 연산
		//    원의 넓이 = 반지름 * 반지름 * 3.141592;
		area = r * r * PI;

		// ② 둘레 연산
		//    원의 둘레 = 반지름 * 2 * 3.141592;
		length = r * 2 * PI;


		// 결과 출력
		//System.out.println("넓이 : " + area);
		//System.out.println("둘레 : " + length);	

		System.out.printf("넓이 : %.3f\n", area);
		System.out.printf("둘레 : %.3f\n", length);
	}

}



// 실행 결과

/*
넓이 : 314.159
둘레 : 62.832
계속하려면 아무 키나 누르십시오 . . .
*/