/*
Test159 클래스를 완성하여 다음 기능을 가진 프로그램을 구현한다.
실행 예)
		[메뉴 선택]
		1. 요소 추가
		2. 요소 출력
		3. 요소 검색
		4. 요소 삭제
		5. 요소 변경
		6. 종료
		>> 메뉴 선택(1~6) : 1
		1번째 요소 입력 : 떡볶이
		1번째 요소 입력 성공~!!!
		요소 입력 계속(Y/N)? : Y
		
*/

import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Menus
{
	public static final int E_ADD = 1;
	public static final int E_DISP = 2;
    public static final int E_FIND = 3;
    public static final int E_DEL = 4;
    public static final int E_CHA = 5;
    public static final int E_EXIT = 6;
    
}


public class Test999
{
	private static final Vector<Object> vt;
	private static BufferedReader br;
	private static Integer sel;
	private static String con;

	// static 초기화 블럭
	static
	{
		vt = new Vector<Object>();
		br = new BufferedReader(new InputStreamReader(System.in));

		sel = 1;
		con = "Y";
	}


	//메뉴 출력 메소드
	public static void menuDisp()
	{
		System.out.println();
		System.out.println("\t[메뉴 선택]");
		System.out.println("\t1. 요소 추가");
		System.out.println("\t2. 요소 출력");
		System.out.println("\t3. 요소 검색");
		System.out.println("\t4. 요소 삭제");
		System.out.println("\t5. 요소 변경");
		System.out.println("\t6. 종료");
		System.out.println();
		System.out.print(">> 메뉴 선택(1~6) : ");
	}


	//선택된 메뉴 실행에 따른 기능 호출 메소드
	public static void menuRun() throws IOException, NumberFormatException
	{
		switch(sel)
		{
			case Menus.E_ADD : addElement(); break;
			case Menus.E_DISP : dispElement(); break;
            case Menus.E_FIND : findElement(); break;
            case Menus.E_DEL : delElement(); break;
            case Menus.E_CHA : chaElement(); break;
            case Menus.E_EXIT : exit(); break;
            default : System.out.println("\t >> 메뉴 선택 오류~!!!"); break;
		}
	}

	//메뉴 선택 메소드
	public static void menuSelect() throws IOException
	{
		do
		{
			sel = Integer.parseInt(br.readLine());
		}
		while (sel < 1 || sel > 6);
	}


	//요소 추가(입력) 메소드
	public static void addElement() throws IOException
	{
		do
		{
			System.out.printf("%d번째 요소 입력 : ", vt.size()+1);
			String temp = br.readLine();

			vt.add(temp);

			System.out.println();
			System.out.printf("%d번째 요소 입력 성공~!!!", vt.size());
			System.out.println();
			System.out.print("\t요소 입력 계속(Y/N) : ");
			con = br.readLine().toUpperCase();
		}
		while (con.equals("Y"));

		System.out.println();
		
	}

	//요소 출력 메소드
	public static void dispElement()
	{
		System.out.println();
		System.out.println("\t[벡터 전체 출력]");
		for(int i = 0; i< vt.size(); i++)
			System.out.printf("%s\n", vt.get(i));
		System.out.println("\t벡터 전체 출력 완료~!!!");
	}


	//요소 검색 메소드
	public static void findElement() throws IOException
	{
		System.out.println();
		String temp="";

		System.out.print("\t검색할 요소 입력 : ");
		temp = br.readLine();

		int i = vt.indexOf(temp);

		System.out.println("\t[검색 결과 출력]");

		if(i<0)
			System.out.println("\t항목이 존재하지 않습니다.");
		else
			System.out.println("\t항목이 존재합니다.");
	}


	//요소 삭제 메소드
	public static void delElement() throws IOException
	{
		System.out.println();
		System.out.println("\t삭제할 요소 입력 : ");
		String temp = br.readLine();
		System.out.println();

		System.out.println("\t[검색 결과 출력]");
		if(vt.contains(temp)) //contains 포함하고 있는지 여부를 반환한다.
		{
			int i = vt.indexOf(temp);
			vt.remove(i);
			System.out.printf("\t%s 항목이 삭제되었습니다.\n", temp);
		}
		else
			System.out.println("\t항목이 존재하지 않아 삭제할 수 없습니다.");
	}


	//요소 수정(변경) 메소드
	public static void chaElement() throws IOException
	{
		System.out.println();
		System.out.println("\t변경할 요소 입력");
		String temp = br.readLine();

		if(vt.contains(temp))
		{
			System.out.print("\t수정할 내용 입력 : ");
			String change = br.readLine();

			int i = vt.indexOf(temp);
			vt.set(i, change);
		}
		else
		{
			System.out.println("\n\t[변경 결과 출력]");
			System.out.println("\t변경할 대상이 존재하지 않습니다.");
		}
	}


	//요소 종료 메소드
	public static void exit()
	{
		System.out.println("프로그램종료~!!!");
		System.exit(-1);
	}







	public static void main(String[] args) throws IOException
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