import java.util.*;

class Solution {

    public static void print(int n) {

}        int k=0,j,i;
        for(i=n,k=0;i>0;i--,k++){
            for(j=0;j<i;j++){
                if(k%2==0)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();
        }
                    /* Print the following pattern for the given number of rows.
                    Pattern for N = 4
                    1111
                    000
                    11
                    0
                    Input format : N (Total no. of rows)

                    Output format : Pattern in N lines*/
    }

}

class BinaryPattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        int row=sc.nextInt();
        s.print(row);
    }
