/*============================================
   ■■■ 자바 기본 프로그래밍 ■■■
   - 자바 기본 입출력 : System.in.read()
=============================================*/

/*
『System.in.read()』 메소드는 (입력 대기열로부터) 한 문자만 가져온다.
단, 입력받은 하나의 문자를 문자 그대로 가져오는 것이 아니라
ASCII Code 값으로 반환한다.
*/

// 실행 예)
// 한 문자 입력		 : A
// 한 자리 정수 입력 : 9

// >> 입력한 문자 : A
// >> 입력한 정수 : 9
//계속하려면 아무 키나 누르세요...

import java.io.IOException;

public class Test015
{
	public static void main(String[] args) throws IOException
	{
			/*
			// 주요 변수 선언
			char ch;			//-- 문자
			

			// 연산 및 처리
			System.out.print("문자 하나 입력하세요 : ");				// A
			ch = (char)System.in.read();								// 65
			//ch = 65, int형이기때문에 자동 형 변환 규칙에 위배된다.
			
			// 결과 출력
			System.out.println(ch);
			*/


	
			// 주요 변수 선언
			char ch;				//-- 입력받은 문자를 담을 변수
			int n;					//-- 입력받은 정수를 담을 변수

			// 추가 변수 선언
			//char temp;				//-- 임시로 추가 선언한 변수

			
			// 연산 및 처리
			// - 사용자에게 안내 메세지 출력
			System.out.print("한 문자 입력      : ");
			ch = (char)System.in.read();
			// enter키도 입력되는데 enter키는 (\r + \n) 합쳐진 키 다.
			// A + \r + \n 이 된다. 문자 하나만 데려오는 것이다 보니 A만 데려오니 나머지 둘이 입력대기열에 잔류하게되기 때문
			// 그런다음 밑의 한자리 정수 입력에서 다시 in.read()가 나오게되면서 \r, \n이 튀어나옴


			
			// 입력 대기열에 남아있는 『\r』과  『\n』을 스킵(건너뛰기)
			System.in.skip(2);
			//-- 매개변수(2)에 의해 두 글자를 읽어내지 않고 건너뛴다.(버린다.)


			System.out.print("한 자리 정수 입력 : ");
			//n = System.in.read();
			//temp = (char)System.in.read();
			n = System.in.read();

			// 1 → 49
			// 2 → 50
			// 3 → 51
			//   :
			// 9 → 57

			// 입력받은  n의 값을 48만큼 감소시켜라~!!!
			n -= 48;

			// 결과 출력
			System.out.println(">> 입력한 문자 : " + ch);
			//System.out.println(">> 입력한 정수 : " + n);
			//System.out.println(">> 입력한 정수 : " + temp);

			System.out.println(">> 입력한 정수 : " + n);
	}
}



// 실행 결과
/*
한 문자 입력      : A
한 자리 정수 입력 : 9
>> 입력한 문자 : A
>> 입력한 정수 : 9
계속하려면 아무 키나 누르십시오 . . .
*/