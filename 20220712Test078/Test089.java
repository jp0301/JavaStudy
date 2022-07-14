/*==============================
      ■■■ 배열 ■■■
    - 배열의 배열(2차원 배열)
  ==============================*/

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
  1  8   9  16  17 
  2  7  10  15  18 
  3  6  11  14  19 
  4  5  12  13  20
계속하려면 아무 키나 누르세요...
*/

// 웅~  ㅉ                  ㅎ               짝              홀                짝
//  0  0  0  0         1  1  1  1        2  2  2  2      3  3  3  3        4  4  4  4
//  i  i  i  i         i  i  i  i        i  i  i  i      i  i  i  i        i  i  i  i
// 00 10 20 30        31 21 11 01       02 12 22 32     33 23 13 03       04 14 24 34
// j  j  j  j         j  j  j  j        j  j  j  j
// 0  1  2  3         3  2  1  0        0  1  2  3
//     →                  ←              →               ←                →

// 쑝~


public class Test089
{
	public static void main(String[] args)
	{
		int[][] arr = new int[4][5];

		int n = 1;

		for(int i=0; i < 5; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				// 짝수면  0 1 2 3
				if(i % 2 == 0)
				{
					arr[j][i] = n;
				}
				else // 홀수이면  3 2 1 0
				{
					arr[3-j][i] = n;
				}

				n++;

			}
		}



		for(int i=0; i< arr.length; i++)
		{	
			for(int j=0; j < arr[i].length; j++)
			{
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}
}