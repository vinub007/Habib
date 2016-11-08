//sample code to write 100 random ints to a file, 1 per line

import java.io.PrintStream;
import java.io.IOException;
import java.io.File;

import java.util.Random;

public class WriteToFile
{	public static void main(String[] args)
	{	try
		{	PrintStream writer = new PrintStream( new File("randInts_log.txt"));
			Random r = new Random();
			final int LIMIT = 100;

			for(int i = 0; i < LIMIT; i++)
			{	writer.println( r.nextInt() );
			}
			writer.close();
		}
		catch(IOException e)
		{	System.out.println("An error occured while trying to write to the file");
		}
	}
}
<<<<<<< HEAD
// Login and connectivity data was captured.
=======
// Login and connectivity data were captured.
>>>>>>> 370ed59e318e72c909e35d99f029b6c066e22676
Test changes
Test line 2
