//  Author: Tushar Jayanti
//  github: github/tusharjayanti


import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        /*Read and save input*/
        Scanner io = new Scanner(System.in);
        int size = io.nextInt();
        int[] arr = new int[size];
      	for(int i=0;i<size;i++){
      		arr[i]=io.nextInt();
      	}

      	for(int i=size-1;i>=0;i--)
      	{
      		System.out.print(arr[i]+" ");
      	}
        
         
    }
}