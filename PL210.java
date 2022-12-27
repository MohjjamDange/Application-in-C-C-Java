import java.lang.*;
import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

class PL210
{
	public static void main(String a[])
	{
		try
		{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the File Name");
		String fname = sobj.nextLine();
		
		File fobj = new File(fname);
		
		System.out.println("Enter the New File Name Which You Want to Create");
		String fNewName = sobj.nextLine();
		
		File fnewobj = new File(fNewName);
		
		boolean bobj = fnewobj.createNewFile();
		if(bobj == true)
		{
			System.out.println("File Succesfully Created");
			
		}
		if(fobj.exists())
		{
			FileInputStream iobj = new FileInputStream(fobj);
			FileOutputStream oobj = new FileOutputStream(fnewobj);
			
			byte buffer[] = new byte[100];
			int iRet = 0;
			while((iRet = iobj.read(buffer))!= -1)
			{
				oobj.write(buffer,0,iRet);
			}
			
		}
		}
		catch( IOException obj)
		{
			System.out.println(obj);
		}
		
		
	}
	
	
}