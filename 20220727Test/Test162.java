/*==================================
  ���� �÷���(Collection) ����
====================================*/

// �ڷᱸ�� ��ü ���� �� ���� ��
// ����� ���� Ŭ���� Ȱ��
// �� �ڷ���

import java.util.Vector;

// Ŭ���� �� ����� ���� �ڷ������� Ȱ��
class MyData
{
	// �ֿ� �Ӽ� ���� �� �ֿ� ���� ����(��� ����)
	private String name;		//-- �̸�
	private int age;			//-- ����
		
	// getXxx() �� getter
	// setXxx() �� setter

	// getter / setter ����
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	// ������(�Ű����� 2���� ������) �� ����� ���� ������
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	// �� ����� ���� �����ڰ� ������ ���
	//    default �����ڰ� �ڵ����� ���Ե��� �ʱ� ������
	//    default ������ ������ �����ڸ� ����� ���� �����ڷ�
	//    �߰� �����ϰ� �Ǵ� ���� �Ϲ����� Ŭ���� ���� ����
	//    (�ݵ�� �����ؾ� �Ѵٴ� �������� ��Ģ�� ����)

	// ������(�Ű����� ���� ������) �� ����� ���� ������
	public MyData()
	{
		//this("", 0);
		name ="";
		age = 0;
	}

}

public class Test162
{
	public static void main(String[] args)
	{
		// ���� �ڷᱸ�� ����
		Vector<MyData> v = new Vector<MyData>();

		// ���� �ڷᱸ�� v ��
		// ������ 13�� / ���̰� 7�� / ������ 3��
		// ��Ƴ���

		// ��� ��
		/*
		MyData st1 = new MyData();
		st1.setName("������");
		st1.setAge(13);
		v.add(st1);

		MyData st2 = new MyData();
		st2.setName("������");
		st2.setAge(13);
		v.add(st2);

		MyData st3 = new MyData();
		st3.setName("������");
		st3.setAge(13);
		v.add(st3);
		*/

		// ��
		/*
		MyData s1 = new MyData("������", 13);
		v.add(s1);

		MyData s2 = new MyData("���̰�", 7);
		v.add(s2);

        MyData s3 = new MyData("������", 3);
		v.add(s3);
		*/

		// ��
		v.add(new MyData("������", 13));
		v.add(new MyData("���̰�", 7));
		v.add(new MyData("������", 3));


		System.out.println("���� ��� ���� : " + v.size());


		/*
		System.out.print("��ü ��� ��� : ");
		for(MyData str : v)
			System.out.print(str + " ");
		System.out.println();
		*/

		System.out.println("��ü ��� ��� : ");
		for(MyData str : v)
			System.out.printf("�̸� : %s  ���� : %d\n", str.getName(), str.getAge());
		System.out.println();

        







      

	}
}



/*
1. �Ӽ��� �����ϴ� Ŭ����
		��
2. ����� ���� �ڷ��� Ȱ��
		��
3. Data Transfer Object(DTO)
		��
4. Bean
*/