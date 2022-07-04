 /*=============================================
      ■■■ 연산자(Operator) ■■■
      - 비트 단위 연산자
   =============================================*/

public class Test023
{
	public static void main(String[] args)
	{
		int a = 13, b = 7;
		int c, d, e;

		c = a & b;
		d = a | b;
		e = a ^ b;

		System.out.printf("a & b : %d\n", c); // AND
		System.out.printf("a | b : %d\n", d); // OR
		System.out.printf("a ^ b : %d\n", e); // XOR

	}
}

// 실행 결과

/*
a & b : 5
a | b : 15
a ^ b : 10
계속하려면 아무 키나 누르십시오 . . .
*/

/*
13 = 00001101
7  = 00000111

	 13 → 00001101 
	& 7 → 00000111
	----------------
	  5 → 00000101


	 13 → 00001101 
	| 7 → 00000111
	----------------
	 15 → 00001111


	 13 → 00001101 
	^ 7 → 00000111
	----------------
	 10 → 00001010

*/