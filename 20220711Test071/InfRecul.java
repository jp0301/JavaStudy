/* ===================================
    ■■■ 메소드의 재귀호출 ■■■
======================================*/


/*  여기서 코드 내에서 2군데 위치 바꾸기
	public static void showHi(int cnt)
	{
		System.out.println("Hi~");
		showHi(cnt--);
		if(cnt==1)
			return;
	}

	※ 문제점
	1. showHi(cnt--)가 조건문보다 위에 있으니 멈추지 않는다.
	   → 조건문을 위로 올린다.
	2. showHi(cnt--)이기에 cnt값이 들어가고 난 뒤에 1씩 감소된다.
	   → showHi(--cnt);
*/


public class InfRecul
{
	public static void main(String[] args)
	{
		showHi(3);
	}

	// 코드 내에서 2군데 위치 바꾸기

	public static void showHi(int cnt)
	{
		System.out.println("Hi~");

		if(cnt==1)
			return;

		showHi(--cnt);
	}
}


// 재귀 반복
/*
	public static void showHi(3)
	{
		System.out.println("Hi~");  // 출력

		if(3==1)
			return;					// (x)

		showHi(--3);				// showHi(2);
	}
*/

/*
	public static void showHi(2)
	{
		System.out.println("Hi~");  // 출력

		if(2==1)
			return;					// (x)

		showHi(--2);				// showHi(1);
	}		
*/

/*
	public static void showHi(1)
	{
		System.out.println("Hi~");  // 출력

		if(1==1)
			return;					// (o)

		showHi(--cnt);
	}
*/

// 실행 결과
/*
Hi~
Hi~
Hi~
계속하려면 아무 키나 누르십시오 . . .
*/