import java.util.*;


class Solution {

    public static void print(int n) {
          int i,j;
        if(n%2==0)
            n=n+1;
        for(i=0;i<=(n/2)+1;i++){
            for(j=0;j<i;j++)
                System.out.print("*");
            System.out.println();
        }
        int p=n/2;
        for(i=p;i>0;i--){
            for(j=0;j<i;j++)
                System.out.print("*");
            System.out.println();
        }

                /*
                        Print the following pattern for the given number of rows.
                Pattern for N = 7
                *
                **
                ***
                ****
                ***
                **
                *
                Input format : N (Total no. of rows)

                Output format : Pattern in N lines

                Sample Input :
                5
                Sample Output :
                 *
                 **
                 ***
                 **
                 *
                 */

    }

}


class GalaxyOfStars{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        int row=sc.nextInt();
        s.print(row);
    }
}
