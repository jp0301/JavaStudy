
import java.util.HashSet;
import java.util.Set;

public class Test1002
{
	public static void main(String[] args)
	{
		Set<String> dog = new HashSet<String>();
		
		dog.add("Çªµé");
		dog.add("°ñµç¸®Æ®¸®¹ö");
        dog.add("¿äÅ©¼ÅÅ×¸®¾î");
        dog.add("Áøµ¾°³");
        dog.add("´Ú½ºÈÆÆ®");
        
		for(String s : dog)
		{
			System.out.print(s + " ");
		}
		System.out.println();


		dog.add("¸»Æ¼Áî");
		dog.add("º¸´õÄÝ¸®");
		dog.add("½ºÇÇÄ¡");


		dog.add("Áøµ¾°³");
        dog.add("Áøµ¾°³");
        dog.add("Áøµ¾°³");
        dog.add("Áøµ¾°³");
        

		dog.add("´Ú½ºÈÆÆ®");
        dog.add("´Ú½ºÈÆÆ®");
        dog.add("´Ú½ºÈÆÆ®");
        dog.add("´Ú½ºÈÆÆ®");
        
        dog.add("¸»Æ¼Áî");
        dog.add("º¸´õÄÝ¸®");
        dog.add("½ºÇÇÄ¡");
        
		dog.add("Çªµé");
        dog.add("°ñµç¸®Æ®¸®¹ö");
        dog.add("¿äÅ©¼ÅÅ×¸®¾î");
        dog.add("Áøµ¾°³");
        dog.add("´Ú½ºÈÆÆ®");

		for(String s : dog)
		{
			System.out.print(s + " ");
		}
        

        
        
        
	}
}