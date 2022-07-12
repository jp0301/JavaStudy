/*====================================
    ■■■ 클래스와 인스턴스 ■■■
  ====================================*/

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산을 수행하는 프로그램을 구현한다.
// 단, 클래스와 인스턴스의 개념을 활용하여 작성할 수 있도록 한다.
// (Calculate 클래스 설계)

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 10 5
// 임의의 연산자(+ - * /)         : +
// >> 10 + 5 = 15
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	int num1, num2;		//-- 두 정수 담아낼 변수
	char op;			//-- 연산자 담아낼 변수


	// 메소드 정의(기능 : 입력)
	void input() throws IOException
	{
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		System.out.print("임의의 연산자(+ - * /) : ");
		op = (char)System.in.read();
	}

	// 메소드 정의(기능 : 연산) 나눗셈 연산도 정수 기반으로 처리하자
	int calculate()
	{
		//int cal = 0;
		int result = -1;
		/*
		if(op == '+')
			cal = num1 + num2;
		else if(op == '-')
			cal = num1 - num2;
		else if(op == '*')
			cal = num1 * num2;
		else if(op == '/')
			cal = num1 / num2;
		else
			System.out.println("연산자 오류");
		*/

		switch(op)
		{
			case '+': result = num1 + num2; break;
			case '-': result = num1 - num2; break;
			case '*': result = num1 * num2; break;
			case '/': result = num1 / num2; break;
			//default : result = -1;

		}
		return result;
	}

	// 메소드 정의(기능 : 출력)
	void print(int result)
	{
		System.out.printf(">> %d %c %d = %d\n", num1, op, num2, result);
	}
}



public class Test073
{
	public static void main(String[] args) throws IOException
	{
		// Calculate 인스턴스 생성
		Calculate ob = new Calculate();

		ob.input(); // 생성한 인스턴스를 통한 입력 메소드 호출
		//ob.print(ob.calculate()); 
		int r = ob.calculate(); // 생성한 인스턴스를 통한 연산 메서드호출
		ob.print(r);
	}
}

// 실행 결과
/*
임의의 두 정수 입력(공백 구분) : 10 5
임의의 연산자(+ - * /) : -
>> 10 - 5 = 5
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 두 정수 입력(공백 구분) : 20 5
임의의 연산자(+ - * /) : *
>> 20 * 5 = 100
계속하려면 아무 키나 누르십시오 . . .
*/