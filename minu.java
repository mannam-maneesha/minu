import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner in = new Scanner(System.in);
        int minutes = in.nextInt(); 
        int p1 = minutes % 60;
        int p2 = minutes / 60;
        System.out.print( p2 + " " + p1);	// your code goes here
	}
}
