
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

public class Test1003
{
	public static void main(String[] args)
	{
		TreeSet<String> set = new TreeSet<String>();

		set.add("하울");
		set.add("토토로");
		set.add("둘리");
		set.add("귀칼");
		set.add("겨울왕국");
		set.add("짱구");
		set.add("인사이드아웃");
		set.add("코난");
		set.add("원령공주");
		
		Iterator<String> it = set.iterator();

		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println();


		System.out.println("-----------------------------------------------------");




		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());

		//GradeVO ob = new GradeVO();
		//set2.add(GradeVO);
		//set2(ob);

		set2.add(new GradeVO("20211523","신짱구",90,80,70));
		set2.add(new GradeVO("20211523","김모군",91,81,71));
        set2.add(new GradeVO("20211523","신모씨",98,78,88));
        set2.add(new GradeVO("20211523","이양이",72,49,99));
        set2.add(new GradeVO("20211523","고노이",56,31,90));
        
		
		//Iterator<GradeVO> it2 = set2.iterator();
		//while(it2.hasNext())
		//{
		//	System.out.println(it2.next() + " ");
		//}
		/*
		GradeVO@15db9742
		GradeVO@6d06d69c
		GradeVO@7852e922
		GradeVO@4e25154f
		GradeVO@70dea4e
		*/

		Iterator<GradeVO> it2 = set2.iterator();
		while(it2.hasNext())
		{
			GradeVO vo = it2.next();
			System.out.printf("%7s %7s %4d %4d %4d %6d\n"
							, vo.getHak(), vo.getName()
							, vo.getKor(), vo.getEng(), vo.getMat()
							, vo.getTot());
		}
		System.out.println();
		


		
	}
}

class GradeVO
{
	private String hak;
	private String name;
	private int kor, eng, mat;


	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	GradeVO()
	{
	}

	//getter
	String getHak()
	{
		return hak;
	}
	//setter
	void setHak()
	{
		this.hak = hak;
	}



	String getName()
	{
		return name;
	}

	//setter
	void setName()
	{
		this.name = name;
	}


	int getKor()
	{
		return kor;
	}
	//setter
	void setKor()
	{
		this.kor = kor;
	}


	int getEng()
	{
		return eng;
	}
	//setter
	void setEng()
	{
		this.eng = eng;
	}


	int getMat()
	{
		return mat;
	}
	//setter
	void setMat()
	{
		this.mat = mat;
	}


	int getTot()
	{
		return kor + eng + mat;
	}


}

class MyComparator<T> implements Comparator<T>
{
	@Override
	public int compare(T o1, T o2) // 뒤가 더크면 -1, 작으면 1 같으면 0
	{
		GradeVO s1 = (GradeVO)o1;
		GradeVO s2 = (GradeVO)o2;

		//학번 기준(오름차순)
		//return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
		
		//학번 기준(내림차순)
		//return Integer.parseInt(s2.getHak()) - Integer.parseInt(s1.getHak());


		// 이름 기준(내림차순)
		return s2.getName().compareTo(s1.getName());
	}

}