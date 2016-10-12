package findInFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SearchInFile
{
	public static long indexOf(File file, char c)
	{
		return indexOf(file, c, 0);
	}

	public static long indexOf(File file, char c, long startByte)
	{
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream(file);
			long count = 0;
			int readReturn;
			while ((readReturn = fis.read()) != -1)
			{
				if (count >= startByte)
				{
					char readChar = (char) readReturn;
					if (readChar == c)
					{
						return count;
					}
				}
				count++;
			}

		} catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{
			try
			{
				fis.close();
			} catch (IOException e)
			{

				e.printStackTrace();
			}
		}
		return -1;
	}

	public static void main(String[] args)
	{
		File file = new File("file.txt");
		System.out.println(indexOf(file, 'a'));
	}
}
