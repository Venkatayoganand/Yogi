/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{char c;
   Scanner s=new Scanner(System.in);
   c=s.next().charAt(0);
if(Character.isLetter(c))
 {
 	

 

if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
    System.out.println("vowel");

else 
   System.out.println("consonent");
		// your code goes here
	}
	System.out.println("Error");
	}
}