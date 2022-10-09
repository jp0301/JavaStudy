/*=============================================
      ■■■ 실행 흐름의 컨트롤(제어문) ■■■
	  - switch 문 실습
  ============================================*/

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현한다
// 단, switch 문을 활용한 처리할 수 있도록 하며,
// 연산 결과는 편의상 정수 형태로 처리할 수 있도록 한다.

// 실행 예)
// 첫 번째 정수 입력 : 3
// 두 번째 정수 입력 : 17
// 연산자 입력[+ - * /] : -

// 3 - 17 = -14
// 계속하려면 아무 키나 ...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test043
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		/* ① ---------------------------------------------------------------
		int num1, num2, op, result;
		//char op;

		System.out.print("첫 번째 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		num2 = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력[+ - * /] : ");
		
		//op = (char)System.in.read();
		op = System.in.read();

		
		switch(op)
		{
			case 43 : result = num1 + num2; break;
			case 45 : result = num1 - num2; break;
			case 42 : result = num1 * num2; break;
			case 47 : result = num1 / num2; break;
			default : return;							// 1. 값의 반환
														// 2. 메소드를 종료시킨다. → 종료 대상은 main() 메소드 → 프로그램 종료
		}

		System.out.println();
		System.out.printf(">> %d %c %d = %d\n", num1, op, num2, result);

		*/

		


		// ② ---------------------------------------------------------------
		int a, b, result;
		char op;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력[+ - * /] : ");
		op = (char)System.in.read();

		switch(op)
		{
			case '+' : result = a + b; break;
			case '-' : result = a - b; break;
			case '*' : result = a * b; break;
			case '/' : result = a / b; break;
			default : return;
		}
		
		System.out.println();
		System.out.printf(">> %d %c %d = %d\n", a, op, b, result);
		
	}
}
// 실행 결과
/*
첫 번째 정수 입력 : 14
두 번째 정수 입력 : 6
연산자 입력[+ - * /] : -

>> 14 - 6 = 8
계속하려면 아무 키나 누르십시오 . . .
*/