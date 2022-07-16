/*=======================================
      ■■■ 클래스와 인스턴스 ■■■
	  - 클래스와 인스턴스 활용
  ======================================*/

// 학생별로 국어점수, 영어점수, 수학점수를 입력받아
// 총점, 평균을 계산하는 프로그램을 구현한다.
// 단, 클래스의 개념을 활용하여 작성할 수 있도록 한다.
// 또한, 이 과정에서 배열을 적극적으로 활용할 수 있도록 한다.
// 클래스 설계는 다음의 가이드라인에 따라 진행할 수 있도록 한다.

// [가이드라인]
// 프로그램을 구성하는 클래스
// 1. Record 클래스
//    - 속성만 존재하는 클래스로 설계할 것~!!!

// 2. Sungjuk 클래스
//    - 인원 수를 입력받아, 입력받은 인원 수 만큼
//      이름, 국어점수, 영어점수,  수학점수를 입력받고
//      총점과 평균을 산출하는 클래스로 설계할 것
//      ·속성 : 인원수, Record 타입의 배열                    (Record[] recArr;)
//      ·기능 : 인원수 입력, 상세 데이터 입력, 총점 및 평균 연산, 결과 출력


// 3. Test101 클래스
//    - main() 메소드가 존재하는 외부 클래스로 설계할 것~!!!

// 실행 예)
// 인원 수 입력(1~100) : 102
// 인원 수 입력(1~100) : -10
// 인원 수 입력(1~100) : 3

// 1번째 학생의 이름 입력 : 박박박
// 국어 점수 : 90
// 영어 점수 : 80
// 수학 점수 : 70

// 2번째 학생의 이름 입력 : 김김김
// 국어 점수 : 92
// 영어 점수 : 82
// 수학 점수 : 72

// 3번째 학생의 이름 입력 : 이이이
// 국어 점수 : 82
// 영어 점수 : 72
// 수학 점수 : 62

// 박박박 90 80 70  240 80.00    2
// 김김김 92 82 72  246 82.00    1
// 이이이 82 72 62  216 72.00    3

// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;

class Sungjuk
{

	int su;
	Record[] recArr;

	// 인원 수 입력
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("인원 수 입력(1~100) : ");
			su = sc.nextInt();
			
		}
		while (su < 1 || su > 100);

		recArr = new Record[su];
	}




	// 점수 입력
	public void score()
	{
		Scanner sc = new Scanner(System.in);
		String[] strName = {"국어", "수학", "영어"};
		
		for(int i=0; i < su; i++)
		{
			recArr[i] = new Record();
			System.out.printf("%d번째 학생의 이름 입력 : ", (i+1));
			recArr[i].name = sc.next();
			
			for(int j=0; j < strName.length; j++)
			{
				System.out.print(strName[j] + " 점수 : ");
				recArr[i].score[j] = sc.nextInt();

				recArr[i].tot += recArr[i].score[j]; // 총점 입력
			}

			recArr[i].avg = recArr[i].tot / 3.0; //평균 입력
		}
	}

	// score() 메소드 테스트
	/*
		2중 for문으로 (0+1)번째 학생 이름 입력 받고 → 국,수,영 점수 : 입력, 총점 recArr[0].tot += recArr[0].score[0]
																			                    += recArr[0].score[1]
																			         		    += recArr[0].score[2]

													→ recArr[0].avg =  recArr[0].tot / 3.0 
													    0번의 평균   =   총점 누적합  / 3.0
					  (1+1)번째 학생 이름 입력 받고 → 국,수,영 점수 : 입력, 총점 recArr[1].tot += recArr[1].score[0]
																			                    += recArr[1].score[1]
																			         		    += recArr[1].score[2]
													→ recArr[1].avg =  recArr[1].tot / 3.0
													
					  (2+1)번째 학생 이름 입력 받고 → 국,수,영 점수 : 입력, 총점 recArr[2].tot += recArr[2].score[0]
																			                    += recArr[2].score[1]
																			         		    += recArr[2].score[2]
													→ recArr[2].avg =  recArr[2].tot / 3.0
	*/


	public void rank()
	{
		for(int i = 0; i < su; i++)
		{ 
			recArr[i].rank = 1;
			for(int j = 0; j < su; j++)
			{
				if(recArr[i].avg < recArr[j].avg)
				{
					recArr[i].rank += 1;
				}
			}
		}
	}

	// rank() 메소드 테스트
	/*
		예제 데이터 입력해서 현재 평균은 순서대로
		recArr[0].avg = 80
		recArr[1].avg = 82
		recArr[2].avg = 72

		i = 0일 때
		// recArr[0].rank = 1
		   j < su (j < 3)
		   - j = 0 → (recArr[0].avg < recArr[0].avg) → (80 < 80) 이라면 → (X)
		   - j = 1 → (recArr[0].avg < recArr[1].avg) → (80 < 82) 이라면 → (X)
		   - j = 2 → (recArr[0].avg < recArr[2].avg) → (80 < 72) 이라면 → recArr[0].rank는 1 증가 → recArr[0].rank = 2;

		// recArr[1].rank = 1
		   j < su (j < 3)
		   - j = 0 → (recArr[1].avg < recArr[0].avg) → (82 < 80) 이라면 → (X)
		   - j = 1 → (recArr[1].avg < recArr[1].avg) → (82 < 82) 이라면 → (X)
		   - j = 2 → (recArr[1].avg < recArr[2].avg) → (82 < 72) 이라면 → (X)

		// recArr[2].rank = 1
		   j < su (j < 3)
		   - j = 0 → (recArr[2].avg < recArr[0].avg) → (72 < 80) 이라면 → recArr[2].rank는 1 증가 → recArr[2].rank = 2;
		   - j = 1 → (recArr[2].avg < recArr[1].avg) → (72 < 82) 이라면 → recArr[2].rank는 1 증가 → recArr[2].rank = 3;
		   - j = 2 → (recArr[2].avg < recArr[2].avg) → (72 < 72) 이라면 → (X)

		최종적으로
		recArr[0].rank = 2
		recArr[1].rank = 1
		recArr[2].rank = 3
	*/



	public void print()
	{
		System.out.println(); // 개행


		for(int i=0; i < su; i++)
		{
			// 이름
			System.out.printf("%5s", recArr[i].name);

			// 점수
			for(int j=0; j < 3; j++)
				System.out.printf("%4d", recArr[i].score[j]);

			// 총점
			System.out.printf("%5d", recArr[i].tot);

			// 평균
			System.out.printf("%8.2f", recArr[i].avg);

			// 순위
			System.out.printf("%5d", recArr[i].rank);

			System.out.println(); // 개행
		}
	}

}

public class Test101
{
	public static void main(String[] args)
	{
		Sungjuk sj = new Sungjuk();
		sj.input();
		sj.score();
		sj.rank();
		sj.print();

	}
}
// 실행 결과
/*
인원 수 입력(1~100) : 5
1번째 학생의 이름 입력 : 신짱구
국어 점수 : 87
수학 점수 : 40
영어 점수 : 70
2번째 학생의 이름 입력 : 김철수
국어 점수 : 80
수학 점수 : 68
영어 점수 : 86
3번째 학생의 이름 입력 : 이훈이
국어 점수 : 35
수학 점수 : 66
영어 점수 : 89
4번째 학생의 이름 입력 : 한유리
국어 점수 : 55
수학 점수 : 72
영어 점수 : 94
5번째 학생의 이름 입력 : 맹구
국어 점수 : 77
수학 점수 : 88
영어 점수 : 99

  신짱구  87  40  70  197   65.67    4
  김철수  80  68  86  234   78.00    2
  이훈이  35  66  89  190   63.33    5
  한유리  55  72  94  221   73.67    3
   맹구  77  88  99  264   88.00    1
계속하려면 아무 키나 누르십시오 . . .
*/