/*==================================
  ���� �÷���(Collection) ����
====================================*/

/*
	Map �� Hashtable, HashMap

�� java.util.Map �������̽���
   Ű(key)�� ��(value)�� ����(mapping) �ϸ�
   ������ Ű�� ����� �� ����, �����ؾ� �ϸ�
   �� Ű�� �� ���� ������ �����ؾ� �Ѵ�.
   ��, �ϳ��� Ű ���� �����ϴ� �ϳ��� ���� ���� �ڷᱸ���̴�.

*/


/*
�� HashMap<K, V> Ŭ����
   
   - Hashtable Ŭ������ ���������� Map �������̽����� ��ӹ���
     HashMap Ŭ������ ����� Hashtable�� ����������
     Synchronization �� ���� ������ ���ü� ������ ���ٸ�
	 (��, ��Ƽ ������ ���α׷��� �ƴ� �����) multi thread unsafety
	 HashMap �� ����ϴ� ���� ������ ����ų �� �ִ�.

   - ����, HashMap �� Hashtable Ŭ������ �޸� null �� ����Ѵ�.
     
*/

import java.util.HashMap;
import java.util.Map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test171
{
	public static void main(String[] args) throws IOException
	{
		// HashMap �ڷᱸ�� �ν��Ͻ� ����
		//HashMap<String, String> map = new HashMap<String, String>();
		Map<String, String> map = new HashMap<String, String>();
		
		// map �̶�� HashMap �ڷᱸ���� ��� �߰�
		// �� put();
		map.put("��ȭ", "���˵���2");
		map.put("���", "���¿�Ŭ��");
        map.put("��ȭ", "������ũ");
        
		// �׽�Ʈ(Ȯ��) �� ���� Ȯ��
		System.out.println(map);
		//--==>> {���=���¿�Ŭ��, ��ȭ=���˵���2, ��ȭ=������ũ}
		//-- ������ ���� ���� Ȯ��
		//-- ������ ��� �ݳ� ������ �߰� ������ ���� ����


		// �� null ���� ó��
		//    �Ʒ��� ������ �Է� ������ ���� ��� ������ ������ �Է��� ����������
		//    ������ null �� key �� ���ε� "������"��
		//    ���� null �� key�� �����ϴ� null�� ����� ��Ȳ�� �߻��ϰ� �ȴ�.
		//   ��, HashMap�� null �� �ϳ��� ������ key�� �����Ѵ�.(���ȴ�)

		// key�� value ��� null
		map.put(null, null);

		// �׽�Ʈ(Ȯ��) �� ���� Ȯ��
		System.out.println(map);
		//--==>> {null=null, ���=���¿�Ŭ��, ��ȭ=���˵���2, ��ȭ=������ũ}
		//       -----------

		// value �� null
		map.put("��ȭ", null);
		System.out.println(map); // ���� Ȯ��
		//--==>> {null=null, ���=���¿�Ŭ��, ��ȭ=���˵���2, ��ȭ=null, ��ȭ=������ũ}
        //                                                       ------------
		
		// ket�� null
		map.put(null, "�𳪸���");
		System.out.println(map);
		//--==>> {null=�𳪸���, ���=���¿�Ŭ��, ��ȭ=���˵���2, ��ȭ=null, ��ȭ=������ũ}
		//        -------------                                        --------





		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ī�װ�, Ÿ��Ʋ �Է�(�ĸ� ����) : ");
		String[] temp;

		for(String str; ( (str = br.readLine() ) != null); )
		{
			temp = str.split(",");

			if(temp.length < 2)
			{
				System.out.print("ī�װ�, Ÿ��Ʋ �Է�(�ĸ� ����) : ");
				continue;
			}

			map.put(temp[0].trim(), temp[1].trim());
			System.out.println(map);
		}

	}
}