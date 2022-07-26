/*==============================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
  - Calendar Ŭ����
===============================================*/

/*
�� �ǽ� ����
   ������ �������� �Է¹޴� ��¥��ŭ ���� ��, ��, ��, ������
   Ȯ���Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
���� ��¥ : 2022-07-26 ȭ����   �� ���, �Է¾ƴ�.
�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

==========[Ȯ�� ���]=========
200�� �� : xxxx-xx-xx x����
==============================
����Ϸ��� �ƹ� Ű�� ��������...
*/

//�� Calendar �� ������ API Document ����~!!!
//   ��add()�� �޼ҵ� Ȯ���غ���!
//    : ���� ��¥�� �������� �� �� ���ϴ� ���� �޼ҵ�
//      �� ����ü.add(Calendar.DATE, ����);��

import java.util.Calendar;
import java.util.Scanner;

public class Test144
{
	public String weekCal(int w)
	{
		String week = "";
		switch(w)
		{
			case 1: week="�Ͽ���"; break;
			case 2: week="������"; break;
            case 3: week="ȭ����"; break;
			case 4: week="������"; break;
			case 5: week="�����"; break;
			case 6: week="�ݿ���"; break;  
			case 7: week="�����"; break;
		}
		return week;		
	}

	public static void main(String[] args)
	{
		/*
		//Calendar Ŭ���� ��� �ν��Ͻ� ����
		Calendar today = Calendar.getInstance();
		Test144 ob = new Test144();

		//���� �Ǵ�1
		int w = today.get(Calendar.DAY_OF_WEEK);
		String rweek = ob.weekCal(w);

		// ���� ��¥ ���
		System.out.println(today.get(Calendar.YEAR) + "-" + (today.get(Calendar.MONTH)+1) + "-" + today.get(Calendar.DATE) + " " + rweek);

		//��¥ �Է�
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
		int d = sc.nextInt();
		
		//add �޼ҵ� �� �� �߰�
		today.add(Calendar.DAY_OF_MONTH, d);
		
		//���� �Ǵ�2
		w = today.get(Calendar.DAY_OF_WEEK);
		rweek = ob.weekCal(w);

		System.out.println();
		System.out.println("==========[Ȯ�� ���]=========");
		System.out.println(d + "�� �� : " + today.get(Calendar.YEAR) + "-" + (today.get(Calendar.MONTH)+1) + "-" + today.get(Calendar.DATE) + " " + rweek);
		System.out.println("==============================");
		*/

		//Scanner Ŭ���� ��� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		//Calendar Ŭ���� ��� �ν��Ͻ� ����
		Calendar now = Calendar.getInstance();

		// �ֿ� ���� ����
		int nalsu;				//-- ����ڷκ��� �Է¹��� �� ��
		int y, m, d, w;			//-- ��, ��, ��, ����
		String[] week = {"��", "��", "ȭ", "��", "��", "��", "��"};

		// ���� ��,��,��,���� Ȯ��(�� �������� : get());
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH)+1;		//-- ��+1�� check~!!!
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);
		
		// ������ ��, ��, ��, ���� Ȯ�ΰ�� ���
		System.out.printf("���� ��¥ : %d-%d-%d %s\n", y, m, d, week[w-1]);
		
		System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
		nalsu = sc.nextInt();

		//check~!!!
		now.add(Calendar.DATE, nalsu);

		System.out.println();
		System.out.println("==========[Ȯ�� ���]=========");

		// printf �߰� ���� ����
		// ��%tF�� �� �� �ϸ� �����ؼ� ������ش�.
		// ��%tA�� 
		System.out.printf("%d�� �� : %tF %tA\n", nalsu, now, now);

		// String.format("%tF", �޷°�ü);
		// �� ��-��-�� ������ ���ڿ� ��ȯ

		// String.format("%tA", �޷°�ü);
		// �� ���� ������ ���ڿ� ��ȯ

		System.out.println("==============================");

        
	}	
}

// ���� ���
/*
2022-7-26 ȭ����
�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 5

==========[Ȯ�� ���]=========
2022-7-31 �Ͽ���
==============================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
���� ��¥ : 2022-7-26 ȭ
�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 174

==========[Ȯ�� ���]=========
174�� �� : 2023-01-16 ������
==============================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/

// �ڹٴ� date ���������� Ķ���� �� ���̻���Ѵ�. �ߴٷﺼ���ֵ��� ����.