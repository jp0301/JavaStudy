/*==============================
      ■■■ 배열 ■■■
    - 배열의 배열(2차원 배열)
  ==============================*/

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열(5*5)을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
  1  2  3  4  5
  6  7  8  9 10
 11 12 13 14 15
 21 22 23 24 25
 계속하려면 아무 키나 누르세요...
*/


public class Test086
{
	public static void main(String[] args)
	{
		//배열의 배열 선언 + 메모리 할당
		int[][] arr = new int[5][5];

		// 변수 선언 및 초기화
		int n = 1;

		for(int i=0; i< arr.length; i++)
		{	
			for(int j=0; j < arr[i].length; j++)
			{
				arr[i][j] = n;
     			//arr[i][j] = i + j + 1;
				n++;
			}
		}
		//------- 여기까지 수행하면 배열의 각 방에 값 담아내기 완료~!!!

		// 전체 요소 출력
		for(int i=0; i< arr.length; i++)
		{	
			for(int j=0; j < arr[i].length; j++)
			{
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}


	}
}