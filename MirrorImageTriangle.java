import java.util.*;


class Solution {

   public static void print(int n) {
         int i,k=0;
        for(i=0;i<=n;i++){
            k=-1*i;
            for(int j=0;j<=n+i;j++){
                if(i+j>=n){
                    System.out.print(Math.abs(k));
                    k++;
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        //Write your code here
                         /*
                                    Print the following pattern for the given number of rows.
                        Pattern for N = 2
                          0
                         101
                        21012
                        Input format : N (Total no. of rows)

                        Output format : Pattern in N lines

                        Sample Input :
                        6
                        Sample Output :
                              0
                             101
                            21012
                           3210123
                          432101234
                         54321012345
                        6543210123456
                        */

    }
}


class MirrorImageTriangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        int row=sc.nextInt();
        s.print(row);
    }
}
