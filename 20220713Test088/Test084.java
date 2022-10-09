/*============================
      ■■■ 배열 ■■■
    - 배열의 선언과 초기화
	- 배열의 기본적 활용
  ============================*/

// ○ 과제
//    사용자로부터 임의의 학생 수를 입력받고
//    그만큼의 점수(정수 형태)를 입력받아
//    전체 학생 점수의 합, 평균, 편차를 구해서
//    결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 학생 수 입력 : 5
// 1번 학생의 점수 입력 : 90
// 2번 학생의 점수 입력 : 82
// 3번 학생의 점수 입력 : 64
// 4번 학생의 점수 입력 : 36
// 5번 학생의 점수 입력 : 98


// >> 합 : 370
// >> 평균 : 74.0
// >> 편차
// 90 : -16.0
// 82 : -8.0
// 64 : 10.0
// 36 : 38.0
// 98 : -24.0
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;

public class Test084
{
	public static void main(String[] args)
	{
		// 변수 선언 및 초기화
		Scanner sc = new Scanner(System.in);
		int num, sum = 0;
		double avg = 0.0;
		
		// 학생 수 입력
		System.out.print("학생 수 입력 : ");
		num = sc.nextInt();
		
		// 입력받은 학생 수 만큼의 배열
		int[] score = new int[num];

		// 입력받은 학생 수 만큼 반복문으로 점수 입력받기
		for(int i=0; i < num; i++)
		{
			System.out.printf("%d번 학생의 점수 입력 : ", (i+1));
			score[i] = sc.nextInt();

			// 입력받으면서 바로 누적합시키기
			sum += score[i];
		}

		// 평균 구하기
		avg = sum / score.length;

		// 결과 출력
		System.out.println();
		System.out.println(">> 합 : " + sum);
		System.out.println(">> 평균 : " + avg);
        System.out.println(">> 편차");

		// 편차 출력하기
		// 평균에서 학생 개인 점수를 뺀 값
		for(int i=0; i< num; i++)
		{
			System.out.printf("%d : %.1f\n", score[i], avg - score[i]);
		}

	}
}

//실행 결과

/*
학생 수 입력 : 5
1번 학생의 점수 입력 : 90
2번 학생의 점수 입력 : 82
3번 학생의 점수 입력 : 64
4번 학생의 점수 입력 : 36
5번 학생의 점수 입력 : 98
>> 합 : 370
>> 평균 : 74.0
>> 편차
90 : -16.0
82 : -8.0
64 : 10.0
36 : 38.0
98 : -24.0
계속하려면 아무 키나 누르십시오 . . .
*/