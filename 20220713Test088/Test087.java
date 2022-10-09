/*==============================
      ■■■ 배열 ■■■
    - 배열의 배열(2차원 배열)
  ==============================*/

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
  1  2  3  4  5
  2  3  4  5  6
  3  4  5  6  7
  4  5  6  7  8
  5  6  7  8  9
계속하려면 아무 키나 누르세요...
*/

public class Test087
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];

		int n = 1;

		for(int i=0; i< arr.length; i++)
		{	
			n = i + 1;
			for(int j=0; j < arr[i].length; j++)
			{
				arr[i][j] = n;
				n++;
			}
		}

		for(int i=0; i< arr.length; i++)
		{	
			for(int j=0; j < arr[i].length; j++)
			{
				System.out.printf("%2d", arr[i][j]);
			}
			System.out.println();
		}

	}
}

// 실행 결과

/*
 1 2 3 4 5
 2 3 4 5 6
 3 4 5 6 7
 4 5 6 7 8
 5 6 7 8 9
계속하려면 아무 키나 누르십시오 . . .
*/