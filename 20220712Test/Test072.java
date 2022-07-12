/*====================================
    ■■■ 클래스와 인스턴스 ■■■
  ====================================*/

// 사용자로부터 임의의 정수를 입력받아
// 1부터 입력받은 수 까지의 합을 연산하여
// 결과값을 출력하는 프로그램을 구현한다.

// 단, 지금까지처럼 main() 메소드에 모든 기능을 적용하는 것이 아니라
// 클래스와 인스턴스의 개념을 활용하여 처리할 수 있도록 한다.
// (Hap 클래스 설계)
// 또한, 데이터 입력 처리 과정에서 BufferedReader 의 readLine() 을 사용하며,
// 다시 입력받을 수 있는 처리를 포함하여 프로그램을 구현할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력(1~1000) : 1050
// 임의의 정수 입력(1~1000) : -45
// 임의의 정수 입력(1~1000) : 100
// >> 1 ~ 100 까지의 합 : 5050
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap
{
	int num;

	// 입력 메소드
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
			System.out.print("임의의 정수 입력(1~1000) : ");
			num = Integer.parseInt(br.readLine());
		}
		while (num < 1 || num > 1000);

	}

	// 누적합 메소드
	// 앞으로 메소드를 정의할 때 ( int result = 0; return result; ) 먼저 나오면 리턴 자료형은 바로 int!
	int calHap()
	{
		int result = 0;

		for(int i = 1; i <= num; i++)
		{
			result += i;
		}

		return result;
	}


	// 결과 출력 메소드
	void print(int sumResult)
	{
		System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", num, sumResult);
	}
}


public class Test072
{
	public static void main(String[] args) throws IOException
	{
		// Hap 인스턴스 생성
		Hap ob = new Hap();
		
		// 생성한 인스턴스를 통해 입력 메소드 호출 → input()
		// ----------------------
		//     참조변수 활용
		// Hap.input()도 이미 누가 가져갔기 때문에 참조변수 활용
		ob.input();			//-- new Hap().input()

		// 생성한 인스턴스를 통해 연산 처리 메소드 호출 → calculate()
		int sum = ob.calHap();
		
		// 생성한 인스턴스(ob)를 통해 출력 메소드 호출 → print()
		ob.print(sum);
		// ob.print(ob.calHap());
	}
}

// 실행 결과
/*
임의의 정수 입력(1~1000) : 1050
임의의 정수 입력(1~1000) : -45
임의의 정수 입력(1~1000) : 100
1 ~ 100 까지의 합 : 5050
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 정수 입력(1~1000) : 5
1 ~ 5 까지의 합 : 15
계속하려면 아무 키나 누르십시오 . . .
*/