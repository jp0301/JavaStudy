/*==============================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - 자바에서 기본적으로 제공하는 주요 클래스들
  - Calendar 클래스
===============================================*/

/*
○ 실습 문제
   오늘을 기준으로 입력받는 날짜만큼 후의 연, 월, 일, 요일을
   확인하여 결과를 출력하는 프로그램을 구현한다.

실행 예)
오늘 날짜 : 2022-07-26 화요일   ← 출력, 입력아님.
몇 일 후의 날짜를 확인하고자 하십니까? : 200

==========[확인 결과]=========
200일 후 : xxxx-xx-xx x요일
==============================
계속하려면 아무 키나 누르세요...
*/

//※ Calendar 와 관련한 API Document 참조~!!!
//   『add()』 메소드 확인해봐라!
//    : 현재 날짜를 기준으로 날 수 더하는 연산 메소드
//      → 『객체.add(Calendar.DATE, 날수);』

import java.util.Calendar;
import java.util.Scanner;

public class Test144
{
	public String weekCal(int w)
	{
		String week = "";
		switch(w)
		{
			case 1: week="일요일"; break;
			case 2: week="월요일"; break;
            case 3: week="화요일"; break;
			case 4: week="수요일"; break;
			case 5: week="목요일"; break;
			case 6: week="금요일"; break;  
			case 7: week="토요일"; break;
		}
		return week;		
	}

	public static void main(String[] args)
	{
		/*
		//Calendar 클래스 기반 인스턴스 생성
		Calendar today = Calendar.getInstance();
		Test144 ob = new Test144();

		//요일 판단1
		int w = today.get(Calendar.DAY_OF_WEEK);
		String rweek = ob.weekCal(w);

		// 오늘 날짜 출력
		System.out.println(today.get(Calendar.YEAR) + "-" + (today.get(Calendar.MONTH)+1) + "-" + today.get(Calendar.DATE) + " " + rweek);

		//날짜 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
		int d = sc.nextInt();
		
		//add 메소드 일 수 추가
		today.add(Calendar.DAY_OF_MONTH, d);
		
		//요일 판단2
		w = today.get(Calendar.DAY_OF_WEEK);
		rweek = ob.weekCal(w);

		System.out.println();
		System.out.println("==========[확인 결과]=========");
		System.out.println(d + "일 후 : " + today.get(Calendar.YEAR) + "-" + (today.get(Calendar.MONTH)+1) + "-" + today.get(Calendar.DATE) + " " + rweek);
		System.out.println("==============================");
		*/

		//Scanner 클래스 기반 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		//Calendar 클래스 기반 인스턴스 생성
		Calendar now = Calendar.getInstance();

		// 주요 변수 선언
		int nalsu;				//-- 사용자로부터 입력받은 날 수
		int y, m, d, w;			//-- 연, 월, 일, 요일
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};

		// 현재 연,월,일,요일 확인(→ 가져오기 : get());
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH)+1;		//-- 『+1』 check~!!!
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);
		
		// 현재의 연, 월, 일, 요일 확인결과 출력
		System.out.printf("오늘 날짜 : %d-%d-%d %s\n", y, m, d, week[w-1]);
		
		System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
		nalsu = sc.nextInt();

		//check~!!!
		now.add(Calendar.DATE, nalsu);

		System.out.println();
		System.out.println("==========[확인 결과]=========");

		// printf 추가 퍼즐 조각
		// 『%tF』 년 월 일만 추출해서 출력해준다.
		// 『%tA』 
		System.out.printf("%d일 후 : %tF %tA\n", nalsu, now, now);

		// String.format("%tF", 달력객체);
		// → 년-월-일 형태의 문자열 반환

		// String.format("%tA", 달력객체);
		// → 요일 형태의 문자열 반환

		System.out.println("==============================");

        
	}	
}

// 실행 결과
/*
2022-7-26 화요일
몇 일 후의 날짜를 확인하고자 하십니까? : 5

==========[확인 결과]=========
2022-7-31 일요일
==============================
계속하려면 아무 키나 누르십시오 . . .
*/

/*
오늘 날짜 : 2022-7-26 화
몇 일 후의 날짜를 확인하고자 하십니까? : 174

==========[확인 결과]=========
174일 후 : 2023-01-16 월요일
==============================
계속하려면 아무 키나 누르십시오 . . .

*/

// 자바는 date 가있음에도 캘린더 를 많이사용한다. 잘다뤄볼수있도록 연습.