/*=============================================
    ■■■ 실행 흐름의 컨트롤(반복문) ■■■
	 - 반복문 (while문) 실습
  ============================================*/

// 사용자로부터 원하는 단(구구단)을 입력받아
// 해당하는 구구단을 출력하는 프로그램을 구현한다.
// 단, 1단 ~ 9단 사이의 수를 입력받은 상황이 아니라면
// 이에 대한 안내를 한 후 프로그램을 종료할 수 있도록 처리한다.

// 실행 예)
// 원하는 단(구구단) 입력 : 7
// 7 * 1 = 7
// 7 * 2 = 14
//     :
// 7 * 9 = 63
//계속하려면 아무 키나 누르세요...

// 원하는 단(구구단) 입력 : 11
// 1부터 9까지의 정수만 입력이 가능합니다.
//계속하려면 아무 키나 누르세요...



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test054
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		// 내 풀이
		/*
		int num;
		System.out.print("원하는 단(구구단) 입력 : ");
		num = Integer.parseInt(br.readLine());

		int n = 1, result = 0;

		if(num >= 1 && num <= 9){
			while(n < 10)
			{
				result = num * n;
				System.out.printf("%d * %d = %d\n", num, n, result);			
				n++;
			}
		}
		else 
		{
			System.out.println("1부터 9까지의 정수만 입력이 가능합니다.");
		}

		*/

		// 주요 변수 선언 및 초기화
		int dan;	//-- 사용자로부터 입력값을 정수 형태로 담아낼 변수 (단)

		// 연산 및 처리
		System.out.print("원하는 단(구구단) 입력 : ");
		dan = Integer.parseInt(br.readLine());

		if(dan < 1 || dan > 9)
		{
			System.out.println("부터 9까지의 정수만 입력이 가능합니다.");
			return;
		}
		
		int n=0;

		// 결과 출력(반복 출력)
		while(n<9)
		{
			n++;
			System.out.printf("%d * %d = %d\n", dan, n, (dan*n));
		}
	}
}

// 실행 결과
/*
원하는 단(구구단) 입력 : 7
7 * 1 = 7
7 * 2 = 14
7 * 3 = 21
7 * 4 = 28
7 * 5 = 35
7 * 6 = 42
7 * 7 = 49
7 * 8 = 56
7 * 9 = 63
계속하려면 아무 키나 누르십시오 . . .
*/

/*
원하는 단(구구단) 입력 : 11
부터 9까지의 정수만 입력이 가능합니다.
계속하려면 아무 키나 누르십시오 . . .
*/
