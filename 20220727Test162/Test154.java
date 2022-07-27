/*========================================================
  ���� �÷��� �����ӿ�ũ(Collection Framework) ����
=========================================================*/

/*
�� �÷��� �����ӿ�ũ(Collection Framework)
   = �÷���(Collection) + �����ӿ�ũ(Framework)
     ------------------   ---------------------
	     |                �� ȯ��, Ʋ, ���   �̴�.
	    ���� �� ����ǰ, ����ǰ, (����, �������) ����, ����, ����, ����
		        -------------------------------------------------------
				             ��Ƴ��� �͵�... ���ִ� �͵�

  ==> �ڷᱸ��

�� �ڷ�
   �ڷ��ϰ� �����´ٸ���.
   ���� ����κ��� �ܼ��� �����̳� ������ ���� ������
   ����̳� ������ ���� �Ǵ� �� ������ ����.

   ��

�� �ڷᱸ��
   �ڷ� ó���� ���� �ڷ��� ǥ��, ����, ����, ���� ��
   �̿뿡 ���� ��� ���� ������ �����Ͽ� ���α׷��� ����ϰ�
   ��ǻ�Ϳ� ���� ó���Ǵ� �������� ������ �ڷ��� ǥ��, ����, ���� ��
   ó���� ���� �˰����� �ۼ� �� ���ð� �̿� ����� �����ϴ� �о�.

   ��

�� �÷��� �����ӿ�ũ(Collection Framework)
   �÷���(��Ƴ��� �����͵�)�� ǥ���� ������ ���� ���ϵ� ��Ű��ó��
   �÷��� �����ӿ�ũ�� �����ϴ� ��Ҵ� ������ ����.

   1. �������̽�(Interface)
      �⺻������ �÷��ǿ� �ʿ��� ������ ���� ����� �����Ѵ�.
	  ���� ���, list�� �߰�, ����, �˻� ���� ����� �����ϴ�
	  �÷��� �������̽��� �����ϸ�
	  �� �÷��Ǹ��� ������ �������̽��� ���ǵǾ� �ִ�.

   2. ����(Implementation)
      �������̽��� ������ Ŭ������ �� �÷�����
	  ���� � �ڷᱸ���� �̿��Ͽ� ǥ���ߴ��Ŀ� ����
	  �÷����� ������ �޶����� �ȴ�.

   3. �˰�����(Algoriths)
      �� �÷��ǵ鸶�� �����ϰ� ���� �� �ִ� �޼ҵ带 �ǹ��Ѵ�.
		
�� �ڹ��� �÷����� �߰��� �÷��� �����ӿ�ũ ��� ���� ���ǵǾ� �����Ƿ�
   �� �÷��� �������� �����Ǵ� �޼ҵ��� �ϰ����� �ֱ� ������
   �� ���� �÷����� �����θ� �ٸ� �÷����� ����ϴµ� �����ϴ�.
*/


/*
�� ����(Stack)

   Stack Ŭ������ ������Ʈ ���Լ���(LIFO) ������ Stack �� ��Ÿ����.
   �̴� ����(Vector)�� �������� ó���ϴ� 5���� �޼ҵ��
   ����(Vector) Ŭ������ Ȯ���ϰ� �ȴ�.

   ����� push() �޼ҵ�� pop() �޼ҵ尡 �����Ǵ� �� �ܿ�
   ������ ���� �׸����� peek()�� �ǽ��ϴ� �޼ҵ�,
   ������ ����ִ����� ���θ� Ȯ���ϴ� �޼ҵ� isEmpty(),
   �������� �׸��� ã�Ƽ� ���ηκ��� �� ��°������ ã�Ƴ��� �޼ҵ� ���� �����ȴ�.

   ������ ó������ �ۼ��Ǿ��� ��, �׸��� �������� �ʴ´�.

   - boolean empty()
     ������ ����ִ��� Ȯ���Ѵ�.
   - E Object peek()
     ������ �� ���� ��ü�� ���ÿ��� �������� �ʰ� ��ȯ�Ѵ�.
   - E Object pop()
     ������ �� ���� ��ü�� ��ȯ�ϰ� ���ÿ��� �����Ѵ�.
   - E Object push(E item)
     ��ü�� ���� �ڷᱸ���� �����Ѵ�.
   - int search(Object o)
     ������ �� ���������� �Ķ���� ������ �Ѱܹ��� ��ü������ �Ÿ��� ��ȯ�Ѵ�.
	 �� ���� ��ü�� ��� 1�� ��ȯ�ϰ� �� �Ʒ� ��ü�� 2�� ��ȯ�ϴ� ����.
	 
*/

// ���׸�, ���׸� ǥ����

import java.util.Stack;

public class Test154
{
	public static void main(String[] args)
	{
		// Stack �ڷᱸ�� ����
		Stack<Object> myStack = new Stack<Object>();
		
		String str1 = "�ڿ���";
		String str2 = "������";
		String str3 = "���";
		String str4 = "�ָ�";

		// myStack �̶�� Stack �ڷᱸ�� �ȿ� str1 ~ str4 ���� ��Ƴ���
		// add(), push()
		myStack.add(str1);
		myStack.add(str2);
		myStack.add(str3);
		myStack.add(str4);
		// Object �س��� ������ ���� ���� String

		// peek() : ���� �� ���� ��ü ��ȯ, �������� �ʴ´�.
		String val1 = (String)myStack.peek(); // �ٿ� ĳ����
		System.out.println("val1 : " + val1);
		//--==>> val1 : �ָ�

		String val2 = (String)myStack.peek();
		System.out.println("val2 : " + val2);
		//--==>> val2 : �ָ�

		String val3 = (String)myStack.peek();
		System.out.println("val3 : " + val3);
		//--==>> val2 : �ָ�
		
		String value="";

		// myStack �̶�� �̸��� ���� Stack �ڷᱸ����
		// �����Ͱ� ����ִ� ���°� �ƴ϶��... (��, ä���� �ִ� ���¶��...)
		// isEmpty()
	
	   

	    // <�Ʒ� while�� ���� ���ư��� ���>
	    // �� �ָ� ��� ������ �ڿ���    �� ��� ������ �ڿ���
		//    !false ��  true                   // !false ��  true

	    // �� ������ �ڿ���      �� �ڿ���                    
		//    !false ��  true    // !false ��  true   


		while (!myStack.isEmpty())   
		{
			// pop() : ���� �� ���� ��ü ��ȯ. �����Ѵ�.
			value = (String)myStack.pop();
			System.out.println("value : " + value);
		}
		//--==>>
		/*
		value : �ָ�
		value : ���
		value : ������
		value : �ڿ���
		*/

	}
}