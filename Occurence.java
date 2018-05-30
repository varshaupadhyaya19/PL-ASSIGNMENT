/*program to count the occurence of each character of a string*/
package occurence;

import java.util.Scanner;

class Occurence 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word or a sentence\n");
        String s = sc.nextLine();
        s = s.replace(" ", ""); /*to remove spaces so that they are not counted*/
        while(s.length()>0)
        {
            int i,count;
            
            count = 0;
            String s1 = "";
            for(i=0;i<s.length();i++)
            {
                if(s.charAt(0)==s.charAt(i))
                    count++;
                else
                    s1=s1+s.charAt(i);
         
            
            }
            System.out.println("Occurence of "+s.charAt(0)+" is "+count);
            s=s1;
        }
        
    }
   
}
