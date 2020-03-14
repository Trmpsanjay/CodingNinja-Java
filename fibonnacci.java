import java.util.*;
class fibonacci{
    int fibo(int y){
        if(y==0)
            return 0;
        else if(y==1)
            return y;
        else
            return fibo(y-1)+fibo(y-2);
    }
}

public class fibonnacci {


	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fibonacci f=new fibonacci();
        int ans1=f.fibo(n);
        System.out.println(ans1);
		
           /* Nth term of fibonacci series F(n) 
            is calculated using following formula -
            F(n) = F(n-1) + F(n-2),
		*/

		
	}

}
