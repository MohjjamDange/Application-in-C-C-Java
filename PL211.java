import java.lang.*;
import java.util.*;
import java.io.*;

class PL211
{
	public static void main(String a[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Folder Name");
		String fname = sobj.nextLine();
		
		File fobj = new File(fname);
		
		File AllFile[] = fobj.listFiles();
		
		for(int i = 0; i < AllFile.length; i++)
		{
			System.out.println(AllFile[i].getName());
		}
		
		
		
	}
	
	
	
}