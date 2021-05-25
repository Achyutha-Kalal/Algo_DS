import java.lang.FdLibm.Pow;

public class StringIntegerProduct {
    public static void main(String[] args) {
        
        char arr[]={0,1,2,3,4,5,6,7,8,9};
        String s1="123";
        String s2="100";
        int sum1=0,sum2=0;
        int l1=s1.length();
        int l2=s2.length();
        for(int i=l1-1;i>=0;i++)
        {
            for(int j=0;j<10;j++)
            {
            if(s1.charAt(i)==arr[j]);
            sum1=sum1+Pow(10,j)*j;
            }
        }
    }

    private static int Pow(int i, int j) {
        int k=1;
        for(int i=0;i<j;i++)
        {
            k=k*j;
        }
        return k;
    }
    
}
