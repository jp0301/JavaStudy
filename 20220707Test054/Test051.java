/*=============================================
    ■■■ 실행 흐름의 컨트롤(반복문) ■■■
	 - 반복문 (while문) 실습
  ============================================*/

// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 소수인지 아닌지를 판별하여
// 결과를 출력하는 프로그램을 구현한다.

// ※ 소수 : 1 또는 자기 자신의 값 이외에 어떤 수로도
//	         나누어 떨어지지 않는 수
//			 단, 1은 소수가 아니다.

// 실행 예)
// 임의의 정수 입력 : 10
// 10 → 소수 아님
// 계속하려면 아무 키나 누르세요...

// 임의의 정수 입력 : 11
// 11 → 소수
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test051
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		int a;
		int n = 1;

		String result = "재입력";

		System.out.print("임의의 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		while(n <= a) // n이 1부터 1씩 증가하면서 입력받은 a 값 까지 반복한다.
		{
			n++;	   // n이 2부터 시작

			if(a == 1) // a값 1을 입력받을 때, 1은 소수가 아닐 때
			{
				result = "1은 소수가 아니다.";
				break;
			}
			
			if(a == n) // n이 a와 같아질 때 → '소수' → break로 탈출
			{		   // 자기 자신...
				result = "소수";
				break;
			}

			if(a % n == 0) // a가 n이 증가하면서 나눠지는 값이 있을 때가 생기면
			{			   // 소수임을 판단하고 '소수아님' → break로 탈출
				result = "소수아님";
				break;
			}
		}
	
		
		//결과 출력
		System.out.println(a + " → " + result);
		*/


		/* 정영준 님 -------------------------------------------------------------

		int i, n=1, count=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("임의의 정수 입력 : ");
		i = Integer.parseInt(br.readLine());
		
		while(n<=i)
		{
			
			if(i % n == 0)
			count++;

			n++;
		}

		if (count == 2)
		System.out.printf("%d -> 소수%n",i);
		else
		System.out.printf("%d -> 소수아님%n",i);
		*/


		/* 한은영 님 -------------------------------------------------------------
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0, n = 2, result = 0;

		System.out.printf("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());

		while(n < num)
		{
			if((num % n) == 0 )
			{
				result = 1;
				break;	
			}
			n++;
		}

		if(result == 1)
		{ 
			System.out.printf("%d -> 소수아님\n",num);
		}
		else
		{
			System.out.printf("%d -> 소수\n",num);
		}

		*/


		// 함께한 풀이 -----------------------------------------------------------
		//주요 변수 선언 및 초기화
		int num;					//-- 사용자의 입력 값을 담을 변수
		int n = 2;					//-- 입력 값을 대상으로 나눗셈 연산을 수행할 변수
									//   2부터 시작해서 1씩 증가
									//   ex) 입력값 27 → n:2 3 4 5 6 7 8 ... 26

		// 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());

		// 어떤 값을 입력받은 상태인지 알 수 없지만
		// 이 입력 값을 소수라고 간주한다.
		//String result = "소수";
		boolean flag = true;		// num(사용자 입력값)은 소수일 것이다~!!!

		while(n<num)
		{

			// 테스트
			//System.out.println("반복문 수행");

			// 확인 연산
			//-- n으로 num이 나누어 떨어지는지 확인
			if (num % n == 0) // 즉, 나누어 떨어지는 상황
			{
				flag = false;
				break;		  //-- 멈춘다 (+ 그리고 빠져나간다.)
							  //   → break 를 감싸는 가장 가까운 반복문
			}

			n++;

		}
		

		// 결과 출력 ( 출력 전에 수행해야 할 추가 확인 → 1인지 아닌지에 대한 추가 검토)
		if (flag && num != 1) // true이고 num이 1이 아니면 소수이다.
		{
			System.out.printf("%d→ 소수\n", num);
		}		
		else
		{
			System.out.printf("%d → 소수 아님\n", num);
		}
		
	}
}

// 실행 결과

/*
임의의 정수 입력 : 10
10 → 소수아님
계속하려면 아무 키나 누르십시오 . . .
*/


/*
임의의 정수 입력 : 83
83 → 소수
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 정수 입력 : 1
1 → 소수 아님
계속하려면 아무 키나 누르십시오 . . .
*/