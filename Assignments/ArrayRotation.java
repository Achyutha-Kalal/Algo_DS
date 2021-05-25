import java.util.Scanner;

public class ArrayRotation {
    public static void main(String args[])
    {
        System.out.println("Enter the Size of the array");
        Scanner sc= new Scanner(System.in); 
        int n=sc.nextInt();
        System.out.println("Enter the element of the array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }        
        System.out.println("Enter the number by which array needs to be rotated");
        int r=sc.nextInt();
        sc.close();
        int k=r%n;
        if(k!=0)
        {
            int tmp[]=new int[r%n];
            for(int i=0;i<k;i++)
            {
                tmp[i]=arr[i];
                arr[i]=arr[i+k];
            }
            for(int i=k,j=0;i<n&&j<k;i++,j++)
            {
                arr[i]=tmp[j];
            }
            
        }
        for (int el: arr)
        System.out.println(el);
        }
    
}
