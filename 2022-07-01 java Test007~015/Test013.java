/*============================================
  ■■■ 자바 기본 프로그래밍 ■■■
  - 변수와 자료형
  - 자바 기본 입출력 : BufferedReader 클래스
=============================================*/

// ○ 퀴즈
//    삼각형의 밑변의 길이와 높이를 사용자로부터 입력받아
//    이 삼각형의 넓이를 구하는 프로그램을 구현한다.

// 실행 예)
// ■ 삼각형 넓이 구하는 프로그램 ■
//  - 삼각형의 밑변 입력 : 
//  - 삼각형의 높이 입력 :

// >> 밑변이 3, 높이가 5인 삼각형의 넓이 : xxxx
// 계속하려면 아무 키나 누르세요...

// ※ 문제 인식 및 분석
//    삼각형의 넓이 = 밑변 * 높이 / 2
//    사용자로부터 데이터를 입력받아 처리 → BufferedReader 활용
//    BufferedReader 를 여러 개 사용? 한 개 사용?



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args) throws IOException
	{
		

		// 내 풀이 ---------------------------------------------------------------------------
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		// 주요 변수 선언
		int a, b;
		double area;



		// 연산 및 처리
		System.out.print("삼각형의 밑변 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("삼각형의 높이 입력 : ");
        b = Integer.parseInt(br.readLine());

		area = (double) a * b / 2;



		// 결과 출력
		System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형의 넓이 : %.2f%n", a, b, area);
		*/



		// 함께한 풀이 -----------------------------------------------------------------------

		// 주요 변수 선언

		//BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 밑변 높이 넓이
		int underLength, height;			//-- 밑변과 높이
		double area;						//-- 넓이			check~!!!
		
		

		// 연산 및 처리
		// ① 사용자에게 안내 메세지 출력
		System.out.println("■ 삼각형 넓이 구하는  프로그램 ■");
		System.out.print("- 삼각형의 밑변 입력 : ");
		
		// ② 사용자가 입력한 데이터(문자열)를 정수 형태로 변환한 후
		//    변수 underLength에 담아내기
		underLength = Integer.parseInt(br.readLine());
		
		// ③ 다시 사용자에게 안내 메세지 출력
		System.out.print("- 삼각형의 높이 입력 : ");
        
		// ④ 사용자가 입력한 데이터(문자열)를 정수 형태로 변환한 후
		//    변수 height에 담아내기
		height = Integer.parseInt(br.readLine());

		
		// ⑤ 삼각형의 넓이 구하는 연산 처리
		//    삼각형의 넓이 = 밑변 * 높이 / 2
		//area = underLength * height / 2;
		//                 정수형     정수형 / 정수형 → 정수 기반 연산
		//												 (즉, 몫을 취하고 나머지는 버림)
		area = underLength * height / 2.0;				//check~!!!
		//                 정수형     정수형 / 실수형 → 실수 기반 연산

		// ※ 실수 자료형이 결과값으로 나오는 과정에서
		// 실수 기반의 연산이 필요한 상황이다.
		// 정수형 『2』가 아닌, 실수형으로 『2.0』으로 나눗셈 연산을 수행하게 되면
		// 이 연산은 실수 기반으로 처리된다.


		// area = (double)(underLength * height / 2);		//--(X)
		// area = (double)underLength * height / 2;			//--(O)
		// area = underLength * (double)height / 2;			//--(O)
		// area = (double)(underLength * height) / 2;		//--(O)

		// 결과 출력
		System.out.println();	// 개행
		//System.out.print();	//-- 에러 발생(컴파일 에러)

		System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형의 넓이 : %.2f%n", underLength, height, area);
		
		
		
	}
}

// 실행 결과

/*
■ 삼각형 넓이 구하는  프로그램 ■
- 삼각형의 밑변 입력 : 3
- 삼각형의 높이 입력 : 5

>> 밑변이 3, 높이가 5인 삼각형의 넓이 : 7.50
계속하려면 아무 키나 누르십시오 . . .
*/