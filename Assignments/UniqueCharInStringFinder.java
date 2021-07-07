//This class finds out whether a string has unique characters or not. There are two solutions one without using additional data structures
//and other is using array to find the ASCII character count similar to hash table approach
import java.util.Arrays;
import java.util.Scanner;

public class UniqueCharInStringFinder {
    //Solution without additional datastructure
    public static boolean findUniqueStringChar(String str)
    {
        boolean flag=true;
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
                {
                    if(str.charAt(i)==str.charAt(j))
                    {
                        flag=false;
                        break;
                    }
                }
                if(flag==false)
                    break;
        }
        return flag;
    }
    //Solution with additional datastructure
    public static boolean findUniqueStringCharWithHash(String str)
    {
        boolean flag=true;
        int[] charset=new int[128];
        
       Arrays.fill(charset,0);
        for(int i=0;i<str.length();i++)
        {
            int ascii = str.charAt(i);
            charset[ascii]++;
            if(charset[ascii]>1)
                {
                    flag=false;
                    break;
                }
        }
        return flag;
    }
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        boolean hasStringUniqueChar=findUniqueStringChar(str);
        hasStringUniqueChar=findUniqueStringCharWithHash(str);
        if(hasStringUniqueChar==true)
        {
            System.out.println("String has unique characters");
        }
        if(hasStringUniqueChar==false)
        {
            System.out.println("String doesnot have unique characters");
        }
    }
}
