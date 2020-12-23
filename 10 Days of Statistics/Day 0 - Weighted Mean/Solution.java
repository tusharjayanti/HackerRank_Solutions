//	Author: Tushar Jayanti
//	github: github/tusharjayanti

import java.util.Scanner;

public class Solution {
    
    private static float getWeightedMean(int[] input,int[] weight, int n) {
        float Wmean = 0;
        int deno = 0;
        for(int i=0;i<n;i++) {
            Wmean += input[i]*weight[i];
            deno += weight[i];
        }
        return Wmean/deno;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner io = new Scanner(System.in);
        int n = io.nextInt();
        int[] input = new int[n];
        int[] weights = new int[n];
        
        io.close();

        for(int i=0;i<n;i++) {
            input[i] = io.nextInt();
        }
        
        for(int i=0;i<n;i++) {
            weights[i] = io.nextInt();
        }
        
        System.out.println(getWeightedMean(input,weights,n));
        
        
    }
}

