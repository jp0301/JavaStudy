/*==================================
  ■■■ 컬렉션(Collection) ■■■
====================================*/

// Set → HashSet, TreeSet
// - 순서가 없다.
// - 중복을 허용하지 않는 구조(기본)

/*
○ TreeSet<E> 클래스

   java.util.TreeSet<E> 클래스는
   Set 인터페이스를 상속한 SortedSet 인터페이스를 구현한 클래스로
   데이터를 추가하면 데이터들이 자동으로 오름차순 정렬이 된다.
*/

// VO  - Value Object, 비즈니스 로직을 포함하고 있을 때, 포함되고 있는 DTO, 실무에서는 구분해서 잘안쓴다.(보통은 통칭함)
// DTO - Data Transfer Object, 데이터를 담아서 이쪽 계층에서 저쪽 계층으로 전송, 수신해서 보관 처리, 데이터 전송 객체
// DAO - Data Access Object, 프로그램 단에서 DTO그릇에 담아서 데이터베이스에 전달하면서 지시하는 명령하는 느낌, 어떻게 업무 처리해라. 데이터 접근 객체


import java.util.Iterator;
import java.util.TreeSet;
import java.util.Comparator;

class GradeVO
{
	// 주요 속성 구성
	private String hak;				//-- 학번
	private String name;			//-- 이름
	private int kor, eng, mat;		//-- 국어, 영어, 수학 점수

	// 생성자(사용자 정의 생성자) → 5개의 매개변수를 가진 생성자
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	// default 생성자 자동 삽입되지 않음~!!!

	// 생성자(사용자 정의 생성자) → 매개변수 없는 생성자
	//-- 매개변수가 존재하는 생성자를 사용자 정의 생성자로 구성하였기 때문에
	//   default 생성자가 자동으로 삽입되지 않을 것을 우려하여
	//   추가로 정의한 생성자
	GradeVO()
	{
		this("", "", 0, 0, 0);
	}

	// getter / setter 구성
	public String getHak()
	{
		return hak;
	}
	public void setHak(String hak)
	{
		this.hak = hak;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

    
	public int getKor()
	{
		return kor;
	}
	public void setKor(int kor)
	{
		this.kor = kor;
	}

    
	public int getEng()
	{
		return eng;
	}
	public void setEng(int eng)
	{
		this.eng = eng;
	}

    
	public int getMat()
	{
		return mat;
	}
	public void setMat(int mat)
	{
		this.mat = mat;
	}
	
	// 추가 메소드 정의(총점 산출)
	public int getTot()
	{
		return this.kor + this.eng + this.mat;
	}
}


class MyComparator<T> implements Comparator<T>
{
	// 비교 메소드 재정의
	@Override
	public int compare(T o1, T o2)
	{
		 GradeVO s1 = (GradeVO)o1;
		 GradeVO s2 = (GradeVO)o2;

		 // 학번 기준 (오름차순)
		 return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
		 // return Integer.parseInt("2206113") - Integer.parseInt("2206115");
		 // return 2206113 - 2206115;
		 // return -2; 이렇게 되면 뒤의 것이 더 크기 때문에 오름차순 된 것.

		 //return s2.getName().toCompare(s1.getName());
	}
}
// E obj - 『Element』
// T - Type

public class Test169
{
	public static void main(String[] args)
	{
		// TreeSet 자료구조 인스턴스 생성
		TreeSet<String> set = new TreeSet<String>();

		// TreeSet 자료구조 set에 요소 추가 → add();
		set.add("귀멸의칼날");
		set.add("명탐정코난");
		set.add("하이큐");
		set.add("너의이름은");
		set.add("포켓몬");
		set.add("센과치히로의행방불명");
		set.add("디지몬어드벤처");
		set.add("이웃집토토로");
		set.add("짱구는못말려");
		set.add("아기공룡둘리얼음별대모험");
		set.add("러브라이브");
		
		// Iterator 를 활용한 set 요소 전체 출력
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println();
		//--==>> 귀멸의칼날 너의이름은 디지몬어드벤처 러브라이브
		//		 명탐정코난 센과치히로의행방불명 아기공룡둘리얼음별대모험
		//		 이웃집토토로 짱구는못말려 포켓몬 하이큐
		//-- 요소를 문자열로 구성할 경우
		//   가나다순 → 오름차순 정렬 확인, 넣기 전에 있던 것들과 비교해서 어디다 넣어야 할지 확인하고 추가한다.
		//                                    따라서 비교작업이 계속 이루어지기 때문에 리소스 소모가 심하다.

		System.out.println("------------------------------------------------------");

		// TreeSet 자료구조 인스턴스 생성
		//TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();
		//
		//                 ↓
		//
		// MyCompartor 클래스를 생성하여
		// compare() 메소드를 재정의한 후 다시 생성
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());

		// TreeSet 자료구조 set2 에 요소 추가
		set2.add(new GradeVO("2206113", "박효신", 90, 80, 70));
		set2.add(new GradeVO("2206115", "신용재", 91, 81, 71));
		set2.add(new GradeVO("2206128", "김범수", 88, 78, 68));
        set2.add(new GradeVO("2206139", "조재현", 70, 60, 50));
        set2.add(new GradeVO("2206150", "임재범", 99, 82, 72));

		// Iterator 를 활용한 set2 요소 전체 출력
		/*
		Iterator<GradeVO> it2 = set2.iterator();

		while(it2.hasNext())
		{
			System.out.print(it2.next() + " ");
		}
		System.out.println();
		//--==>> 에러 발생(런타임 에러)
		//       Exception in thread "main" java.lang.ClassCastException: 
		//       GradeVO cannot be cast to java.lang.Comparable
		*/

		//
		//                 ↓
		//
		// MyCompartor 클래스를 생성하여
		// compare() 메소드를 재정의한 후 다시 구성
		/*
		Iterator<GradeVO> it2 = set2.iterator();
		while(it2.hasNext())
		{
			System.out.print(it2.next() + " ");
		}
		System.out.println();
		*/
		//--==>> GradeVO@15db9742 GradeVO@6d06d69c GradeVO@7852e922 GradeVO@4e25154f GradeVO@70dea4e
		//       객체를 출력한 것이기 때문에 설계도의 클래스명@해시코드

		//                 ↓

		// 객체 자체를 직접 출력하는 것이 아니라
		// 객체가 갖고있는 속성에 접근하여 출력할 수 있도록 처리
		Iterator<GradeVO> it3 = set2.iterator();
		while(it3.hasNext())
		{
			GradeVO vo = it3.next();
			System.out.printf("%7s %7s %4d %4d %4d\n", vo.getHak(), vo.getName(), vo.getKor(), vo.getEng(), vo.getMat());
		}
		System.out.println();

	}
} 