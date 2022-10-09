/*=============================================
      ■■■ 실행 흐름의 컨트롤(반복문) ■■■
	  - 반복문 실습 및 관찰
  ============================================*/

// 1 부터 100 까지의 정수 중에서
// 짝수들의 합을 계산하여 결과값을 출력하는 프로그램을 구현한다.
// 단, 조건문을 사용하지 않도록 하며,
// while 반복문을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 1 부터 100 까지의 수 중 짝수의 합 : xxxx
// 계속하려면 아무 키나...

public class Test045
{
	public static void main(String[] args)
	{

		// 내 풀이 --------------------------------------------------------
		/*
		int n = 2;
		int sum = 0;

		while(n <= 100)
		{
			sum += n;
			n += 2;
		}

		System.out.printf("1부터 100까지의 수 중 짝수의 합 : %d\n", sum); 
		*/

		// 함께한 풀이 --------------------------------------------------------
		
		// ※ 문제 인식 및 분석
		//    2 + 4 + 6 + 8 + 10 + ... + 100
		//    - 초기값 : 2
		//    - 증가값 : 2
		//    - 한계값 : 100
		
		// 주요 변수 선언 및 초기화
		int n = 2;
		int sum = 0;
		
		// 연산 및 처리(반복 연산)
		while(n < = 100)
		{
			sum += n;		//--sum 값을 n 만큼 증가~!!!
			n += 2;			//-- n 값을 2 만큼 증가~!!!
		}

		// 결과 출력
		System.out.println("1부터 100까지의 수 중 짝수의 합 : " + sum);
		
	}
}

// 실행 결과

/*
1부터 100까지의 수 중 짝수의 합 : 2550
계속하려면 아무 키나 누르십시오 . . .
*/