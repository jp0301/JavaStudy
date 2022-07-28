

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Test1001
{
	public static void main(String[] args)
	{
		List<String> mList = new ArrayList<String>();

		mList.add("1");
		mList.add("2");
		mList.add("3");
		// 스트링배열의 형태로 리스트를 배열로 변경
		String[] sArrays = mList.toArray(new String[mList.size()]);
		
		for(String s : sArrays)
		{
			System.out.print(s + " ");
		}
		System.out.println();

		List<String> mNewList = Arrays.asList(sArrays);

		for(String s : mNewList)
		{
			System.out.print(s + " ");
		}
		System.out.println();

	}
}