/*program to capitalize alternate characters of a string*/
package alternate;

import java.util.Scanner;


public class Alternate 
{

    public static void main(String[] args) 
    {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a string\n");
        String s = a.nextLine();
        s=s.replace(" ","");/*to remove spaces*/
        
        int i;
        
        String w = "";
        
        for(i=0;i<s.length();i++)
        {
       
            char c = s.charAt(i);
            
            {
                    
            if(i%2==0)
                c=Character.toUpperCase(c);
            else
                c=Character.toLowerCase(c);
            }
            w = w+c;
        }
        System.out.println("The string is now\n"+w);
    }    
}
