/*=============================================
      ���� �ڹ� �⺻ ���α׷��� ����
   - �ڹ� �⺻ ����� : System.util.Scanner
==============================================*/

// �� java.util.Scanner
//    �ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//    ����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� �����̴�.
//    �ۼ��� ���� ��ū�� ��next()�� �޼ҵ带 ���
//    �ٸ� ����(�ڷ���)�� ������ ��ȯ�� �� �ִ�.

import java.util.Scanner;
//import java.io.IOException;

public class Test017
{
	public static void main(String[] args) //throws IOException
	{
		// Scanner Ŭ���� ����� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in); //-- new Scanner + Scanner();
		
		//�ֿ� ���� ����
		String name;		//-- �̸�
		int kor, eng, mat;	//-- ����, ����, ����
		
		//���� �� ó��
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.next();
		
		// �׽�Ʈ(Ȯ��)
		//System.out.println("�Է��� �̸� : " + name);
		
		System.out.print("���� ���� �Է� : ");
		//kor = Integer.parseInt(br.readLine());
		kor = sc.nextInt();

		System.out.print("���� ���� �Է� : ");
		eng = sc.nextInt();

		System.out.print("���� ���� �Է� : ");
		mat = sc.nextInt();


		//���� ��� ���
		System.out.println();
		System.out.println(">> �̸� : " + name);
		//System.out.println(">> ���� : " + kor + eng + mat);
		System.out.println(">> ���� : " + (kor + eng + mat));



	}
}


// ���� ���
/*
�̸��� �Է��ϼ��� : �ڿ���
���� ���� �Է� : 10
���� ���� �Է� : 20
���� ���� �Է� : 30

>> �̸� : �ڿ���
>> ���� : 60
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/