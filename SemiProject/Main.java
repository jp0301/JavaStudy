



import java.util.Scanner;

// ���� Ŭ����
public class Main
{
	public static void main(String[] args)
	{
		// �ʱ�ȭ��(���� ȭ��) ���
		Output op = new Output();

		boolean loop = true;

		while(loop)
		{
			op.mainLogo();
			op.startMenu();

			Scanner sc = new Scanner(System.in);

			System.out.println();
			System.out.print("��ȣ �Է�(����) : ");
			String number = sc.nextLine();

			try
			{
				if(number.equals("1"))
				{
					
				}
				else if(number.equals("2"))
				{

				}
			}
			catch (Exception e)
			{
				System.out.println("��?");
				e.printStackTrace();
			}

		} // end while

		System.out.println();




	}
}