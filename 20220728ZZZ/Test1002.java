
import java.util.HashSet;
import java.util.Set;

public class Test1002
{
	public static void main(String[] args)
	{
		Set<String> dog = new HashSet<String>();
		
		dog.add("Ǫ��");
		dog.add("��縮Ʈ����");
        dog.add("��ũ���׸���");
        dog.add("������");
        dog.add("�ڽ���Ʈ");
        
		for(String s : dog)
		{
			System.out.print(s + " ");
		}
		System.out.println();


		dog.add("��Ƽ��");
		dog.add("�����ݸ�");
		dog.add("����ġ");


		dog.add("������");
        dog.add("������");
        dog.add("������");
        dog.add("������");
        

		dog.add("�ڽ���Ʈ");
        dog.add("�ڽ���Ʈ");
        dog.add("�ڽ���Ʈ");
        dog.add("�ڽ���Ʈ");
        
        dog.add("��Ƽ��");
        dog.add("�����ݸ�");
        dog.add("����ġ");
        
		dog.add("Ǫ��");
        dog.add("��縮Ʈ����");
        dog.add("��ũ���׸���");
        dog.add("������");
        dog.add("�ڽ���Ʈ");

		for(String s : dog)
		{
			System.out.print(s + " ");
		}
        

        
        
        
	}
}