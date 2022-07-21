/*=========================================
      ■■■ 정렬(Sort) 알고리즘 ■■■
  =========================================*/


// ○ 과제
//    사용자로부터 여러 학생의 성적 데이터를 입력받아
//    점수가 높은 학생부터 낮은 순으로 등수를 부여하여
//    결과를 출력하는 프로그램을 구현한다.
//    단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 인원 수 입력 : 5
// 이름 점수 입력(1, 공백 구분) : 장현성 90
// 이름 점수 입력(2, 공백 구분) : 정미경 80
// 이름 점수 입력(3, 공백 구분) : 최동현 85
// 이름 점수 입력(4, 공백 구분) : 조현하 75
// 이름 점수 입력(5, 공백 구분) : 박원석 95
/*
--------------
1등 박원석 95
2등 장현성 90
3등 최동현 85
4등 정미경 80
5등 조현하 75
--------------
계속하려면 아무 키나 누르세요...
*/


import java.util.Scanner;

public class Test110
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n;
		
		System.out.print("인원 수 입력: ");
		n = sc.nextInt();

		String[] name = new String[n];
		int[] score = new int[n];
		int[] rank = new int[n];


		for(int i=0; i < n; i++)
		{
			System.out.printf("이름 점수 입력(%d, 공백 구분) : ", i+1);
			name[i] = sc.next();
			score[i] = sc.nextInt();
		}

		boolean flag;
		String temp;
		int pass = 0;

		do
		{
			flag = false;
			pass++;

		//	for(int i = 1; i < n; i++)
			//{
				for(int j = 0; j < n-pass; j++)
				{
					if(score[j] < score[j+1])
					{
						score[j] = score[j]^score[j+1];
						score[j+1] = score[j+1]^score[j];
						score[j] = score[j]^score[j+1];


						temp = name[j];
						name[j] = name[j+1];
						name[j+1] = temp;

						flag = true;
					}
				}
			//}


		}
		while (flag);


		// 등수
		for(int i = 0; i < n; i++) 
		{
			rank[i] = 1;

			for(int j = 0; j < n; j++)
			{
				if(score[i] < score[j])
					rank[i] += 1;
			}
		}


		System.out.println("--------------");
		for(int i=0; i < n; i++)
		{
			System.out.printf("%d등 %s %3d\n", i+1, name[i], score[i]);
		}
		System.out.println("--------------");


	}
}

// 실행 결과
/*
인원 수 입력: 5
이름 점수 입력(1, 공백 구분) : 호식이 90
이름 점수 입력(2, 공백 구분) : 이기영 50
이름 점수 입력(3, 공백 구분) : 이기철 87
이름 점수 입력(4, 공백 구분) : 용가리 30
이름 점수 입력(5, 공백 구분) : 김맹구 79
--------------
1등 호식이  90
2등 이기철  87
3등 김맹구  79
4등 이기영  50
5등 용가리  30
--------------
계속하려면 아무 키나 누르십시오 . . .
*/