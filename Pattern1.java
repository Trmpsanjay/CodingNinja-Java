import java.util.*;
class Solution {

	public static void print(int n) {
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++)
                System.out.print("*");
            System.out.println();
        }
        /* Print the following pattern for the given number of rows.
            Pattern for N = 4
            ****
            ***
            **
            *
            Input format : N (Total no. of rows)

            Output format : Pattern in N lines

            Sample Input :
               5
            Sample Output :
            * * * * *
            * * * *  
            * * *
            * *
            *
		 */
  }
}
class Pattern1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        int row=sc.nextInt();
        s.print(row);
    }
}
