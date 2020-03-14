import java.util.*;
public class NumberPattern {


	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int val=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(val);
                val++;
            }
            
            val=i+1;
          	System.out.println();
        }
        
		
                     /* Print the following pattern
                Pattern for N = 4
                1
                23
                345
                4567
                Input Format :
                N (Total no. of rows)
                Output Format :
                Pattern in N lines
                Sample Input 1 :
                3
                Sample Output 1 :
                1
                23
                345
                        */

		
	}

}
