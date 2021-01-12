//	Author: Tushar Jayanti
//	github: github/tusharjayanti

import java.util.Scanner;
public class Solution { 
    
    public static void countApplesOranges(int s,int t, int a, int b, int[] app, int[] or ) {
        
        int appleInHouse = 0;
        int orangesinHouse = 0;

        for(int i=0;i<app.length;i++) {
            app[i] += a;
            if(app[i]>=s && app[i]<=t) {
                appleInHouse++;
            }
        }
        for(int i=0;i<or.length;i++) {
            or[i] += b;
            if(or[i]>=s && or[i]<=t) {
                orangesinHouse++;
            }
        }
        System.out.println(appleInHouse);
        System.out.println(orangesinHouse);

    }
    public static void main (String args[]) { 
        Scanner io = new Scanner(System.in);
        int s = io.nextInt();
        int t = io.nextInt();
        int a = io.nextInt();
        int b = io.nextInt();
        int m = io.nextInt();
        int apples[] = new int[m];
        int n = io.nextInt();
        int oranges[] = new int[n];
               
        for(int i=0;i<m;i++) {
                apples[i] = io.nextInt();     
        }
        
        for(int i=0;i<n;i++) {
                oranges[i] = io.nextInt();     
        }

        io.close();

        countApplesOranges(s, t, a, b, apples, oranges);    
  	}

}