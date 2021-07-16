import java.util.Scanner;
import java.util.Arrays;

//This Class finds if given two strings are permutation of one another or not
public class StringPermutationsFinder {
    public static String sortString(String str)
    {
        char tempArr[]=str.toCharArray();
        Arrays.sort(tempArr);
        return new String(tempArr);
    }
    //Solution without sort implementation
    public static boolean isPermutation(String str1,String str2)
    {
        boolean flag=true;
        if(str1.length()!=str2.length())
        {
            flag=false;
            return flag;
        }
        String temp1=sortString(str1);
        String temp2=sortString(str2);
        if(!temp1.equals(temp2))
        {
            flag=false;
            return flag;
        }
        return flag;
    }

    //Solution with ASCII value implementation 
    public static boolean isPermutationWithAscii(String str1,String str2)
    {
        boolean flag=true;
        if(str1.length()!=str2.length())
        {
            flag=false;
            return flag;
        }
        int[] charset=new int[128];
        Arrays.fill(charset, 0);

        for(int i=0;i<str1.length();i++)
        {
            int ascii = str1.charAt(i);
            charset[ascii]++;
        }
        for(int i=0;i<str2.length();i++)
        {
            int ascii = str2.charAt(i);
            charset[ascii]--;
        }
        for(int i=0;i<128;i++)
        {
            if(charset[i]!=0)
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
        System.out.println("Enter String 1");
        String str1=sc.nextLine();
        System.out.println("Enter String 2");
        String str2=sc.nextLine();
        if(isPermutation(str1,str2)==true)
            System.out.println("Both Strings are permutations of each other");
        else
            System.out.println("Both Strings are not permutations of each other");
        

            System.out.println("Using ASCII Value approach");
        if(isPermutationWithAscii(str1,str2)==true)
            System.out.println("Both Strings are permutations of each other");
        else
            System.out.println("Both Strings are not permutations of each other");
    }
    
}
