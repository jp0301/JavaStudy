/*=============================================
    ■■■ 실행 흐름의 컨트롤(반복문) ■■■
	 - 반복문 실습 및 관찰
  ============================================*/

// 반복문을 활용하여 누적곱 연산 수행
// cf.               누적합


// 1 * 2 * 3 * ... * 9 * 10

// 실행 예)
// 연산 결과 : xxxx
// 계속하려면 아무 키나 누르세요...


public class Test050
{
	public static void main(String[] args)
	{
		// 내 풀이 ------------------------------------------------
		/*
		int n = 1;
		int result = n;

		while(n <= 10)
		{
			result *= n;
			n++;
		}
		System.out.println("연산 결과 : " + result);
		*/


		// 함께한 풀이 --------------------------------------------
		// 주요 변수 선언 및 초기화
		int n = 0;					//-- 루프 변수
		int result = 1;				//-- 누적 곱을 담아낼 변수
		// check~!!!					 (→ 1로 초기화~!!!)

		//연산 및 처리(반복문 구성)
		while(n<10)
		{
			n++;
			result *= n;
		}

		// 결과 출력
		System.out.println("연산 결과 : " + result);		

	}
}

// 실행 결과

/*
연산 결과 : 3628800
계속하려면 아무 키나 누르십시오 . . .
*/