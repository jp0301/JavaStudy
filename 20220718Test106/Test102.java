/*=======================================
      ■■■ 클래스와 인스턴스 ■■■
	  - 클래스와 인스턴스 활용
  ======================================*/

// 1 ~ 3 사이의 난수를 발생시켜서
// 가위, 바위, 보 게임 프로그램을 구현한다.
// 단, 클래스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한, 배열을 활용하여 처리할 수 있도록 한다.
// 최종적으로 RpsGame 클래스를 완성할 수 있도록 한다.

// ※ 기준 데이터 → 1: 가위, 2: 바위, 3: 보

// 실행 예)
// 1: 가위, 2: 바위, 3:보 중 입력(1~3) : 4
// 1: 가위, 2: 바위, 3:보 중 입력(1~3) : 4
// 1: 가위, 2: 바위, 3:보 중 입력(1~3) : 4

// - 유저   : 바위
// - 컴퓨터 : 보

// >> 승부 최종 결과 : 컴퓨터가 이겼습니다~!!!
// 계속하려면 아무 키나 누르세요...


import java.util.Random;
import java.util.Scanner;


class RpsGame
{
	private int user;
	private int computer;


	// 컴퓨터 1~3 난수 발생 메소드
	public void randomNum()
	{
		Random rd = new Random();
		computer = rd.nextInt(3)+1; // 0 1 2 → +1 → 1 2 3
	}


	// 입력 메소드
	public void input()
	{
		// 유저가 가위바위보 하기 전에... 컴퓨터(주최측) 먼저 가위바위보
		randomNum();

		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1: 가위, 2: 바위, 3: 보 중 입력(1~3) : ");
			user = sc.nextInt();
		}
		while (user < 1 || user > 3);
	}



	// 중간 결과 출력
	public void middleCalc()
	{
		String[] str = {"가위", "바위", "보"};

		System.out.println();
		System.out.println(" - 유저   : " + str[user-1]);
		System.out.println(" - 컴퓨터 : " + str[computer-1]);
		System.out.println();
	}


	// 승부에 대한 최종 결과 연산
	public String resultCalc()
	{
		String result = "무승부 입니다~!!!";
		
		// 유저가 이기는 상황
		// 유저=="가위" && 컴=="보"   || 유저 =="바위" && 컴=="가위" || 유저=="보" && 컴=="바위"
		if(user == 1 && computer == 3 || user == 2 && computer == 1 || user == 3 && computer == 2)
			result = "유저가 이겼습니다~!!!";

		// 컴퓨터가 이기는 상황
		// 가위 && 바위 || 바위 && 보 || 보 && 가위
		else if(user == 1 && computer == 2 || user == 2 && computer == 3 || user == 3 && computer == 1)
			result = "컴퓨터가 이겼습니다~!!!";

		return result;
	}

	// 결과 출력 메소드
	public void print(String str)
	{
		System.out.println(">> 승부 최종 결과 : " + str);
	}
}

public class Test102
{
	public static void main(String[] args)
	{
		RpsGame ob = new RpsGame();

		ob.randomNum();
		ob.input();
		ob.middleCalc();

		String result = ob.resultCalc();

		ob.print(result);
	}
}



// 실행 결과
/*
1: 가위, 2: 바위, 3: 보 중 입력(1~3) : 4
1: 가위, 2: 바위, 3: 보 중 입력(1~3) : -2
1: 가위, 2: 바위, 3: 보 중 입력(1~3) : 2

 - 유저   : 바위
 - 컴퓨터 : 가위

>> 승부 최종 결과 : 유저가 이겼습니다~!!!
계속하려면 아무 키나 누르십시오 . . .
*/


/*
1: 가위, 2: 바위, 3: 보 중 입력(1~3) : 2

 - 유저 : 바위
 - 컴퓨터 : 보

>> 승부 최종 결과 : 컴퓨터가 이겼습니다~!!!
계속하려면 아무 키나 누르십시오 . . .
*/


/*
1: 가위, 2: 바위, 3: 보 중 입력(1~3) : 3

 - 유저 : 보
 - 컴퓨터 : 보

>> 승부 최종 결과 : 무승부 입니다~!!!
계속하려면 아무 키나 누르십시오 . . .
*/




