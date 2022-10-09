/*=====================================
    ■■■ 클래스와 인스턴스 ■■■
	- 직사각형 클래스 설계 실습
  =====================================*/

/*
직사각형의 넓이와 둘레 계산 → 클래스로 표현

클래스의 정체성 → 직사각형의 설계도
클래스의 속성   → 가로, 세로, 넓이, 둘레, 부피, 무게, 재질, 색깔, ...)
클래스의 기능   → 넓이 계산, 둘레 계산, 가로 세로 입력, 결과 출력, (...)

객체를 구성		→ 데이터(속성, 상태) + 기능(동작, 행위)
   ↓                     ↓                    ↓
클래스 설계     →       변수         +       메소드

class 직사각형
{
	//데이터(속성, 상태) → 변수(순서 의미 없음)
	int 가로, 세로;

	// 기능(동작, 행위)  → 메소드(순서 의미 없음)
	가로세로입력()
	{
	}

	둘레계산()
	{
	}

	넓이계산()
	{	
	}

	결과출력()
	{
	}

}
	
*/

import java.util.Scanner;


// ※ 하나의 자바 파일(.java)에 여러 개의 클래스(class)를 설계할 수 있다.
//    하지만, 『public class』는 이 파일 내에서 하나만 올 수 있다.
//    파일을 저장할 때의 이름은
//    이 『public class』의 이름으로 지정해야 한다.
//    일반적으로는(실무적으로는) 하나의 파일에 하나의 클래스를 설계한다.
//    또한, 여러 개의 클래스가 설계된 파일을 컴파일하게 되면
//    내부에 설계된 클래스의 수 만큼 클래스 파일(.class)이 파생된다.

class Rect // 직사각형 클래스 설계
{
	// 데이터(속성, 상태) → 변수(순서 의미 없음)
	// 전역 변수
	int w, h;            // 가로, 세로
	

	// 기능(동작, 행위)  → 메소드(순서 의미 없음)
	void input()   // 가로세로입력()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 입력 : ");
		w = sc.nextInt();

		System.out.print("세로 입력 : ");
		h = sc.nextInt();

	}

	int calLength()    // 둘레계산() → (가로+세로)*2
	{
		return (w+h)*2;
	}

	int calArea()
	{
		// 주요 변수 선언
		int result;
		//연산 및 처리
		result = w * h;
		// 최종 결과 반환
		return result;
	}

	void print(int calLength, int calArea)
	{
		System.out.printf("가로 : %d\n", w);
		System.out.printf("세로 : %d\n", h);
		System.out.printf("넓이 : %d\n", calArea);
		System.out.printf("둘레 : %d\n", calLength);
	}
}


public class Test070
{
	public static void main(String[] args)
	{
		// Rect 클래스 기반의 인스턴스 생성
		Rect ob = new Rect();

		// 입력 메소드 호출
		ob.input();

        // 넓이 연산 메소드 호출
		int area = ob.calArea();
		// 길이 연산 메소드 호출
		int length = ob.calLength();

		// 결과 출력
		ob.print(area, length);
	}
}


// 실행 결과
/*
가로 입력 : 10
세로 입력 : 20
가로 : 10
세로 : 20
넓이 : 60
둘레 : 200
계속하려면 아무 키나 누르십시오 . . .
*/