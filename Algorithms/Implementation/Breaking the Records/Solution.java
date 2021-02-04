//    Author: Tushar Jayanti
//    github: github/tusharj

import java.util.Scanner;
import java.io.IOException;

public class Solution {

    public static int[] breakingRecords(int[] arr, int n) {
        int[] result = {0,0};
        int min,max,maxbreak,minbreak;
        min=arr[0];
        max =arr[0];
        maxbreak =0;
        minbreak =0;

        for(int i=0;i<n;i++) {
            if(arr[i]<min) {
                min = arr[i];
                minbreak++;
            }
            if(arr[i]>max) {
                max = arr[i];
                maxbreak++;
            }
        }
        result[0]=maxbreak;
        result[1]=minbreak;
        return result;
    }

    public static void printOp(int[] arr) {
        System.out.println(arr[0]+" "+arr[1]);
    }

    public static void main(String[] args) throws IOException {
        Scanner io = new Scanner(System.in);
        int n = io.nextInt();
        int[] scores = new int[n];
        for(int i=0;i<n;i++) {
            scores[i] = io.nextInt();
        }
        io.close();
        printOp(breakingRecords(scores,n));

    }
}

