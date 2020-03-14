import java.util.*;
public class 2ToNPrimeNumber {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=2;i<=num;i++){
				int flag=0;
		for(int j=2;j<i;j++){
			if(i%j==0){	
				flag=1;
				break;
			}
		}

		if(flag==0)
			System.out.println(i);
		}
		
		/* Given an integer N, print all the prime numbers
        that lies in between 2 to N (both inclusive).
        Print the prime numbers in different lines.
		*/

		
	}
}
