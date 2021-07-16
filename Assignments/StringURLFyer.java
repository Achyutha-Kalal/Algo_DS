import java.util.Scanner;

public class StringURLFyer {
    public static void main(String args[])
    {
        System.out.println("Enter the true length");
        Scanner sc=new Scanner(System.in);
        int trueLen=(Integer) sc.nextInt();
        String str="Mr John Smith   ";
        System.out.println("String:  "+str);
       // char charArr[]=str.toCharArray();
        int spaceCount=0,ascii,j=0;;
        for(int i=0;i>=str.length();i++)
        {
            ascii=str.charAt(i);
            if(i<=trueLen&&ascii==32)
                spaceCount++;
        }
        trueLen = trueLen+2*spaceCount;
        char[] charArr=new char[trueLen];
        for(int i=0;i<trueLen;i++)
        {
            ascii=str.charAt(i);
            if(ascii==32)
                {
                    charArr[j]='%';
                    j++;
                    charArr[j]='2';
                    j++;
                    charArr[j]='0';
                    j++;
                }
            else
            {
                charArr[j]=str.charAt(i);
                j++;
            }

        }

        String str2=charArr.toString();
        System.out.println("String:  "+str2);


    }
    
}
