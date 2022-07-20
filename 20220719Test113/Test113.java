/*===============================
      ■■■ 클래스 고급 ■■■
	  - 상속(Inheritance)
  ===============================*/

// 다음과 같은 프로그램을 구현한다.
// 단, 상속의 개념을 적용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 20 15
// 연산자 입력(+ - * /) : -
// >> 20 - 15 = 5
// 계속하려면 아무 키나 누르세요...

//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Aclass
{
	protected int x, y;
	protected char op;

	Aclass()
	{
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
}


// Aclass 를 상속받는 클래스로 설계
class Bclass extends Aclass
{
	/* 상속 받은 것들
	protected int x, y;
	protected char op;

	// 생성자는 상속의 대상에서 제외

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
	*/

	Bclass()
	{
		// super();
	}

	// 데이터를 입력받아오는 메소드
	boolean input() throws IOException
	{
		/*
		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		x = sc.nextInt();
		y = sc.nextInt();

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("임의의 두 정수 입력(공백 구분) : ");	// "20 15"
		String temp = br.readLine();

		// ※ 문자열.split("구분자");
		//    문자열.split("\\s");		//-- 구분자 → 공백
		//    ex) "10 20 30 40 50".split("\\s");
		//         → 반환 → {"10", "20", "30", "40", "50"}
		//    ex) "010-1234-4567".split("-");
		//         → 반환 → {"010", "1234", "4567"}
		
		String[] strArr = temp.split("\\s");

		if(strArr.length != 2)
			return false;
		//-- false 를 반환하며 input() 메소드 종료
		//   이 조건을 만족하여 if 문을 수행하게 될 경우...
		//   아래 수행해야 할 코드가 남아있더라도
		//   결과값(false)을 반환하며 메소드는 종료된다.

		x = Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);
		
		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();
		
		/*
		if(op != '+' && op != '-' && op != '*' && op != '/')
			return false;
		*/

		//반전 - 부정의 조건식은 고민을 좀 해봐야한다.
		
		if(op == '+' || op == '-' || op == '*' || op == '/')
			return true;
		
		return false;

	} // close input()


	double calc()
	{
		double result = 0.0;

		switch(op)
		{
			case '+': result = x + y; break;
			case '-': result = x - y; break;
            case '*': result = x * y; break;
            case '/': result = (double)x / y; //break;
		}

		return result;

	} // end calc()

	/*
	@Override
	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
	*/
	
} // close class Bclass


// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test113
{
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();

		// ob.input();

		if (!ob.input())
		{
			System.out.println("Error...");
			return;
		}

		double result = ob.calc();

		ob.write(result);

	}
}

// 실행 결과
/*
임의의 두 정수 입력(공백 구분) : 11 6
연산자 입력(+ - * /) : *
>> 11 * 6 = 66.00
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 두 정수 입력(공백 구분) : 22 6
연산자 입력(+ - * /) : /
>> 22 / 6 = 3.67
계속하려면 아무 키나 누르십시오 . . .
*/