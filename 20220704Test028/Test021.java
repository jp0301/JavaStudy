 /*=============================================
      ■■■ 자바 기본 프로그래밍 ■■■
   - 산술 연산자
   - BufferedReader
   - printf()
==============================================*/

// 사용자로부터 임의의 정수를 두 번 입력받아
// 사칙연산 및 나머지 연산을 수행하여
// 그 결과를 출력하는 프로그램을 구현한다.
// 단, 입력받는 과정은 BufferedReader  를 활용할 수 있도록 하고
// 출력하는 과정은 printf() 메소드를 활용할 수 있도록 한다.
// 또한, 나눗셈 연산은 편의상 정수 기반으로 처리한다.

//실행 예)
// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 2

// ==== [ 결과 ] ====
// 10 + 2 = 12
// 10 - 2 = 8
// 10 * 2 = 20
// 10 / 2 = 5
// 10 % 2 = 0

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

 public class Test021
 {
	public static void main(String[] args) throws IOException
	{
		/*
		// 주요 변수 선언
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int a, b;
	

		// 연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		// 결과 출력
		System.out.printf("\n====[결과]====\n");
		System.out.printf("%d + %d = %d\n", a, b, (a+b));
		System.out.printf("%d - %d = %d\n", a, b, (a-b));
		System.out.printf("%d * %d = %d\n", a, b, (a*b));
		System.out.printf("%d / %d = %d\n", a, b, (a/b));
		System.out.printf("%d %% %d = %d\n", a, b, (a%b));
		*/


		// 주요 변수 선언
		int num1, num2;						//-- 사용자 입력값을 담을 변수
		int res1, res2, res3, res4, res5;   //-- 각각의 연산 결과를 담을 변수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		// 연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		num2 = Integer.parseInt(br.readLine());
		
		res1 = num1 + num2;
		res2 = num1 - num2;
		res3 = num1 * num2;
		res4 = num1 / num2;
		res5 = num1 % num2;


		// 결과 출력
		System.out.printf("\n====[결과]====\n");

		System.out.printf("%d + %d = %d\n", num1, num2, res1);
		System.out.printf("%d - %d = %d\n", num1, num2, res2);
		System.out.printf("%d * %d = %d\n", num1, num2, res3);
		System.out.printf("%d / %d = %d\n", num1, num2, res4);
		System.out.printf("%d %% %d = %d\n", num1, num2, res5);		// "%%: → "%"
		
		System.out.printf("==============\n");
	}
 }

 // 실행 결과
 /*
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 2

====[결과]====
10 + 2 = 12
10 - 2 = 8
10 * 2 = 20
10 / 2 = 5
10 % 2 = 0
==============
계속하려면 아무 키나 누르십시오 . . .
 */