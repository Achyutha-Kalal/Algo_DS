//Solution for hackerran challenge https://www.hackerrank.com/challenges/minimum-swaps-2/problem 

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinSwaps2 {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        
        int n=arr.length;
        int min_swaps=0;
        for(int i=0;i<n;i++)
        {
            int min=arr[i];
            int min_index=i;
            for(int j=i+1;j<n;j++)
            {
                if(min>arr[j])
                {
                    min=arr[j];
                    min_index=j;
                }
            }
            if(min_index!=i)
            {
                min_swaps++;
                int tmp=arr[i];
                arr[i]=arr[min_index];
                arr[min_index]=tmp;
            }
        }
        return min_swaps;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

