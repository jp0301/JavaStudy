/*==============================================
    ■■■ 실행 흐름의 컨트롤(반복문) ■■■
	 - 반복문 (for 문) 실습
  =============================================*/

// 다중 for문(반복문의 중첩)을 활용한 별찍기 실습

// ○ 과제
//    다음과 같은 내용이 출력될 수 있도록
//    반복문의 중첩 구문을 작성하여 프로그램을 구현한다.

// 실행 예)
/*


*********
 *******
  *****
   ***
    *

*/


public class Test063
{
	public static void main(String[] args)
	{
		for(int i=4; i>=0; i--)
		{

			for(int j=4; j > i; j--)  
			{
				System.out.print(" ");	
			}							


			for(int k = 1; k <= (i*2)+1; k++)
			{
				System.out.print("*");
			}

			System.out.println();
		}

		/* Test062 를 반대로 생각해본다.

			063에서는
			
			▶ i = 4일 때
			   → 첫 번째 for문 : j=4; 4 > 4;
									    → 충족하지 못하므로 첫 번째 for문 끝!

			   → 두 번째 for문 : k=1; k <= (4*2)+1; → k <= 9 → 1 <= 9
				   			   							            → "*" 출력
															             → k++ 로 인해 k=2
																  2 <= 9;
				   			   							            → "*" 출력
															             → k++ 로 인해 k=3
																  3 <= 9;
				   			   							            → "*" 출력
															             → k++ 로 인해 k=4
																		 :
																		 :
																  9 <= 9;
				   			   							            → "*" 출력
															             → k++ 로 인해 k=10
																  10<=9;
 																    → 충족하지 못하므로 두 번째 for문 끝!

			   → 그럼 i=4 일 때 "*********" → 별 9번 출력됨

				
			▶ i = 3일 때
			   → 첫 번째 for문 : j=4; 4 > 3;
			   							→ " " 출력
									           → j-- 로 인해 j=3
									   3 > 3;
									    → 충족하지 못하므로 첫 번째 for문 끝!

			   → 두 번째 for문 : k=1; k <= (3*2)+1; → k <= 7 → 1 <= 9
																	→ "*" 출력
																		 → k++ 로 인해 k=2
																  2 <= 9;
																	→ "*" 출력
																		 → k++ 로 인해 k=3
																  3 <= 9;
																	→ "*" 출력
																		 → k++ 로 인해 k=4
																		 :
																		 :
																  7 <= 7;
																	→ "*" 출력
																		 → k++ 로 인해 k=10
																  8<=7;
																	→ 충족하지 못하므로 두 번째 for문 끝!

			   → 그럼 i=3 일 때 " *******" → 공백 " " 한 칸이랑 "*" 7번 출력됨

		*/
	}
}

//실행 결과

/*
*********
 *******
  *****
   ***
    *
계속하려면 아무 키나 누르십시오 . . .
*/