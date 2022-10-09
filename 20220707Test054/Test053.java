/*=============================================
    ■■■ 실행 흐름의 컨트롤(반복문) ■■■
	 - 반복문 (while문) 실습
  ============================================*/

// ○ 과제
//    사용자로부터 임의의 정수를 입력받아
//    1부터 입력받은 그 정수까지의
//    전체 합과, 짝수의 합과, 홀수의 합을
//    각각 결과값으로 출력하는 프로그램을 구현한다.


// 실행 예)
// 임의의 정수 입력 : 284
// >> 1 ~ 284 까지 정수의 합 : xxxx
// >> 1 ~ 284 까지 짝수의 합 : xxxx
// >> 1 ~ 284 까지 홀수의 합 : xxxx
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053
{
	public static void main(String[] args) throws IOException
	{

		// 변수 선언 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = 1, num, nSum, evenSum, oddSum;
		nSum = evenSum = oddSum = 0;


		// 주요 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());

		while(a <= num) //1부터 입력받은 임의의 정수 까지 반복
		{
			nSum += a; // 정수의 합 구하기
			
			if(a % 2 == 0) // 짝수의 합 구하기
			{
				evenSum += a;
			}
			else if(a % 2 != 0) // 홀수의 합 구하기
			{
				oddSum += a;	
			}

			a++; // a는 1씩 증가
		}

		// 결과 출력
		System.out.printf("1 ~ %d 까지 정수의 합 : %d\n", num, nSum);
		System.out.printf("1 ~ %d 까지 짝수의 합 : %d\n", num, evenSum);
		System.out.printf("1 ~ %d 까지 홀수의 합 : %d\n", num, oddSum);
	}
}

//실행 결과

/*
임의의 정수 입력 : 284
1 ~ 284 까지 정수의 합 : 40470
1 ~ 284 까지 짝수의 합 : 20306
1 ~ 284 까지 홀수의 합 : 20164
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 정수 입력 : 10
1 ~ 10 까지 정수의 합 : 55
1 ~ 10 까지 짝수의 합 : 30
1 ~ 10 까지 홀수의 합 : 25
계속하려면 아무 키나 누르십시오 . . .
*/