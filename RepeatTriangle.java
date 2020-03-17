import java.util.*;


class Solution {

   public static void print(int n) {
        int line,space,i,j;
        int p=n;
        for(line=0;line<=n;line++){
            for(space=0;space<line;space++)
                System.out.print(" ");
            int a=65;
            for(i=0;i<p;i++){
                System.out.print((char)a);
                a++;
            }
            int b=65+n-line-1;
            for(j=0;j<p;j++){
                System.out.print((char)b);
                b--;
            }
            System.out.println();
            p--;
        }
             
        //Write your code here

    }
}


class RepeatTriangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        int row=sc.nextInt();
        s.print(row);
    }
}
