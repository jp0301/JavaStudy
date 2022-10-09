/*=============================================
      ■■■ 실행 흐름의 컨트롤(제어문) ■■■
	  - switch 문 실습
  ============================================*/

  // 사용자로부터 1부터 3까지의 정수 중 하나를 입력받아
  // 입력받은 정수만큼의 별문자(★)가 출력되는 프로그램을 작성한다.
  // 단, 두 가지 방법으로 구현할 수 있도록 한다.

  // ① switch 문의 일반 모델을 사용하여 구현한다.
  // ② switch 문의 기본 모델을 사용하되,
  //    『break』를 딱 한 번만 사용할 수 있도록 구현한다.

  // 실행 예)
  // 임의의 정수 입력(1~3) : 3
  // ★★★
  // 계속하려면 아무 키나...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test042
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;

		System.out.print("임의의 정수 입력(1~3) : ");
		num = Integer.parseInt(br.readLine());

		/*
		// ① switch 일반 모델
		switch(num)
		{
			case 3 :
				System.out.println("★★★"); break;
			case 2 :
				System.out.println("★★"); break;
			case 1 :
				System.out.println("★"); break;
			default : 
				System.out.println("입력오류~!!!");
		}
		*/

		// ② switch 기본 모델 - break 딱 한 번만 구현
		switch(num)
		{
			case 3 : System.out.printf("★"); 
			case 2 : System.out.printf("★");
			case 1 : System.out.printf("★\n"); break;
			default : System.out.println("입력오류~!!!"); 
		}
	}
}