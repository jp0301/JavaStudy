/*=======================================
      ■■■ 클래스와 인스턴스 ■■■
	  - 클래스와 인스턴스 활용
  ======================================*/

// [가이드라인]
// 프로그램을 구성하는 클래스
// 1. Record 클래스
//    - 속성만 존재하는 클래스로 설계할 것~!!!

// 학생 1명
public class Record
{
	// 학생 한 명을 표현할 수 있는 속성들로 구성~!!!
	String name;
	int[] score = new int[3]; // int kor, eng, mat; //-- 각 과목의 점수
							  // score[0] : 국어 , score[1] : 영어 , score[2] : 수학 
	int tot;				  //-- 총점
	double avg;			      //-- 평균

	// 추가~!!
	int rank;                 //-- 석차
}


/*
결정적 힌트
int[] arr = new int[3];

Record[] recArr = new Record[3];

Record rec1 = new Record();

rec1.name = "";


*/