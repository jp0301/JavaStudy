/*==================================
  ���� �÷���(Collection) ����
====================================*/

// Set �� HashSet, TreeSet
// - ������ ����.
// - �ߺ��� ������� �ʴ� ����(�⺻)

/*
�� TreeSet<E> Ŭ����

   java.util.TreeSet<E> Ŭ������
   Set �������̽��� ����� SortedSet �������̽��� ������ Ŭ������
   �����͸� �߰��ϸ� �����͵��� �ڵ����� �������� ������ �ȴ�.
*/

// VO  - Value Object, ����Ͻ� ������ �����ϰ� ���� ��, ���Եǰ� �ִ� DTO, �ǹ������� �����ؼ� �߾Ⱦ���.(������ ��Ī��)
// DTO - Data Transfer Object, �����͸� ��Ƽ� ���� �������� ���� �������� ����, �����ؼ� ���� ó��, ������ ���� ��ü
// DAO - Data Access Object, ���α׷� �ܿ��� DTO�׸��� ��Ƽ� �����ͺ��̽��� �����ϸ鼭 �����ϴ� ����ϴ� ����, ��� ���� ó���ض�. ������ ���� ��ü


import java.util.Iterator;
import java.util.TreeSet;
import java.util.Comparator;

class GradeVO
{
	// �ֿ� �Ӽ� ����
	private String hak;				//-- �й�
	private String name;			//-- �̸�
	private int kor, eng, mat;		//-- ����, ����, ���� ����

	// ������(����� ���� ������) �� 5���� �Ű������� ���� ������
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	// default ������ �ڵ� ���Ե��� ����~!!!

	// ������(����� ���� ������) �� �Ű����� ���� ������
	//-- �Ű������� �����ϴ� �����ڸ� ����� ���� �����ڷ� �����Ͽ��� ������
	//   default �����ڰ� �ڵ����� ���Ե��� ���� ���� ����Ͽ�
	//   �߰��� ������ ������
	GradeVO()
	{
		this("", "", 0, 0, 0);
	}

	// getter / setter ����
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
	
	// �߰� �޼ҵ� ����(���� ����)
	public int getTot()
	{
		return this.kor + this.eng + this.mat;
	}
}


class MyComparator<T> implements Comparator<T>
{
	// �� �޼ҵ� ������
	@Override
	public int compare(T o1, T o2)
	{
		 GradeVO s1 = (GradeVO)o1;
		 GradeVO s2 = (GradeVO)o2;

		 // �й� ���� (��������)
		 return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
		 // return Integer.parseInt("2206113") - Integer.parseInt("2206115");
		 // return 2206113 - 2206115;
		 // return -2; �̷��� �Ǹ� ���� ���� �� ũ�� ������ �������� �� ��.

		 //return s2.getName().toCompare(s1.getName());
	}
}
// E obj - ��Element��
// T - Type

public class Test169
{
	public static void main(String[] args)
	{
		// TreeSet �ڷᱸ�� �ν��Ͻ� ����
		TreeSet<String> set = new TreeSet<String>();

		// TreeSet �ڷᱸ�� set�� ��� �߰� �� add();
		set.add("�͸���Į��");
		set.add("��Ž���ڳ�");
		set.add("����ť");
		set.add("�����̸���");
		set.add("���ϸ�");
		set.add("����ġ���������Ҹ�");
		set.add("�������庥ó");
		set.add("�̿��������");
		set.add("¯���¸�����");
		set.add("�Ʊ����Ѹ������������");
		set.add("������̺�");
		
		// Iterator �� Ȱ���� set ��� ��ü ���
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println();
		//--==>> �͸���Į�� �����̸��� �������庥ó ������̺�
		//		 ��Ž���ڳ� ����ġ���������Ҹ� �Ʊ����Ѹ������������
		//		 �̿�������� ¯���¸����� ���ϸ� ����ť
		//-- ��Ҹ� ���ڿ��� ������ ���
		//   �����ټ� �� �������� ���� Ȯ��, �ֱ� ���� �ִ� �͵�� ���ؼ� ���� �־�� ���� Ȯ���ϰ� �߰��Ѵ�.
		//                                    ���� ���۾��� ��� �̷������ ������ ���ҽ� �Ҹ� ���ϴ�.

		System.out.println("------------------------------------------------------");

		// TreeSet �ڷᱸ�� �ν��Ͻ� ����
		//TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();
		//
		//                 ��
		//
		// MyCompartor Ŭ������ �����Ͽ�
		// compare() �޼ҵ带 �������� �� �ٽ� ����
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());

		// TreeSet �ڷᱸ�� set2 �� ��� �߰�
		set2.add(new GradeVO("2206113", "��ȿ��", 90, 80, 70));
		set2.add(new GradeVO("2206115", "�ſ���", 91, 81, 71));
		set2.add(new GradeVO("2206128", "�����", 88, 78, 68));
        set2.add(new GradeVO("2206139", "������", 70, 60, 50));
        set2.add(new GradeVO("2206150", "�����", 99, 82, 72));

		// Iterator �� Ȱ���� set2 ��� ��ü ���
		/*
		Iterator<GradeVO> it2 = set2.iterator();

		while(it2.hasNext())
		{
			System.out.print(it2.next() + " ");
		}
		System.out.println();
		//--==>> ���� �߻�(��Ÿ�� ����)
		//       Exception in thread "main" java.lang.ClassCastException: 
		//       GradeVO cannot be cast to java.lang.Comparable
		*/

		//
		//                 ��
		//
		// MyCompartor Ŭ������ �����Ͽ�
		// compare() �޼ҵ带 �������� �� �ٽ� ����
		/*
		Iterator<GradeVO> it2 = set2.iterator();
		while(it2.hasNext())
		{
			System.out.print(it2.next() + " ");
		}
		System.out.println();
		*/
		//--==>> GradeVO@15db9742 GradeVO@6d06d69c GradeVO@7852e922 GradeVO@4e25154f GradeVO@70dea4e
		//       ��ü�� ����� ���̱� ������ ���赵�� Ŭ������@�ؽ��ڵ�

		//                 ��

		// ��ü ��ü�� ���� ����ϴ� ���� �ƴ϶�
		// ��ü�� �����ִ� �Ӽ��� �����Ͽ� ����� �� �ֵ��� ó��
		Iterator<GradeVO> it3 = set2.iterator();
		while(it3.hasNext())
		{
			GradeVO vo = it3.next();
			System.out.printf("%7s %7s %4d %4d %4d\n", vo.getHak(), vo.getName(), vo.getKor(), vo.getEng(), vo.getMat());
		}
		System.out.println();

	}
} 