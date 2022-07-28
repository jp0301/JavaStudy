/*==================================
  ■■■ 컬렉션(Collection) ■■■
====================================*/

// Test163 클래스를 완성하여 다음 기능을 가진 프로그램을 구현한다.

/*
실행 예)

	[ 메뉴 선택 ]=====
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	==================
>> 메뉴 선택 (1~6) : 1

1번째 요소 입력 : 장현성
1번째 요소 입력 성공~!!!
요소 입력 계속(Y/N)? : y

2번째 요소 입력 : 엄소연
2번째 요소 입력 성공~!!!
요소 입력 계속(Y/N) : N

	[ 메뉴 선택 ]=====
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	==================
>> 메뉴 선택 (1~6) : 2

[벡터 전체 출력]
장현성
엄소연
벡터 전체 출력 완료~!!!

	[ 메뉴 선택 ]=====
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	==================
>> 메뉴 선택 (1~6) : 3

>> 검색할 요소 입력 : 장현성

[검색 결과 출력]
항목이 존재합니다.

	[ 메뉴 선택 ]=====
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	==================
>> 메뉴 선택 (1~6) : 3

>> 검색할 요소 입력 : 반보영

[검색 결과 출력]
항목이 존재하지 않습니다.

	[ 메뉴 선택 ]=====
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	==================
>> 메뉴 선택 (1~6) : 4

>> 삭제할 요소 입력 : 김보경

[삭제 결과 출력]
항목이 존재하지 않아 삭제할 수 없습니다.

	[ 메뉴 선택 ]=====
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	==================
>> 메뉴 선택 (1~6) : 4

>> 삭제할 요소 입력 : 장현성

[삭제 결과 출력]
장현성 항목이 삭제되었습니다.

	[ 메뉴 선택 ]=====
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	==================
>> 메뉴 선택 (1~6) : 5

>> 변경할 요소 입력 : 도규희

[변경 결과 출력]
변경할 대상이 존재하지 않습니다.

	[ 메뉴 선택 ]=====
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	==================
>> 메뉴 선택 (1~6) : 5

>> 변경할 요소 입력 : 엄소연
>> 수정할 내용 입력 : 도규희

[변경 결과 출력]
변경이 완료되었습니다.

	[ 메뉴 선택 ]=====
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	==================
>> 메뉴 선택 (1~6) : 2

[벡터 전체 출력]
도규희
벡터 전체 출력 완료~!!!

	[ 메뉴 선택 ]=====
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	==================
>> 메뉴 선택 (1~6) : 6

프로그램 종료~!!!
계속하려면 아무 키나 누르세요...

*/

import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Menus // → 완성
{
	public static final int E_ADD = 1;		//-- 요소 추가
	public static final int E_DISP = 2;		//-- 요소 출력
    public static final int E_FIND = 3;		//-- 요소 검색
    public static final int E_DEL = 4;		//-- 요소 삭제
    public static final int E_CHA = 5;		//-- 요소 변경
    public static final int E_EXIT = 6;		//-- 프로그램 종료  
}

public class Test163
{
	// 주요 속성 구성
	private static final Vector<Object> vt; //-- 자료구조
	private static final BufferedReader br;	//-- 입력 시 활용
	private static Integer sel;				//-- 선택 값
	private static String con;				//-- 계속 진행 여부
	
	// static 초기화 블럭
	static
	{
		// Vector 자료구조 생성
		vt = new Vector<Object>();
		// BufferedReader 클래스 인스턴스 생성
		br = new BufferedReader(new InputStreamReader(System.in));

		// 사용자 입력값 초기화
		sel = 1;
		con = "Y";
	}
	


	//-------------------------------------------------------------------------------
	// 메뉴 출력 메소드
	public static void menuDisp()
	{
		System.out.println();
		System.out.println("\t[ 메뉴 선택 ]=====");
		System.out.println("\t1. 요소 추가");
		System.out.println("\t2. 요소 출력");
		System.out.println("\t3. 요소 검색");
		System.out.println("\t4. 요소 삭제");
		System.out.println("\t5. 요소 변경");
		System.out.println("\t6. 종료");
		System.out.println("\t==================");
		System.out.print(">> 메뉴 선택 : ");
	}

	//-------------------------------------------------------------------------------
	// 메뉴 선택 메소드
	public static void menuSelect() throws IOException, NumberFormatException
	{
		do
		{
			sel = Integer.parseInt(br.readLine());
		}
		while (sel < 1 || sel > 6);
	}

	//-------------------------------------------------------------------------------
	// 메뉴 기능 호출 메소드
	public static void menuRun() throws IOException
	{
		switch(sel)
		{
			case Menus.E_ADD : addElement(); break;
			case Menus.E_DISP : dispElement(); break;
			case Menus.E_FIND : findElement(); break;
			case Menus.E_DEL : delElement(); break;
			case Menus.E_CHA : chaElement(); break;
			case Menus.E_EXIT : exit(); break;
			default : System.out.println("메뉴 선택 오류입니다."); break;
		}
	}

	//-------------------------------------------------------------------------------
	// 자료구조에 요소 추가(입력) 메소드
	public static void addElement() throws IOException
	{
		System.out.println();
		do
		{
			System.out.printf("%d번째 요소 입력 : ", vt.size()+1);
			String temp = br.readLine();
			vt.add(temp);
			
			System.out.printf("%d번째 요소 입력 성공~!!!\n", vt.size());
			System.out.printf("요소 입력 계속(Y/N) : ");
			con = br.readLine().toUpperCase(); // y → Y , n → N
		}
		while (con.equals("Y")); // [Y]면 true, [N]면 false
	}

	//-------------------------------------------------------------------------------
	// 자료구조 전체 요소 출력 메소드
	public static void dispElement()
	{
		System.out.println();
		System.out.println("[벡터 전체 출력]");

		for(int i = 0; i < vt.size() ; i++)
			System.out.println(vt.get(i));
		System.out.println("벡터 전체 출력 완료~!!!");
	}

	//-------------------------------------------------------------------------------
	// 자료구조 내 요소 검색 출력 메소드
	public static void findElement() throws IOException
	{
		System.out.println();
		System.out.print(">> 검색할 요소 입력 : ");
		String temp = br.readLine();
		
		int i = vt.indexOf(temp);		// 없는 거 넣으면 -1 반환될거임

		System.out.println("[검색 결과 출력]");
		if(i < 0)
			System.out.println("항목이 존재하지 않습니다.");
		else
			System.out.println("항목이 존재합니다.");
	}

	//-------------------------------------------------------------------------------
	// 자료구조 내 요소 삭제 출력 메소드
	public static void delElement() throws IOException
	{
		String temp = "";
		
		System.out.println();
		System.out.print(">> 삭제할 요소 입력 : ");
		temp = br.readLine();

		int i = vt.indexOf(temp);

		System.out.println("[삭제 결과 출력]");
		if(vt.contains(temp))						// 포함되있으믄 true 반환
		{
			vt.remove(i);
			System.out.println(temp + " 항목이 삭제되었습니다.");
		}
		else
			System.out.println("항목이 존재하지 않아 삭제할 수 없습니다.");
	}

	//-------------------------------------------------------------------------------
	// 자료구조 내 요소 수정(변경) 출력 메소드
	public static void chaElement() throws IOException
	{
		System.out.println();
		System.out.print(">> 변경할 요소 입력 : ");
		String temp = br.readLine();

		if(vt.contains(temp))
		{
			System.out.print(">> 수정할 내용 입력 : ");
			String newTemp = br.readLine();

			int i = vt.indexOf(temp);			
			vt.set(i, newTemp);

			System.out.println("\n[변경 결과 출력]");
			System.out.println("변경이 완료되었습니다.");
		}
		else
		{
			System.out.println("\n[변경 결과 출력]");
			System.out.println("변경할 대상이 존재하지 않습니다.");
		}
	}

	//-------------------------------------------------------------------------------
	// 프로그램 종료 메소드 → 완성
	public static void exit()
	{
		System.out.println("\n프로그램 종료~!!!");
		System.exit(-1);
	}


	//-------------------------------------------------------------------------------
	// main() 메소드 → 완성
	public static void main(String[] args) throws IOException, NumberFormatException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
	}
}