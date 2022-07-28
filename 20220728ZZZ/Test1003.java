
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

public class Test1003
{
	public static void main(String[] args)
	{
		TreeSet<String> set = new TreeSet<String>();

		set.add("�Ͽ�");
		set.add("�����");
		set.add("�Ѹ�");
		set.add("��Į");
		set.add("�ܿ�ձ�");
		set.add("¯��");
		set.add("�λ��̵�ƿ�");
		set.add("�ڳ�");
		set.add("���ɰ���");
		
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

		set2.add(new GradeVO("20211523","��¯��",90,80,70));
		set2.add(new GradeVO("20211523","���",91,81,71));
        set2.add(new GradeVO("20211523","�Ÿ�",98,78,88));
        set2.add(new GradeVO("20211523","�̾���",72,49,99));
        set2.add(new GradeVO("20211523","�����",56,31,90));
        
		
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
	public int compare(T o1, T o2) // �ڰ� ��ũ�� -1, ������ 1 ������ 0
	{
		GradeVO s1 = (GradeVO)o1;
		GradeVO s2 = (GradeVO)o2;

		//�й� ����(��������)
		//return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
		
		//�й� ����(��������)
		//return Integer.parseInt(s2.getHak()) - Integer.parseInt(s1.getHak());


		// �̸� ����(��������)
		return s2.getName().compareTo(s1.getName());
	}

}