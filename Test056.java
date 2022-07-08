/*=============================================
    ■■■ 실행 흐름의 컨트롤(반복문) ■■■
	 - 반복문 (do~while문) 실습
  ============================================*/

// 사용자로부터 여러 개의 양의 정수를 입력받고,
// 그 합을 계산하여 출력하는 프로그램을 작성한다.
// 단, -1 이 입력되는 순간 입력 행위를 중지하고
// 그동안 입력된 정수의 합을 출력해주는 프로그램을 구현한다.
// 즉, -1 을 입력 중지 커맨드로 활용한다.
// do~while 문을 활용하여 문제를 해결할 수 있도록 한다.

// 실행 예)
// 1번째 정수 입력(-1 종료) : 10
// 2번째 정수 입력(-1 종료) : 5
// 3번째 정수 입력(-1 종료) : 8
// 4번째 정수 입력(-1 종료) : -1

// >> 현재까지 입력된 정수의 합 : 32
// 계속하려면 아무 키나 누르세요...


//import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test056
{
	public static void main(String[] args) throws IOException
	{
		/*
		Scanner sc = new Scanner(System.in);
		int num, sum = 0;
		int count = 1;
		
		
		do
		{
			System.out.print( count + "번째 정수 입력(-1 종료) : ");
			num = sc.nextInt();

			if(num != -1)
			{
				sum += num;
			}
			else
				break;

			count++;
		}
		while(true);

		System.out.println("\n>> 현재까지 입력된 정수의 합 : " + sum);
		*/



		// 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;			//-- 사용자의 입력값을 담아낼 변수
		int sum=0;			//-- 누적합을 담아낼 변수
		int n=1;			//-- 루프 변수로 활용하며 몇 번째 입력값인지를 담아낼 변수



		// 연산 및 처리



		// 결과 출력













	}
}

// 실행 결과

/*
1번째 정수 입력(-1 종료) : 10
2번째 정수 입력(-1 종료) : 10
3번째 정수 입력(-1 종료) : 11
4번째 정수 입력(-1 종료) : -1

>> 현재까지 입력된 정수의 합 : 31
계속하려면 아무 키나 누르십시오 . . .
*/