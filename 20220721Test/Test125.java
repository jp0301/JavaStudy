/*==============================
  ���� Ŭ���� ��� ����
   - ��ø Ŭ����
===============================*/

/*
�� Annonymous Ŭ����(�͸��� Ŭ���� : ���� Ŭ����)

   - AWT �� �ȵ���̵� �̺�Ʈ ó������ �Ϲ������� ���
   - ���� Ŭ���� �޼ҵ带 �ϳ� ���� �������� �ʿ伺�� ���� �� ���
   - Ŭ������ ��ü�� �ʿ��ϸ� �� �ٽ� Ŭ������ �����ؾ� �ϴ�
     ���ŷο����� ���� ����ϰ� ��ü ������ �ʿ��� ���
	 �͸��� Ŭ������ �����Ͽ� ó���� �� �ִ�.


�� ���� �� ����
   
   new ����Ŭ������ ������()
   {
		�������������� �ڷ��� �޼ҵ�()
		{
			...;
		}
   };		�� check~!!! �����ݷ�


*/

//import java.lang.*; //-- �츮 ���� �Ⱥ������� �׻� �پ��ִ� �����̴�.
//             ��import java.lang.String;
//             ��import java.lang.System;
//             ��import java.lang.Object;


class Test3 //extends Object
{
	/*
	Object �� �����~!!!

	public String toString()
	{
		...;
	}

	*/

	public Object getString()
	{
		//return new Object()
		//       ------------ Object ��

		//return new Object(){  Ư�� �޼ҵ� �籸��  };

		return new Object()
		{
			  //Ư�� �޼ҵ� �籸�� �� ������
		      @Override
			  public String toString()
			  {
			    	return "�͸��� Ŭ����...";
			  }
		};		//-- �����ݷ� (�� �ۼ� �� ���� �߻�)
	}

	
}



public class Test125 // extends Object
{
	/*
	Object �� ����� ���~!!!
	*/

	public static void main(String[] args)
	{
		Test3 ob1 = new Test3();

		System.out.println(ob1.toString());
		//--==>> Test3@15db9742

		System.out.println(ob1.getString());
		//--==>> �͸��� Ŭ����...

		
	}
}