/*==============================
      ■■■ 배열 ■■■
    - 배열의 배열(2차원 배열)
  ==============================*/

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
   E J O T Y     		69  74  79  84  89
   D I N S X     		68  73  78  83  88
   C H M R W   	        67  72  77  82  87
   B G L Q V 	    	66  71  76  81  86
   A F K P U       		65  70  75  80  85

계속하려면 아무 키나 누르세요...
*/


public class Test090
{
	public static void main(String[] args)
	{
		char[][] arr = new char[5][5];

		char ch = 'A';  //65
		

		for(int i = 0; i < 5; i++)
		{

			/*
			for(int j = 4; j > 0; j--)
			{
				arr[j][i] = ch;
				ch++;
			}
			*/
			for(int j = 0; j < 5; j++)
			{					 
				arr[4-j][i] = ch++;
			}
		}

        // ji ji ji ji
		// 40 30 20 10 / 41 31 21 11 / 42 32 22 12 / 43 33 23 13  / 44 34 24 14


		// 전체 요소 출력
		for(int i=0; i< arr.length; i++)
		{	
			for(int j=0; j < arr[i].length; j++)
			{
				System.out.printf("%3c", arr[i][j]);
			}
			System.out.println();s
		}
	}
}

// 실행 결과
/*
 System.out.printf("%3c", arr[i][j]);
  E  J  O  T  Y
  D  I  N  S  X
  C  H  M  R  W
  B  G  L  Q  V
  A  F  K  P  U
계속하려면 아무 키나 누르십시오 . . .
*/