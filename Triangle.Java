import java.util.*;
class Solution {

    public static void print(int n) {
        for(int i=n;i>0;i--){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
                    for(int k=0;k<i;k++)
                        System.out.print("*");
            System.out.println();
        }
        //Write your code here

    }

}

class Triangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        int row=sc.nextInt();
        s.print(row);
    }
}
