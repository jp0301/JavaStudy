/*==================================
  ���� �÷���(Collection) ����
====================================*/

// Test163 Ŭ������ �ϼ��Ͽ� ���� ����� ���� ���α׷��� �����Ѵ�.

/*
���� ��)

	[ �޴� ���� ]=====
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	==================
>> �޴� ���� (1~6) : 1

1��° ��� �Է� : ������
1��° ��� �Է� ����~!!!
��� �Է� ���(Y/N)? : y

2��° ��� �Է� : ���ҿ�
2��° ��� �Է� ����~!!!
��� �Է� ���(Y/N) : N

	[ �޴� ���� ]=====
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	==================
>> �޴� ���� (1~6) : 2

[���� ��ü ���]
������
���ҿ�
���� ��ü ��� �Ϸ�~!!!

	[ �޴� ���� ]=====
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	==================
>> �޴� ���� (1~6) : 3

>> �˻��� ��� �Է� : ������

[�˻� ��� ���]
�׸��� �����մϴ�.

	[ �޴� ���� ]=====
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	==================
>> �޴� ���� (1~6) : 3

>> �˻��� ��� �Է� : �ݺ���

[�˻� ��� ���]
�׸��� �������� �ʽ��ϴ�.

	[ �޴� ���� ]=====
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	==================
>> �޴� ���� (1~6) : 4

>> ������ ��� �Է� : �躸��

[���� ��� ���]
�׸��� �������� �ʾ� ������ �� �����ϴ�.

	[ �޴� ���� ]=====
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	==================
>> �޴� ���� (1~6) : 4

>> ������ ��� �Է� : ������

[���� ��� ���]
������ �׸��� �����Ǿ����ϴ�.

	[ �޴� ���� ]=====
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	==================
>> �޴� ���� (1~6) : 5

>> ������ ��� �Է� : ������

[���� ��� ���]
������ ����� �������� �ʽ��ϴ�.

	[ �޴� ���� ]=====
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	==================
>> �޴� ���� (1~6) : 5

>> ������ ��� �Է� : ���ҿ�
>> ������ ���� �Է� : ������

[���� ��� ���]
������ �Ϸ�Ǿ����ϴ�.

	[ �޴� ���� ]=====
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	==================
>> �޴� ���� (1~6) : 2

[���� ��ü ���]
������
���� ��ü ��� �Ϸ�~!!!

	[ �޴� ���� ]=====
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	==================
>> �޴� ���� (1~6) : 6

���α׷� ����~!!!
����Ϸ��� �ƹ� Ű�� ��������...

*/

import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Menus // �� �ϼ�
{
	public static final int E_ADD = 1;		//-- ��� �߰�
	public static final int E_DISP = 2;		//-- ��� ���
    public static final int E_FIND = 3;		//-- ��� �˻�
    public static final int E_DEL = 4;		//-- ��� ����
    public static final int E_CHA = 5;		//-- ��� ����
    public static final int E_EXIT = 6;		//-- ���α׷� ����  
}

public class Test163
{
	// �ֿ� �Ӽ� ����
	private static final Vector<Object> vt; //-- �ڷᱸ��
	private static final BufferedReader br;	//-- �Է� �� Ȱ��
	private static Integer sel;				//-- ���� ��
	private static String con;				//-- ��� ���� ����
	
	// static �ʱ�ȭ ��
	static
	{
		// Vector �ڷᱸ�� ����
		vt = new Vector<Object>();
		// BufferedReader Ŭ���� �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));

		// ����� �Է°� �ʱ�ȭ
		sel = 1;
		con = "Y";
	}
	


	//-------------------------------------------------------------------------------
	// �޴� ��� �޼ҵ�
	public static void menuDisp()
	{
		System.out.println();
		System.out.println("\t[ �޴� ���� ]=====");
		System.out.println("\t1. ��� �߰�");
		System.out.println("\t2. ��� ���");
		System.out.println("\t3. ��� �˻�");
		System.out.println("\t4. ��� ����");
		System.out.println("\t5. ��� ����");
		System.out.println("\t6. ����");
		System.out.println("\t==================");
		System.out.print(">> �޴� ���� : ");
	}

	//-------------------------------------------------------------------------------
	// �޴� ���� �޼ҵ�
	public static void menuSelect() throws IOException, NumberFormatException
	{
		do
		{
			sel = Integer.parseInt(br.readLine());
		}
		while (sel < 1 || sel > 6);
	}

	//-------------------------------------------------------------------------------
	// �޴� ��� ȣ�� �޼ҵ�
	public static void menuRun() throws IOException
	{
		switch(sel)
		{
			case Menus.E_ADD : addElement(); break;
			case Menus.E_DISP : dispElement(); break;
			case Menus.E_FIND : findElement(); break;
			case Menus.E_DEL : delElement(); break;
			case Menus.E_CHA : chaElement(); break;
			case Menus.E_EXIT : exit(); break;
			default : System.out.println("�޴� ���� �����Դϴ�."); break;
		}
	}

	//-------------------------------------------------------------------------------
	// �ڷᱸ���� ��� �߰�(�Է�) �޼ҵ�
	public static void addElement() throws IOException
	{
		System.out.println();
		do
		{
			System.out.printf("%d��° ��� �Է� : ", vt.size()+1);
			String temp = br.readLine();
			vt.add(temp);
			
			System.out.printf("%d��° ��� �Է� ����~!!!\n", vt.size());
			System.out.printf("��� �Է� ���(Y/N) : ");
			con = br.readLine().toUpperCase(); // y �� Y , n �� N
		}
		while (con.equals("Y")); // [Y]�� true, [N]�� false
	}

	//-------------------------------------------------------------------------------
	// �ڷᱸ�� ��ü ��� ��� �޼ҵ�
	public static void dispElement()
	{
		System.out.println();
		System.out.println("[���� ��ü ���]");

		for(int i = 0; i < vt.size() ; i++)
			System.out.println(vt.get(i));
		System.out.println("���� ��ü ��� �Ϸ�~!!!");
	}

	//-------------------------------------------------------------------------------
	// �ڷᱸ�� �� ��� �˻� ��� �޼ҵ�
	public static void findElement() throws IOException
	{
		System.out.println();
		System.out.print(">> �˻��� ��� �Է� : ");
		String temp = br.readLine();
		
		int i = vt.indexOf(temp);		// ���� �� ������ -1 ��ȯ�ɰ���

		System.out.println("[�˻� ��� ���]");
		if(i < 0)
			System.out.println("�׸��� �������� �ʽ��ϴ�.");
		else
			System.out.println("�׸��� �����մϴ�.");
	}

	//-------------------------------------------------------------------------------
	// �ڷᱸ�� �� ��� ���� ��� �޼ҵ�
	public static void delElement() throws IOException
	{
		String temp = "";
		
		System.out.println();
		System.out.print(">> ������ ��� �Է� : ");
		temp = br.readLine();

		int i = vt.indexOf(temp);

		System.out.println("[���� ��� ���]");
		if(vt.contains(temp))						// ���Ե������� true ��ȯ
		{
			vt.remove(i);
			System.out.println(temp + " �׸��� �����Ǿ����ϴ�.");
		}
		else
			System.out.println("�׸��� �������� �ʾ� ������ �� �����ϴ�.");
	}

	//-------------------------------------------------------------------------------
	// �ڷᱸ�� �� ��� ����(����) ��� �޼ҵ�
	public static void chaElement() throws IOException
	{
		System.out.println();
		System.out.print(">> ������ ��� �Է� : ");
		String temp = br.readLine();

		if(vt.contains(temp))
		{
			System.out.print(">> ������ ���� �Է� : ");
			String newTemp = br.readLine();

			int i = vt.indexOf(temp);			
			vt.set(i, newTemp);

			System.out.println("\n[���� ��� ���]");
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		}
		else
		{
			System.out.println("\n[���� ��� ���]");
			System.out.println("������ ����� �������� �ʽ��ϴ�.");
		}
	}

	//-------------------------------------------------------------------------------
	// ���α׷� ���� �޼ҵ� �� �ϼ�
	public static void exit()
	{
		System.out.println("\n���α׷� ����~!!!");
		System.exit(-1);
	}


	//-------------------------------------------------------------------------------
	// main() �޼ҵ� �� �ϼ�
	public static void main(String[] args) throws IOException, NumberFormatException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
	}
}