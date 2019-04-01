//  Author: Tushar Jayanti
//  github: github/tusharjayanti

/*ArrayDeques: This class is likely to be faster than Stack when used as a stack, and faster than LinkedList when used as a queue.
    Source : Java Documentation: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayDeque.html   */
import java.io.*;
import java.util.*;

public class Solution {
    //Stack using an ArrayDeue
    ArrayDeque<Character> dequeasStack = new ArrayDeque<>();
    void pushCharacter(char ch)
    {
        dequeasStack.push(ch);
    }
    char popCharacter()
    {
        return (dequeasStack.pop());
    }

    //Queue using an ArrayDeque
    ArrayDeque<Character> dequeasQueue = new ArrayDeque<>();
    void enqueueCharacter(char ch)
    {
        dequeasQueue.add(ch);
    }
    char dequeueCharacter()
    {
        dequeasQueue.remove();
    }
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}