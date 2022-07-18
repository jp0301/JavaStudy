/*==============================================
      ���� �ֹε�Ϲ�ȣ ��ȿ�� �˻� ����
  =============================================*/

/*
�� �ֹε�Ϲ�ȣ ���� ����

   �� ������ �ڸ��� ������ ���ڸ� ���� ��Ģ�� �°� ���Ѵ�.
      
	  123456-1234567 (�ֹι�ȣ)
	  ****** ******  ------------- �� �ڸ����� ���ϱ�
	  234567 892345  (�� �ڸ��� ������ ��)


   �� ��Ģ�� �°� ���� ������ ������ ����� ��� ���Ѵ�.

  ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3 
      * * * * * *   * * * * * *
	  2 3 4 5 6 7   8 9 2 3 4 5
	  ----------------------------
	  �� 14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15

		 == 217

  ex) 9 8 0 3 0 1   1 3 8 8 8 2 6
      * * * * * *   * * * * * *
	  2 3 4 5 6 7   8 9 2 3 4 5
	  ----------------------------
	  �� 18+24+0+15+0+7+8+27+16+24+32+10

		 == 181
	  
         181 % 11 = 6 ��� ����


   �� ������ ������� 11�� ������ ������������ ���Ѵ�.
        
          19      �� ��(X) 	  
  	    --------
	11 | 217
         11
       -----------
	     107
		  99
	   -----------
	       8      �� ������(��)



   �� 11���� ������ 8�� �� ������� ���Ѵ�.
     
	  11 - 8 �� 3

	  �� ���� ó�� �������� �������� 0�� ��� �� 11 - 0 �� 11
	  					    �������� 1�� ��� �� 11 - 1 �� 10

		 �̸� �ٽ� 10���� ������ �������� ���Ѵ�.     11 �� 1
		 											  10 �� 0


   �� ���� ���� ����� �ֹι�ȣ�� �����ϴ� ������ ���ڿ� ��ġ�ϴ����� ���θ� ���Ͽ� Ȯ���Ѵ�.
      ��ġ �� ��ȿ�� �ֹι�ȣ
	  ����ġ �� �߸��� �ֹι�ȣ
*/



//���� ��)
// �ֹι�ȣ�Է�(xxxxxx-xxxxxxx) : 123456-12345678 �� �Է� ���� �ʰ�
// >> �Է� ����~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// �ֹι�ȣ�Է�(xxxxxx-xxxxxxxx) : 123456-123456  �� �Է� ���� �̴�
// >> �Է� ����~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// �ֹι�ȣ�Է�(xxxxxx-xxxxxxxx) : 750615-1252085  �� ��ȿ�� �ֹι�ȣ
// >> ��Ȯ�� �ֹι�ȣ~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// �ֹι�ȣ�Է�(xxxxxx-xxxxxxxx) : 750615-1252086  �� �߸��� �ֹι�ȣ
// >> �߸��� �ֹι�ȣ~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� ���� �ذ��� ���� �߰� ��~!!!

//    �迭.length             �� �迭�� ����(�迭���� ����) ��ȯ
//    ���ڿ�.length()         �� ���ڿ��� ���� ��ȯ
//    ���ڿ�.substring()      �� ���ڿ� ����
//    ���ڿ�.substring(m, n)  �� ���ڿ� m��° ��ġ���� n-1��° ��ġ���� ����(�ε����� 0����)
//    ���ڿ�.substring(m)     �� ���ڿ� m��° ��ġ���� ���ڿ��� ������ ����(�ε����� 0����)


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test106
{
	public static void main(String[] args) throws IOException
	{

		// �׽�Ʈ
		//String strTemp = "�ڿ���";
		//System.out.println(strTemp.length());
		//--==>> 3
		
		//strTemp = "���ع��� ��λ���";
		//System.out.println(strTemp.length());
		//--==>> 9

		//strTemp = "study-hard";
		//System.out.println(strTemp.length());
		//--==>> 10
		
		//---------------------------------------------

		//String strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//System.out.println(strTemp.substring(13, 17));
		//--==>> NOPQ

		//String strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//System.out.println(strTemp.substring(13, 57));
		//--==>> ���� �߻�(��Ÿ�� ����)
		//       StringIndexOutOfBoundsException


		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int[] ch = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		int tot = 0;


		System.out.print("�ֹι�ȣ�Է�(xxxxxx-xxxxxxx) : ");
		str = br.readLine();
		
		if(str.length() > 14 || str.length() < 14)
		{
			System.out.println("�Է� ����~!!!");
			return;
		}
		

		for(int i=0; i < 13; i++) // 13�� �����ϰ� 12�������� ���� �ϱ�
		{
			if(i==6)
				continue;

			tot += ch[i] * Integer.parseInt(str.substring(i, (i+1)));
		}


		int result = 11 - (tot % 11);
		result %= 10;

		
		//System.out.println("- ������ : " + result);
		//System.out.println("- �ֹι�ȣ 13��° ���� : " + str.substring(13));


		if(result == Integer.parseInt(str.substring(13)))
			System.out.println("��Ȯ�� �ֹι�ȣ~!!!");
		else
			System.out.println("�߸��� �ֹι�ȣ~!!!");
		
		
	}
}





