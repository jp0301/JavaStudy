/*==============================
      ■■■ 배열 ■■■
    - 배열의 배열(2차원 배열)
  ==============================*/

// ○ 과제
// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
 A
 C B         // 역방향
 D E F
 J I H G     // 역방향
 K L M N O

계속하려면 아무 키나 누르세요...
*/


public class Test094
{
	public static void main(String[] args)
	{


		int[][] arr = new int[5][5];
		char ch='A';
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				if(i % 2 == 0) // 짝수 줄 정방향
				{
					arr[i][j] = ch;
				}
				else // 홀수 줄 역방향
				{
					arr[i][i-j] = ch; 
				}
				ch++;
			}
		}


		/*
		 00
		 11 10
		 22 21 20
		 33 32 31 30
		 44 43 32 41 40
		*/

		// i = 0일 때 arr[0][0-0] → arr[0][0]    i = 1일 때 arr[1][1-0] → arr[1][1]
		//            				             			 arr[1][1-1] → arr[1][0]


		// 배열의 배열 전체 출력 구문
		for(int i=0; i< arr.length; i++)
		{	
			for(int j=0; j < arr[i].length; j++)
			{
				System.out.printf("%2c", arr[i][j]);
			}
			System.out.println();
		}


	}
}