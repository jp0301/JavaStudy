

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

// ���� Ŭ����
public class Main
{
	public static void main(String[] args)  throws Exception
	{
		// �ʱ�ȭ��(���� ȭ��) ���
		Output op = new Output();

		boolean loop = true;

		while(loop)
		{
			op.mainLogo();
			op.startMenu();

			String path = System.getProperty("user.dir");
			File file = new File(path + "\\Storelist.csv");
			
			BufferedReader br = new BufferedReader(new BufferedReader(new FileReader(file)));

			String line = "";

			while((line = br.readLine()) != null)
			{
				System.out.println(line);
			}


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