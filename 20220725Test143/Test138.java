/*==============================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
  - StringBuffer Ŭ����
===============================================*/

/*
�� StringBuffer Ŭ����

   ���ڿ��� ó���ϴ� Ŭ������ String Ŭ�������� ��������
   String Ŭ������ ���� ���ڿ� �������� ������ �Ұ���������
   StringBuffer Ŭ������ ���ڿ��� ����� ��
   ���� ���ڿ��� ���� �ܰ迡�� ������ �� �ִ�.

   ��, StringBuffer ��ü�� �������� ���̸� �����Ƿ�
   ��ü�� �����ϴ� �������� �̸� �� ũ�⳪ ���� �����ϰų�
   ���� ������ ������ ũ�⸦ �ٲ� �� �ִ� ����� �����Ѵ�.

	
   // StringBuilder
   ����, JDK 1.5 ���ĺ��ʹ�
   ���ڿ��� ó���ϴ� StringBuilder ��� Ŭ������ �����Ѵ�.
   StringBuilder Ŭ������ ����� StringBuffer Ŭ������ ����������
   ���� ū �������� multi-thread unsafe ��� ���̴�.
   // StringBuffer = multi-thread safety~!!!
   thread = �⺻������ �۾����� ó���ϴ� ����
   ��, Syncronization �� ���� ������
   StringBuffer ���� ������ ���ü�(����ȭ) ������ ���ٸ�
   StringBuilder �� ����ϴ� ���� ������ ����ų �� �ִ�.
	
*/

public class Test138
{
	public static void main(String[] args)
	{
		String str1 = new String("seoul");
		String str2 = new String("seoul");

		System.out.println(str1 == str2);
		//--==>> false
		System.out.println(str1.equals(str2));
		//--==>> true
		//StringBuffer�� equals �޼ҵ�

		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		System.out.println(sb1 == sb2);
		//--==>> false
		System.out.println(sb1.equals(sb2));	// check~!!! �ȿ� ���빰�� ũ�� �񱳸� �ϴ� ���� �ƴϴ�.
		//--==>> false
		
		System.out.println("-----------------------------------------");

		System.out.println(sb1);
		//--==>> korea //StringBuffer�� ���
		
		System.out.println(sb1.toString());
		//--==>> korea //String ���

		System.out.println(sb1.toString().equals(sb2.toString()));
		// true
		//String �� equals �޼ҵ�

		System.out.println("-----------------------------------------");

		StringBuffer sb3 = new StringBuffer();
		//-- StringBuffer �⺻ ������ ȣ��(�ν��Ͻ� ���� ����)
		//   �⺻������ �����Ǵ� ������ ũ��� ��16��


		// capacity()
		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 16


		///////////////////////////////////////////////////////////////


		System.out.println(sb3);
		//--==>> ��

		/*
		String name ="�ڿ���";
		name += "������";
		name += "���";
		name += "�ָ�";

		System.out.println(name);
		//--==>> �ڿ�������������ָ�
		*/

		sb3.append("seoul");					// sb += "seoul";
		sb3.append("korea");					// sb += "korea";
		sb3.append("�츮����");					// sb += "�츮����";
		sb3.append("���ѹα�");					// sb += "���ѹα�";

		System.out.println(sb3);
		System.out.println(sb3.toString());
		//--==>> seoulkorea�츮������ѹα�
		//		 seoulkorea�츮������ѹα�
        
		//���� ũ�� �ٽ� Ȯ��
		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 34


		///////////////////////////////////////////////////////////////


		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase());
		//--==>> JAVA AND ORACLE

		String temp2 = "JAVA AND ORACLE";
		System.out.println(temp2.toLowerCase());
		//--==>> java and oracle

		//System.out.println(sb3.toUpperCase());
		//System.out.printn(sb3.toLowerCase());		
		//--==>> ���� �߻�(������ ����)

		String temp3 = sb3.toString();
		System.out.println(temp3.toUpperCase());
		//--==>> SEOULKOREA�츮������ѹα�
		System.out.println(sb3.toString().toLowerCase());
		//--==>> seoulkorea�츮������ѹα�


		// seoulkorea�츮������ѹα�

		// �� ��� ���ڿ�(sb3) �� seoul �տ�
		//    "�ѱ�" �̶�� ���ڿ� �߰�
		//    �� �ѱ�seoulkorea�츮������ѹα�
		sb3.insert(0, "�ѱ�");
		System.out.println("seoul �տ� ���ѱ��� �߰� : " + sb3.toString());
		//--==>> seoul �տ� ���ѱ��� �߰� : �ѱ�seoulkorea�츮������ѹα�


		// �� ��� ���ڿ�(sb3) �� korea ���ڿ� �ڿ�
		//    "���" �̶�� ���ڿ� �߰�
		//    ��, ��� ���ڿ��� �ε����� ������ ���� Ȯ������ �ʰ�...
		//    �� �ѱ�seoulkorea�츮������ѹα�
		
		//sb3.insert(sb3.lastIndexOf("��"), "���");
		//System.out.println("korea �ڿ� ������� �߰� : " + sb3.toString());

		// �׽�Ʈ ��
		System.out.println(sb3.toString());
		//--==>> �ѱ�seoulkorea�츮������ѹα�

		// �׽�Ʈ ��
		//sb3.insert(12, "���");
		//System.out.println("korea �ڿ� ������� �߰� : " + sb3.toString());
		//--==>> korea �ڿ� ������� �߰� : �ѱ�seoulkorea����츮������ѹα�
		
		// �׽�Ʈ ��
		// sb3.indexOf("korea");
		System.out.println(sb3.indexOf("korea"));
		//--==>> 7

		// �׽�Ʈ ��
		//System.out.println(sb3.insert(sb3.indexOf("korea"), "���"));
		//--==>> �ѱ�seoul���korea�츮������ѹα�
		
		// �׽�Ʈ ��
		//sb3.insert(sb3.indexOf("korea") + 5, "���");
		//System.out.println(sb3.toString());
		//--==>> �ѱ�seoulkorea����츮������ѹα�

		System.out.println(sb3.insert(sb3.indexOf("korea") + "korea".length(), "���"));
		//--==>> �ѱ�seoulkorea����츮������ѹα�

		// �� ��� ���ڿ�(sb3) ����
		//    ��"�츮����"�����ڿ� ����
		//sb3.delete(14, 18);
		//System.out.println(sb3);
		//--==>> �ѱ�seoulkorea������ѹα�

		//sb3.indexOf("��") �� 14
		//sb3.indexOf("��") �� 18
		//sb3.delete(sb3.indexOf("��"),sb3.indexOf("��"));

		sb3.delete(sb3.indexOf("�츮����"), sb3.indexOf("�츮����") + "�츮����".length());
		System.out.println(sb3);
		//--==>> �ѱ�seoulkorea������ѹα�

		// �� ��� ���ڿ�(sb3)����
		//    ��"korea"�� ���� ���ڿ� ����(korea ����)
		//    �� �ѱ�seoulkorea������ѹα� �� �ѱ�seoul

		//sb3.delete(7, 18);
		sb3.delete(sb3.indexOf("korea"), sb3.length());
		System.out.println(sb3);
		//--==>> �ѱ�seoul


		///////////////////////////////////////////////////////////////

		// ���� ũ�� �ٽ� Ȯ��
		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 34

		// ���ڿ�(sb3)�� ���� Ȯ��
		System.out.println("���ڿ��� ���� : " + sb3.length());
		//--==>> ���ڿ��� ���� : 7

		// ���� ũ�� ����
		// �� ���� ���ڿ��� ��Ƶ� �� �ִ� ������ ũ���...
		// trimToSize()
		sb3.trimToSize();

		// ���� ũ�� ���� ���� ���� ũ�� �ٽ� Ȯ��
		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 7
		

	}
}
