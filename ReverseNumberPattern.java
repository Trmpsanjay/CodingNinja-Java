import java.util.*;


class Solution {

   public static void print(int n) {
        int i=0,j=0;
        int k=0;
        for(i=1;i<=n;i++){
            if(i%2==0)
                k=k+i-1;
            else
                k=k+i;
            for(j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print(k+" ");
                        k--;
                }
                else{
                    System.out.print(k+" ");
                        k++;
                }
            }
            System.out.println();
        }
             
        //Write your code here

    }
}


class ReverseNumberPattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        int row=sc.nextInt();
        s.print(row);
    }
}
