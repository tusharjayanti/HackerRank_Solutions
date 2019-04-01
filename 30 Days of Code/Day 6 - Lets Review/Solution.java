//  Author: Tushar Jayanti
//  github: github/tusharjayanti

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner io = new Scanner(System.in);
        int n = io.nextInt();
        for(int i=0;i<n;i++)
        {      
            String s = io.next();
            PrintEvensOdds(s);
        }
        io.close();
    }


    private static void PrintEvensOdds(String str){
        StringBuffer even = new StringBuffer();
        StringBuffer odds = new StringBuffer();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(i%2==0){
                even.append(c);
            } else{
                odds.append(c);
            }
        }
        System.out.println(even + " " + odds);
    }
}

