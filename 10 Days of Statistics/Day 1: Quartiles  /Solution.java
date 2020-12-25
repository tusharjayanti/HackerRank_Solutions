//	Author: Tushar Jayanti
//	github: github/tusharjayanti
// 10 Days of Statistics / Day 1: Quartiles

import java.util.Scanner;
import java.util.Arrays;

class Solution {

    public static int[] getConsoleInput() {
        Scanner io = new Scanner (System.in);
        int n = io.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = io.nextInt();
        }
        io.close();
        
        return  arr;
    }

    public static int getMedian(int[] arr, int start, int end) {
            
            if((end-start)%2==0) {       // odd number of elements in a zero indexed array
                return arr[(end+start)/2];
            }
            else {              // even number of elements
                int m1 = arr[(end+start)/2];
                int m2 = arr[(end+start)/2+1];
                return Math.round((m1+m2)/2);
            }
    }

    public static void main(String[] args) {
       
        int[] input = getConsoleInput();
        Arrays.sort(input);

        System.out.println(getMedian(input, 0,  (input.length-1)/2 - 1));
        System.out.println(getMedian(input, 0, input.length-1));
        System.out.println(getMedian(input, ((input.length-1)/2+1),  input.length-1));
        
    }
}