//	Author: Tushar Jayanti
//	github: github/tusharjayanti


import java.util.*;

public class Solution { 

	public static List<Integer> gradingStudents(List<Integer> grades) {
			

			for(int i=0;i<grades.size();i++) {

				int diff = 5-(grades.get(i)%5);
				
				if(grades.get(i)>=38 && diff<3) {

					 //diff = grades.get(i) + diff;
					 grades.set(i,grades.get(i) + diff);

				}
				
				}
				return grades;
			}
			
		

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        int n = io.nextInt();
        List<Integer> input = new ArrayList<>(n);
        for(int i=0;i<n;i++) {
        	input.add(io.nextInt());
        }
        io.close();
 
        gradingStudents(input);

        for(int i =0;i<n;i++) {
        	System.out.println(input.get(i));
        }

    }
}