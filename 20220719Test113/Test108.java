/*=========================================
      ■■■ 정렬(Sort) 알고리즘 ■■■
  =========================================*/

/*
○ 정렬
   : 데이터를 특정한 규칙(기준)에 맞게 순서대로 나열(오름차순, 내림차순)

○ 정렬의 목적
   : 데이터 처리 과정의 편의성이나 가독성을 높이기 위함
     → 보기 좋게... 검색하기 위함

   ※ 리소스 소모가 굉장히 심한 작업, 시스템 부하가 심하다.

○ 정렬의 종류
   : 선택 정렬, 버블 정렬, 삽입 정렬, 힙 정렬, 퀵 정렬, 쉘 정렬, ..........

*/

// 버블 정렬(Bubble Sort)


// 실행 예)
// Source Dara : 52 42 12 62 60
// Sorted Data : 12 42 52 60 62
// 계속하려면 아무 키나 누르세요....

public class Test108
{
	public static void main(String[] args)
	{
		int[] a = {52, 42, 12, 62, 60};

		/*
		52, 42, 12, 62, 60  → a[0] a[1] 비교
		==  --

		42, 52, 12, 62, 60  → a[1] a[2] 비교
			==  --	    

		42, 12, 52, 62, 60  → a[2] a[3] 비교
                ==  --
		
		42, 12, 52, 60, 62  → a[3] a[4] 비교
		            ==  --

		----------------------------- 1회전

		12, 42, 52, 60, 62  → a[0] a[1] 비교
		==  --

		12, 42, 52, 60, 62  → a[1] a[2] 비교
			==  --

		12, 42, 52, 60, 62  → a[2] a[3] 비교
				==  --
		----------------------------- 2회전

		12, 42, 52, 60, 62  → a[0] a[1] 비교
		==  --

		12, 42, 52, 60, 62  → a[1] a[2] 비교
			==  --
		----------------------------- 3회전

		12, 42, 52, 60, 62  → a[0] a[1] 비교
		==  --
		----------------------------- 4회전
		*/


		System.out.print("Source Data : ");
		for(int item : a)
			System.out.print(item + " ");
		System.out.println();


		//Bubble Sort
		for(int i=1; i< a.length; i++) //1~4
		{
			for(int j=0; j < a.length - i; j++)  //i = 1 → 0 1 2 3
												 //i = 2 → 0 1 2
												 //i = 3 → 0 1 
												 //i = 4 → 0
			{
				if(a[j] > a[j+1])
				{
					a[j] = a[j]^a[j+1];
					a[j+1] = a[j+1]^a[j];
                    a[j] = a[j]^a[j+1];
				}
			}
		}



		System.out.print("Sorted Data : ");
		for(int item : a)
			System.out.print(item + " ");
		System.out.println();
	}
}