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

public class Test019
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot;
		

		// ���� �� ó��
		System.out.print("�̸�,����,����,���� �Է�(��,������) : ");
		// �̸�,����,����,���� �Է�(��,������) : �ڿ���,10,20,30

		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		//               ---------
		//           "�ڿ���,10,20,30"
		//
		// new Scanner("�ڿ���,10,20,30").useDelimiter("\\s*,\\s*");
		//                               .�����ڻ��()
		//											   "\\s*,\\s*"
		//
		//      "\n"   "\t"  "\\" �� "\"			   "\s*,\s*"
		//												---
		//									�����Ǹ�繮�ڿ�,�����Ǹ�繮�ڿ�
		//   Ȳ�ݵ����������������ϴ�,0,20,100
		//   ����
		
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		tot = kor + eng + mat;

		// ��� ���
		System.out.println("\n>> �̸� : " + name);
		System.out.println(">> ���� : " + tot);

	}

}

// ���� ���
/*
�̸�,����,����,���� �Է�(��,������) : �ڿ���,10,20,30

>> �̸� : �ڿ���
>> ���� : 60
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/