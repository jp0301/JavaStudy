/*=============================================
    ■■■ 실행 흐름의 컨트롤(반복문) ■■■
	 - 반복문 (while문) 실습
  ============================================*/

// 사용자로부터 임의의 두 정수를 입력받아
// 입력받은 두 정수 중
// 작은 수 부터 큰 수 까지의 합을 구하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 100
// 두 번째 정수 입력 : 200
// >> 100 ~  200 까지의 합 : xxxx
// 계속하려면 아무 키나 누르세요...

// 첫 번째 정수 입력 : 1000
// 두 번째 정수 입력 : 2
// >> 2 ~  1000 까지의 합 : xxxx
// 계속하려면 아무 키나 누르세요...



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test052
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2;							  //-- 사용자의 입력값을 담을 변수
		int a;									  //-- 루프 변수로 활용할 변수
		int sum = 0;							  //-- 누적합을 담아낼 변수


		// 연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		num2 = Integer.parseInt(br.readLine());

		if(num1 > num2)	//swap
		{
			num1 = num1^num2;
			num2 = num2^num1;
			num1 = num1^num2;
			
		}

		// 반복 연산 수행
		// 반복 연산을 수행하기 전에
		// 작은 수를 따로 저장하여 루프 변수로 활용한다.
		// (결과 출력 과정에서 입력받은 작은 수가 필요한데...
		//  그 수를 반복 과정에서 사용하게 되면...
		//  원래의 값을 확인할 수 없기 때문에...)

		a = num1;
			
		while(a <= num2)
		{
			sum += a;
			a++;
		}

		// 결과 출력
		System.out.println( ">> " + num1 + " ~ " +  num2 + " 까지의 합 : " + sum );
	}
}


// 실행 결과

/*
첫 번째 정수 입력 : 1
두 번째 정수 입력 : 10
1 ~ 10 까지의 합 : 55
계속하려면 아무 키나 누르십시오 . . .
*/


/*
첫 번째 정수 입력 : 9
두 번째 정수 입력 : 1
1 ~ 9 까지의 합 : 45
계속하려면 아무 키나 누르십시오 . . .
*/

/*
첫 번째 정수 입력 : 1000
두 번째 정수 입력 : 2
>> 2 ~ 1000 까지의 합 : 500499
계속하려면 아무 키나 누르십시오 . . .
*/