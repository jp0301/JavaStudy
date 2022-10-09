/*=========================================
      ■■■ 정렬(Sort) 알고리즘 ■■■
  =========================================*/

// 향상된 버블 정렬(Bubble Sort)

//  ※ 앞에서 본 Selection Sort(Test107) 나 Bubble Sort(Test108) 의 성능은 같다.
//     (→ 성능의 추정 근거 : 반복문을 수행한 횟수)
//     하지만, 향상된 Bubble Sort 는 대상 데이터의 구조에 따라서
//     일반 Bubble Sort 나 Selection Sort 에 비해 성능이 좋을 수 있다.

// 원본 데이터 : 61 15 20 22 30
//				 15 20 22 30 61 - 1회전 (스왑 발생 → true)  → 다음 회전 진행 ○
//				 15 20 22 30 61 - 2회전 (스왑 발생 → false) → 다음 회전 진행 Ⅹ

//== 1회전 수행... 2회전 수행... 을 해보았더니...
//   2회전에서 스왑(자리바꿈)이 전혀 일어나지 않았기 때문에
//   불필요한 추가 연산(더 이상의 회전)은 무의미한 것으로 판단하여
//   수행하지 않는다.


// 실행 예)
// Source Data : 10 50 20 30 40
// Sorted Data : 10 20 30 40 50
// 계속하려면 아무 키나 누르세요...


public class Test109
{
	public static void main(String[] args)
	{
		int[] a = {10, 50, 20, 30, 40};	

		/*
		10 50 20 30 40
		== --

		10 20 50 30 40
		   == --

		10 20 30 50 40
		      == --

		10 20 30 40 50
		         == --
		------------------- 1회전 → 스왑 발생
		
		10 20 30 40 50
		== --

		10 20 30 40 50
		   == --

		10 20 30 40 50
		      == --
		-------------------- 2회전  → 스왑 발생하지 않음
			Ⅹ
			Ⅹ
		-------------------- 3회전  → Ⅹ
			Ⅹ
		-------------------- 4회전  → Ⅹ
		*/


		System.out.print("Sorted Data : ");
		for(int item : a)
			System.out.print(item + " ");
		System.out.println();


		/*
		// 향상된 Bubble Sort 구현
		boolean swapCheck;

		for(int i=1; i< a.length; i++)
		{
			swapCheck = false;

			for(int j=0; j < a.length - i; j++)
			{
				//스왑 전 출력 확인
				System.out.println("바꾸기 전 : " + a[j] + " " + a[j+1]);

				if(a[j] > a[j+1]) 
				{
					a[j] = a[j]^a[j+1];
					a[j+1] = a[j+1]^a[j];
					a[j] = a[j]^a[j+1];

					//스왑 후 출력 확인 
					System.out.println(">> 바꾼 후 : " + a[j] + " " + a[j+1]);

					swapCheck = true;
				}
			}

			if(swapCheck == true)
				break;
		}
		*/
		


		// 향상된 Bubble Sort 구현
		boolean flag;
		int pass = 0;

		do
		{
			flag = false;
			pass++;

			for(int i = 0; i < a.length - pass; i++)
			{
				if(a[i] > a[i+1])
				{
					// 자리 바꿈
					a[i] = a[i]^a[i+1];
					a[i+1] = a[i+1]^a[i];
					a[i] = a[i]^a[i+1];

					flag = true;
					//-- 단 한번이라도 스왑이 발생하게 되면
					//   flag 변수는 true로 변경~!!!
				}
			}
		}
		while (flag == false);
		//-- flag 변수가 false 라는 것은
		//   회전이 구분적으로 발생하는 동안 스왑이 일어나지 않은 경우로
		//   더 이상의 반복문 수행은 무의미한 것으로 판단 가능~!!!
		
		System.out.print("Sorted Data : ");
		for(int item : a)
			System.out.print(item + " ");
		System.out.println();
	

	}
}

// 실행 결과
/*
Sorted Data : 10 50 20 30 40
Sorted Data : 10 20 30 40 50
계속하려면 아무 키나 누르십시오 . . .
*/